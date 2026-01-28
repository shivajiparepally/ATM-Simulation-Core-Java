package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {

    ATM atm = new ATM();

    ArrayList<String> ms = new ArrayList<>();
    @Override
    public void viewBalance() {
        System.out.println("AVAILABLE BALANCE IS : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(atm.getBalance()>=withdrawAmount) {
            ms.add(withdrawAmount+ " : AMOUNT WITHDRAWN!");
            System.out.println("COLLECT AMOUNT " + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        }
        else {
            System.out.println("INSUFFICIENT FUNDS !");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        ms.add(depositAmount+" : AMOUNT DEPOSITED!");
        System.out.println(depositAmount+" deposited successfully !!");
        atm.setBalance(depositAmount+atm.getBalance());
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        System.out.println("----- MINI STATEMENT -----");
        for (String transaction : ms) {
            System.out.println(transaction);
        }
    }

}
