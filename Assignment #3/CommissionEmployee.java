//Anthony Bravo

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    //Constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName,lastName,socialSecurityNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    //Setter Methods
    public void setGrossSales(double grossSales) {
        if(grossSales >= 0.0) {
            this.grossSales = grossSales;
        }
        else {
            throw new IllegalArgumentException("Gross sales can't be negative");
        }
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate > 0.0 && commissionRate < 1.0) {
            this.commissionRate = commissionRate;
        }
        else {
            throw new IllegalArgumentException("Commission rate must be between (0,1)");
        }
    }

    //Getter Methods
    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    //Override Methods
    @Override
    public double getPaymentAmount() {
        return (getGrossSales()*getCommissionRate());
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f\n%s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate() );
    }
}
