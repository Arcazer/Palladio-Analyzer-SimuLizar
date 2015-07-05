package org.palladiosimulator.simulizar.interpreter.listener;

import org.palladiosimulator.simulizar.reconfiguration.IReconfigurationListener;

import de.uka.ipd.sdq.simulation.abstractsimengine.ISimulationControl;

/**
 * Class to notify that an reconfiguration event terminated.
 * 
 * @see IReconfigurationListener#endReconfigurationEvent(EndReconfigurationEvent)
 * @author Florian Rosenthal
 *
 */
public final class EndReconfigurationEvent extends ReconfigurationEvent {

    private final EventResult result;

    /**
     * Initializes a new instance with the given parameters.
     * 
     * @param result
     *            An {@link EventType} constant to denote the result of the reconfiguration.
     * @param simulationTime
     *            A double to denote the simulation time.
     */
    public EndReconfigurationEvent(EventResult result, double simulationTime) {
        super(EventType.END, simulationTime);
        this.result = result;
    }

    /**
     * Initializes a new instance with the given parameters.
     * 
     * @param result
     *            An {@link EventType} constant to denote the result of the reconfiguration.
     * @param simulationControl
     *            The {@link ISimulationControl} that is used in the current simulation run.
     */
    public EndReconfigurationEvent(EventResult result, ISimulationControl simulationControl) {
        this(result, simulationControl.getCurrentSimulationTime());
    }

    /**
     * Gets the result of the finished reconfiguration event.
     * 
     * @return An {@link EventType} constant which the result of the reconfiguration.
     */
    public EventResult getReconfigurationEventResult() {
        return this.result;
    }
}