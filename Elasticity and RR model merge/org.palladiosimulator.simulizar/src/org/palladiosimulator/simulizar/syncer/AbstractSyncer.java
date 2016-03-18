package org.palladiosimulator.simulizar.syncer;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.palladiosimulator.simulizar.runtimestate.SimuLizarRuntimeStateAbstract;

public abstract class AbstractSyncer<T extends EObject> implements IModelSyncer {

    private static final Logger LOGGER = Logger.getLogger(AbstractSyncer.class);

    protected final SimuLizarRuntimeStateAbstract runtimeModel;
    protected final T model;

    private final EContentAdapter adapter;

    /**
     * @param simuComModel
     */
    protected AbstractSyncer(final SimuLizarRuntimeStateAbstract simuComModel, final T model) {
        super();
        this.runtimeModel = simuComModel;
        this.model = model;
        this.adapter = new EContentAdapter() {

            @Override
            public void notifyChanged(final Notification notification) {
                super.notifyChanged(notification);
                if (!(notification.getEventType() == Notification.REMOVING_ADAPTER
                        || notification.getEventType() == Notification.RESOLVE)) {
                    LOGGER.debug(model.eClass().getName() + " changed by reconfiguration - Resync simulation entities: "
                            + notification);

                    try {
                        AbstractSyncer.this.synchronizeSimulationEntities(notification);
                    } catch (final Exception e) {
                        LOGGER.error("Sync Exception: " + e);
                    }
                }
            }

        };
        model.eAdapters().add(this.adapter);
    }

    protected abstract void synchronizeSimulationEntities(final Notification notification);

    /*
     * (non-Javadoc)
     *
     * @see org.palladiosimulator.simulizar.syncer.IModelSyncer#stopSyncer()
     */
    @Override
    public void stopSyncer() {
        this.model.eAdapters().remove(this.adapter);
    }

}