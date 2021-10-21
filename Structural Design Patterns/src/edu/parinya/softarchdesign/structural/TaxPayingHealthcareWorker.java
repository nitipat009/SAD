package edu.parinya.softarchdesign.structural;
public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator {

    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate " + this.getName() + " with TaxPaying.");
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.1;
    }
}
