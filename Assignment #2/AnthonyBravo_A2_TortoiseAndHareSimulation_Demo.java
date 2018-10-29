//Anthony Bravo
//Cs 221 Assignment #2

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class AnthonyBravo_A2_TortoiseAndHareSimulation_Demo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int NUMBER_OF_SQUARES = 75;
        boolean restart = true;

        do {
            //Play the game at least once
            playGame(NUMBER_OF_SQUARES);
            System.out.print("Enter elected number of squares (-1 to stop): ");
            NUMBER_OF_SQUARES = input.nextInt();
            if(NUMBER_OF_SQUARES==-1)
                restart = false;
            clearScreen();

        }while(restart);

    }

    public static void playGame(int squares) {
        // Making a tortoise and hare for the race
        AnthonyBravo_A2_Tortoise tortoise = new AnthonyBravo_A2_Tortoise(squares);
        AnthonyBravo_A2_Hare hare = new AnthonyBravo_A2_Hare(squares);

        Random generator = new Random();
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");


        // Loop while they are both at positions < Number_of_squares
        while (!tortoise.isWinner() && !hare.isWinner()) {
            //Displaying their position
            displayPosition(tortoise,hare,squares);

            //Tortoise's Move
            int tortoise_num = generator.nextInt(10) + 1;
            tortoise.nexMove(tortoise_num);

            //Hare's Move
            int hare_num = generator.nextInt(10) + 1;
            hare.nexMove(hare_num);

            //Wait 1 second
            //Uncomment method if user wants to wait 1 tick of a second per loop
            //tickOneSecond();

        }

        if (tortoise.isWinner() && hare.isWinner())
            System.out.println("It's a tie");
        else if (tortoise.isWinner())
            System.out.println("TORTOISE WINS!!! YAY!!!");
        else
            System.out.println("Hare wins. Yuch.");
    }


    public static void displayPosition(AnthonyBravo_A2_Tortoise t, AnthonyBravo_A2_Hare h, int numOfSquares) {
        int size = numOfSquares + 10;
        //sometimes ouch!! will display towards the end of the race @ numOfSquares
        // We want to make sure we have enough room to display it=> size = numOfSquares + 10
        char[] chars = new char[size];

        Arrays.fill(chars, ' ');

        //When they are at the same position
        if(t.getPosition() == h.getPosition()) {
            char[] message = {'O','U','C','H','!','!','!' };
            for(int i=0; i<=6; i++)
                chars[t.getPosition()+i] = message[i];
        }
        else {
            chars[t.getPosition()] = 'T';
            chars[h.getPosition()] = 'H';
        }
        String text = new String(chars);
        System.out.println(text);
    }

    public static void clearScreen() {
        //Separating from last output, 30 blank lines
        for(int i=0;i<30;i++)
            System.out.println();
    }

    public static void tickOneSecond() {
        try {
            Thread.sleep(1000); //1 Second
        }
        catch(InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

}


