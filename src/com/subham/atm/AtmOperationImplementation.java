package com.subham.atm;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplementation implements AtmOperationInterface{
    ATM atm = new ATM();
    Map<Double,String> ministatement = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: "+atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {

        if(withdrawAmount<= atm.getBalance()) {
            ministatement.put(withdrawAmount," Amount Withdrawn");
            System.out.println("Collect the Cash " + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();

        }
        else{
            System.out.println("Insufficient Balance!!");
        }
    }

    @Override
    public void depositeAmount(double depositeAmount) {
        ministatement.put(depositeAmount," Amount Deposited");
        System.out.println(depositeAmount+" Deposited Successfully!!");
        atm.setBalance(atm.getBalance()+depositeAmount);
        viewBalance();
    }

    @Override
    public void viewMinistatement() {
        for(Map.Entry<Double,String> m:ministatement.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
