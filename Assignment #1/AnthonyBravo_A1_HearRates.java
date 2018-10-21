// Name: Anthony Bravo
// Assignment #1: Heart rates class
import java.time.LocalDate;
import java.time.Period;

public class AnthonyBravo_A1_HearRates {
    //Attributes
    private String firsName;
    private String lastName;
    private int year;
    private int month;
    private int day;


    //Constructor
    public AnthonyBravo_A1_HearRates(String firsName, String lastName, int year, int month, int day) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Set Methods
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDay(int day) {
        this.day = day;
    }

    //Get Methods
    public String getFirsName() {
        return firsName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    //Age method
    public int ageYears() {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today).getYears();
    }

    //Maximum heart rate method
    public int maximumHeartRate() {
        return (220-ageYears());
    }

    //Target heart rate method
    public double[] targetHeartRate() {
        int maximumHR = maximumHeartRate();
        double min = 0.5*maximumHR;
        double max = 0.85*maximumHR;

        //Min stored at [0] Max stored at [1]
        double[] target = {min,max};
        return  target;
    }

}

