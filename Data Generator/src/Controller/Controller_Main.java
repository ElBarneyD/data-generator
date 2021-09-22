package Controller;

import java.util.Scanner;

public class Controller_Main {

    public static void main (String[] args){

            int i_choice;

            Scanner sc = new Scanner(System.in);

            Controller_CreateData CCD = new Controller_CreateData();
            Controller_GenerateData CGD = new Controller_GenerateData();

            do {
                System.out.println("    -Global Menu-   ");
                System.out.println("********************");
                System.out.println("* 1. Create Data   *");
                System.out.println("* 2. Generate Data *");
                System.out.println("* 3 Quit           *");
                System.out.println("********************");
                System.out.println(" Your choice ?");
                System.out.print("> ");
                i_choice = sc.nextInt();


                switch (i_choice) {
                    case 1 -> CCD.Menu_CreateData();
                    case 2 -> CGD.Menu_GenerateData();
                    case 3 -> System.out.println("Bye bye...");
                    default -> System.out.println("Wrong choice, please try again...\n");
                }

            } while (i_choice != 3);
    }
}
