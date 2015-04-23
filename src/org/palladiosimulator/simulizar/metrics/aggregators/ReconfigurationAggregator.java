package org.palladiosimulator.simulizar.metrics.aggregators;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.listener.IMeasurementSourceListener;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.probeframework.calculator.Calculator;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.metrics.PRMRecorder;

/**
 * @author Matthias
 * 
 */
public class ReconfigurationAggregator extends PRMRecorder implements IMeasurementSourceListener {

    public ReconfigurationAggregator(final RuntimeMeasurementModel prmAccess,
            final MeasurementSpecification measurementSpecification, final Calculator responseTimeCalculator,
            final String measurementId, final MeasuringPoint measuringPoint, final double baseSimulationTime) {
        super(prmAccess, measurementSpecification, measuringPoint);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void preUnregister() {
        // TODO Auto-generated method stub

    }

    @Override
    public void newMeasurementAvailable(MeasuringValue measurement) {
        // TODO Auto-generated method stub

    }

}
