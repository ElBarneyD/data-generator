package Controller;

import java.util.Scanner;

public class Controller_GenerateData {

    int[] tabData = new int[11];
    String[] tabModelData = new String[11];


    public void Menu_GenerateData() {

        int i_choice;

        Scanner sc = new Scanner(System.in);


                                                                                                                                        
        do {
            System.out.println("       -Menu Data-      ");
            System.out.println("************************");
            System.out.println("* 1. Generate          *");
            System.out.println("* 2 .Back              *");
            System.out.println("************************");
            System.out.println("Your choice ?");
            System.out.print("> ");
            i_choice = sc.nextInt();

            if (i_choice == 1) {
                Generate_Mix(); // generate
            }

        } while (i_choice != 2);
    }

    public void Generate_Mix() {

        int i_choice;
        int count = 0;

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

          /*  String lastName = "";
            if (i_choice == 1){
                tabModelData[count] = lastName;
            }
           */

            if (i_choice == 1 || i_choice == 2 || i_choice == 3 || i_choice == 4 || i_choice == 5 || i_choice == 6 || i_choice == 7 || i_choice == 8 || i_choice == 9 || i_choice == 10 || i_choice == 11) {
                tabData[count] = i_choice;
            } else if (i_choice == 12) {
                System.out.println("Selection confirmed");
                More_info();

            }
            System.out.println("[" + tabData[0] + "] [" + tabData[1] + "] [" + tabData[2] + "] [" + tabData[3] + "] [" + tabData[4] + "] [" + tabData[5] + "] [" + tabData[6] + "] [" + tabData[7] + "] [" + tabData[8] + "] [" + tabData[9] + "] [" + tabData[10] + "]");
            count++;
        } while (i_choice != 13);
    }


    public void More_info() {

        int count, count1, count2, count3, count4, count5, count6, count7, count8, count9, count10;

        Scanner sc = new Scanner(System.in);

        System.out.println("[" + tabData[0] + "] [" + tabData[1] + "] [" + tabData[2] + "] [" + tabData[3] + "] [" + tabData[4] + "] [" + tabData[5] + "] [" + tabData[6] + "] [" + tabData[7] + "] [" + tabData[8] + "] [" + tabData[9] + "] [" + tabData[10] + "]");
        // maj sql
        String tableName;
        System.out.println("What's the name of the table ?");
        System.out.print("> ");
        tableName = sc.nextLine();

        int from, to;

        System.out.println("How many lines do you want ?");
        System.out.println("From :");
        System.out.print("> ");
        from = sc.nextInt();

        System.out.println("To :");
        System.out.print("> ");
        to = sc.nextInt();


        count = 1;
        while (count <= 11) {

            if (tabData[0] == count && tabData[1] == 0 && tabData[2] == 0 && tabData[3] == 0 && tabData[4] == 0 && tabData[5] == 0 && tabData[6] == 0 && tabData[7] == 0 && tabData[8] == 0 && tabData[9] == 0 && tabData[10] == 0) {

                while (from <= to) {
                    System.out.println("INSERT INTO " + tableName + " VALUES (" + from + ", '" + tabData[0] + "');");

                    from++;
                }
            }
            count++;
        }

       /* count1 = 1;
        while (count1 <= 11){

            if (tabData[0] == count1 && tabData[1] == count1 && tabData[2] == 0 && tabData[3] == 0 && tabData[4] == 0 && tabData[5] == 0 && tabData[6] == 0 && tabData[7] == 0 && tabData[8] == 0 && tabData[9] == 0 && tabData[10] == 0) {

                for (int i = 0; i <= result; i++) {
                    System.out.println("INSERT INTO " + tableName + " VALUES (" + i + ", '" + tabData[0] + "');");
                }
            }
            count1++;
        */
    }

    }





