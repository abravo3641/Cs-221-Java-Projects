//Anthony Bravo

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    //Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        setBaseSalary(baseSalary);
    }

    //Setter Methods
    public void setBaseSalary(double baseSalary) {
        if(baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
        else {
            throw new IllegalArgumentException("Base Salary must not be negative");
        }
    }

    //Getter Methods
    public double getBaseSalary() {
        return baseSalary;
    }

    //Override Methods
    @Override
    public double getPaymentAmount() {
        return ( getBaseSalary() + super.getPaymentAmount() );
    }

    @Override
    public String toString() {
        return String.format("%s %s \n%s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}
