package edu.parinya.softarchdesign.structural;
import java.util.Date;
public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator  {

    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate " + this.getName() + " with TimeLogging.");
    }
    @Override
    public void service() {
        System.out.print(new Date() + ": ");
        this.worker.service();
    }
}
