//Anthony Bravo

public class SalariedEmployee extends  Employee {

    private double weeklySalary;

    //Constructor
    public SalariedEmployee(String firstName,String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName,lastName,socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }

    //Setter methods
    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary >= 0) {
            this.weeklySalary = weeklySalary;
        }
        else {
            throw new IllegalArgumentException("Weekly Salary can't be negative");
        }
    }

    //Getter methods
    public double getWeeklySalary() {
        return weeklySalary;
    }

    //Override methods
    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary() );
    }
}
