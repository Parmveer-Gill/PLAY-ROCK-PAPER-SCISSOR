import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ENTER 0 FOR ROCK , 1 FOR PAPER , 2 FOR SCISSOR");
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        if (userinput>2){
            System.out.println("Wrong Number");
            return;
        }


        Random number = new Random();
        int comp_input = number.nextInt(3);//means 3 ya 3  ton vdd ni jaoga random no.
        System.out.println( "COMPUTER NUMBER :  " + comp_input);

        if (userinput == comp_input){
            System.out.println("Game Draw");
        } // user winning case
        else if (userinput == 0 && comp_input==2 || userinput==1 && comp_input == 0 || userinput==2 && comp_input==1) {
            System.out.println("You Win");
        }
        else {
            System.out.println("Computer win");
        }

    }
}