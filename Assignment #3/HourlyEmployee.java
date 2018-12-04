//Anthony Bravo

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName,lastName,socialSecurityNumber);
        setWage(wage);
        setHours(hours);
    }

    //Setter methods
    public void setWage(double wage) {
        if(wage >= 0) {
            this.wage = wage;
        }
        else {
            throw new IllegalArgumentException("Hourly wage can't be negative");
        }
    }

    public void setHours(double hours) {
        if(hours >= 0 && hours <= 168.0) {
            this.hours = hours;
        }
        else {
            throw new IllegalArgumentException("Hours must be between [0,168]");
        }
    }

    //Getter methods
    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    //Override Methods
    @Override
    public double getPaymentAmount() {
        //Regular hours
        if(getHours()<=40){
            return getWage()*getHours();
        }
        //Regular hours + Overtime
        else{
            return (40*getWage())+((getHours()-40)*getWage()*1.5);
        }
    }

    @Override
    public String toString() {
        return String.format( "hourly employee: %s\n%s: $%,.2f \n%s: %,.2f",
                super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }
}
