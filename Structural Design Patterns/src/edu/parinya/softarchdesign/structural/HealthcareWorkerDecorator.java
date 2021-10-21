package edu.parinya.softarchdesign.structural;
import java.util.Date;
public abstract class HealthcareWorkerDecorator extends HealthcareWorker {

    protected HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
        this.worker = worker;
    }

    @Override
    public void service() {
        worker.service();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    
    
}
