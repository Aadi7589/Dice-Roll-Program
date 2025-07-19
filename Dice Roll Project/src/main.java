import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //Dice Roll Program

        //Variables
        int numOfDice = 0;
        int total = 0;

        //No of dice
            System.out.print("Enter # of Dice you want to roll: ");
            numOfDice = scanner.nextInt();

            //Dice Roll and total
        if(numOfDice > 0) {
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                Die(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Your total is: "+ total);

        }
        else{
            System.out.println("No of dice must be greater than 0");
        }
    }
    //Print dice
    static void Die(int roll){
        String Dice1 = """
                   -------
                |          |
                |     ●    |
                |          |
                   -------
                """;
        String Dice2 = """
                   -------
                |  ●        |
                |           |
                |         ● |
                   -------
                """;
        String Dice3 = """
                   -------
                |  ●        |
                |     ●     |
                |        ●  |
                   -------
                """;
        String Dice4 = """
                   -------
                |  ●      ●  |
                |            |
                |  ●      ●  |
                   -------
                """;
        String Dice5 = """
                   -------
                |  ●      ●  |
                |      ●     |
                |  ●      ●  |
                   -------
                """;
        String Dice6 = """
                   -------
                |  ●      ●  |
                |  ●      ●  |
                |  ●      ●  |
                   -------
                """;
                switch(roll){
                    case 1 -> System.out.println(Dice1);
                    case 2 -> System.out.println(Dice2);
                    case 3 -> System.out.println(Dice3);
                    case 4 -> System.out.println(Dice4);
                    case 5 -> System.out.println(Dice5);
                    case 6 -> System.out.println(Dice6);
                    default -> System.out.println("Invalid Dice");
                }
    }
}
