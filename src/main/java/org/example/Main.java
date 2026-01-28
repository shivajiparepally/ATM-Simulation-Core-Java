package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ATM at = new ATM();
        AtmOperationInterf ati = new AtmOperationImpl();
        int atmNmber = 12345;
        int atmPin = 12345;
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO ATM MACHINE !!");
        System.out.println("ENTER ATM NUMBER");
        int atmNumber1 = sc.nextInt();
        System.out.println("ENTER ATM PIN");
        int atmPin1 = sc.nextInt();
        ;
        if ((atmNmber == atmNumber1) && (atmPin == atmPin1)) {
            //System.out.println("Validated!!");
            while (true) {
                System.out.println("\n\n\n" +
                        "1.VIEW AVAILABLE BALANCE\n" +
                        "2.WITHDRAW AMOUNT\n" +
                        "3.DEPOSIT AMOUNT\n" +
                        "4.VIEW MINI STATEMENT\n" +
                        "5.EXIT");
                System.out.println("ENTER THE CHOICE NUMBER");
                int ch = sc.nextInt();
                System.out.println("\n\n");
                if (ch == 1) {
                    ati.viewBalance();
                } else if (ch == 2) {
                    System.out.println("ENTER AMOUNT TO WITHDRAW :");
                    double withdrawAmount = sc.nextDouble();
                    ati.withdrawAmount(withdrawAmount);
                } else if (ch == 3) {
                    System.out.println("ENTER AMOUNT TO DEPOSIT :");
                    double depositAmount = sc.nextDouble();
                    ati.depositAmount(depositAmount);

                } else if (ch == 4) {

                    ati.viewMiniStatement();

                } else if (ch == 5) {
                    System.out.println("COLLECT YOUR CARD \n" +
                            "THANK YOU !!");
                    System.exit(0);
                } else {
                    System.out.println("PLEASE CHOOSE CORRECT OPTION !!");
                }

            }


        } else {
            System.out.println("Incorrect Details !!");
            System.exit(0);
        }

    }
}
