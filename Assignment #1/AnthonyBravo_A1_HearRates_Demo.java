// Name: Anthony Bravo
// Assignment #1: Heart Rates demo
import java.util.Scanner;

public class AnthonyBravo_A1_HearRates_Demo {
    public static void main(String[] args) {
        String firstName, lastName;
        int month,day,year;
        Scanner scanner = new Scanner(System.in);

        //Prompting Information
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter month of birth: ");
        month = scanner.nextInt();
        System.out.print("Enter day of birth: ");
        day = scanner.nextInt();
        System.out.print("Enter year of birth: ");
        year = scanner.nextInt();

        AnthonyBravo_A1_HearRates person = new AnthonyBravo_A1_HearRates(firstName,lastName,year,month,day);

        //Printing Information
        System.out.print("\nReport:");
        System.out.printf("\n%s: %s %s \n%s: %d/%d/%d \n%s: %d \n%s: %d \n%s: %.2f to %.2f \n",
                "Full name",person.getFirsName(),person.getLastName(),
                "Date of birth",person.getMonth(),person.getDay(),person.getYear(),
                "Age",person.ageYears(),
                "Maximum hear rate",person.maximumHeartRate(),
                "Target heart rate range",person.targetHeartRate()[0],person.targetHeartRate()[1]
        );

    }
}
