package Controller;

import java.util.Scanner;

public class Controller_GenerateData {


    public void Menu_GenerateData(){

        int i_choice;

        Scanner sc = new Scanner(System.in);


                                                                                                                                        
        do {
            System.out.println("       -Menu Data-      ");
            System.out.println("************************");
            System.out.println("* 1. Generate Mix      *");
            System.out.println("* 2. Generate specific *");
            System.out.println("* 3 .Back              *");
            System.out.println("************************");
            System.out.println("Your choice ?");
            System.out.print("> ");
            i_choice = sc.nextInt();

            if (i_choice == 1){
                Generate_Mix();
            }
            else if (i_choice == 2){
                Generate_Specific();
            }

        } while (i_choice != 3);
    }

    private void Generate_Mix() {

        int i_choice;
        int count = 0;
        int [] tabData = new int [11];
        String [] tabModelData = new String[11];

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("  Which type of data do you want to add ? ");
            System.out.println("******************************************");
            System.out.println("*  1.  Last name                         *");
            System.out.println("*  2.  First name                        *");
            System.out.println("*  3.  Address                           *");
            System.out.println("*  4.  Postal code                       *");
            System.out.println("*  5.  Locality                          *");
            System.out.println("*  6.  Country                           *");
            System.out.println("*  7.  Phone number                      *");
            System.out.println("*  8.  Mail                              *");
            System.out.println("*  9.  Profession                        *");
            System.out.println("*  10. Date                              *");
            System.out.println("*  11. Recent nate                       *");
            System.out.println("*  12. Confirm                           *");
            System.out.println("*  13. Back to data menu                 *");
            System.out.println("******************************************");
            System.out.println("Your choice ?");
            System.out.print("> ");
            i_choice = sc.nextInt();

            if (i_choice == 1 || i_choice == 2 || i_choice == 3 || i_choice == 4 || i_choice == 5 || i_choice == 6 || i_choice == 7 || i_choice == 8 || i_choice == 9 || i_choice == 10 || i_choice == 11){
                tabData[count] = i_choice;
            }
            String lastName;
            if (tabData[count] == 1){
                // en test tabModelData[count] = lastName;
            }
            else if (i_choice == 12){
                System.out.println("Selection confirmed");
                More_info();

            }
            System.out.println("[" + tabData[0] + "] [" + tabData[1] + "] [" + tabData[2] + "] [" + tabData[3] + "] [" + tabData[4] + "] [" + tabData[5] + "] [" + tabData[6] + "] [" + tabData[7] + "] [" + tabData[8] + "] [" + tabData[9] + "] [" + tabData[10] + "]");
            count++;
        } while (i_choice != 13);
    }

    private void Generate_Specific() {

        int i_choice;
        int [] tabData = new int [11];

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("     Which type of data do you want ?     ");
            System.out.println("******************************************");
            System.out.println("*  1.  Last Name                         *");
            System.out.println("*  2.  First Name                        *");
            System.out.println("*  3.  Address                           *");
            System.out.println("*  4.  Postal code                       *");
            System.out.println("*  5.  Locality                          *");
            System.out.println("*  6.  Country                           *");
            System.out.println("*  7.  Phone Number                      *");
            System.out.println("*  8.  Mail                              *");
            System.out.println("*  9.  Profession                        *");
            System.out.println("*  10. Date                              *");
            System.out.println("*  11. Recent Date                       *");
            System.out.println("*  12. Confirm                           *");
            System.out.println("******************************************");
            System.out.println("Your choice ?");
            System.out.print("> ");
            i_choice = sc.nextInt();

            if (i_choice == 1 || i_choice == 2 || i_choice == 3 || i_choice == 4 || i_choice == 5 || i_choice == 6 || i_choice == 7 || i_choice == 8 || i_choice == 9 || i_choice == 10 || i_choice == 11){
                tabData[0] = i_choice;
            }
            else if (i_choice == 12){
                System.out.println("Selection confirmed");
                More_info();

            }
            System.out.println("[" + tabData[0] + "]");


        } while (i_choice != 12);
    }

    public void More_info(){

        Scanner sc = new Scanner(System.in);

        String tableName;
        System.out.println("What's the name of the table ?");
        System.out.print("> ");
        tableName = sc.nextLine();

        int result;
        System.out.println("How many lines do you want ?");
        System.out.print("> ");
        result = sc.nextInt();



        for (int i = 0; i <= result; i++){
            System.out.println("INSERT INTO " + tableName + " VALUES (" + i + ", '...');");
        }



    }




}
