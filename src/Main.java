import com.subham.atm.AtmOperationImplementation;
import com.subham.atm.AtmOperationInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AtmOperationInterface op = new AtmOperationImplementation();
        int atmnumber=12345;
        int atmpin=9876;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine..");
        System.out.print("Enter ATM Number: ");
        int atmNumber = sc.nextInt();

        System.out.print("Enter ATM Pin: ");
        int atmPin = sc.nextInt();

        if((atmnumber==atmNumber) && (atmpin==atmPin)){
            while(true) {
                System.out.println("1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposite Amount");
                System.out.println("4. View Ministatement");
                System.out.println("5. Exit");

                System.out.print("Enter Choice: ");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1: op.viewBalance();
                    break;
                    case 2:
                        System.out.println("Enter Withdraw Amount: ");
                        double withdrawAmount = sc.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                    break;
                    case 3:
                        System.out.print("Enter Amount to Deposite: ");
                        double depositeAmount = sc.nextDouble();
                        op.depositeAmount(depositeAmount);
                        break;
                    case 4:op.viewMinistatement();
                    break;

                    case 5:
                        System.out.println("Collect your ATM card \nThank You for using ATM Machine..");

                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please Enter the correct choice");
                        break;

                }


            }
        }
        else{
            System.out.println("Incorrect ATM Pin or Number");
            System.exit(0);
        }

        //System.out.println("Hello world!");
    }
}