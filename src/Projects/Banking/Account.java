package Projects.Banking;

import java.util.Scanner;

public class Account {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    Account(String customerName, String customerId){
        this.customerName=customerName;
        this.customerId=customerId;
    }

    public void deposit(int amount){
        balance+=amount;
        previousTransaction=amount;
    }

    public void withdraw(int amount){
        if (balance>=amount){
            balance-=amount;
            previousTransaction=-amount;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction>0){
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction<0){
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occured");
        }
    }

    void calculateInterest(int years){
        double interestRate=0.067;
        double newBalance=balance*Math.pow((1+interestRate),years);
        System.out.println("Current interest rate is "+ interestRate*100+"%");
        System.out.println("After " + years + " the new balance will be "+newBalance);
    }

    void showMenu(){
        char option='\0';
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome "+ customerName);
        System.out.println("Your ID is "+ customerId);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A - Check balance");
        System.out.println("B - Make a deposit");
        System.out.println("C - Make a withdrawal");
        System.out.println("D - View Previous Transaction");
        System.out.println("E - Calculate interest");
        System.out.println("F - Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1=scanner.next().charAt(0);
            option=Character.toUpperCase(option1);
            System.out.println();

            switch (option){
                //Switch case example here shows if option='A' do the following
                case 'A':
                    System.out.println();
                    System.out.println("Balance is "+balance);
                    System.out.println();
                    break;
                case 'B':
                    System.out.println();
                    System.out.println("How much would you like to deposit: ");
                    int depositAmount=scanner.nextInt();
                    deposit(depositAmount);
                    System.out.println("new balance is " + balance);
                    break;
                case 'C':
                    System.out.println();
                    System.out.println("How much would you like to withdraw: ");
                    int withdrawalAmount=scanner.nextInt();
                    withdraw(withdrawalAmount);
                    System.out.println("new balance is "+balance);
                    break;
                case 'D':
                    System.out.println();
                    getPreviousTransaction();
                    break;
                case 'E':
                    System.out.println();
                    System.out.println("how many years would you like to deposit for: ");
                    int depositYears=scanner.nextInt();
                    calculateInterest(depositYears);
                    break;
                case 'F':
                    System.out.println();
                    System.out.println("Exiting, Goodbye.");
                    break;
                default:
                    System.out.println("Invalid option, please enter a valid option");
            }
        } while (option!='F');
        System.out.println("Thanks for banking with us");
    }
}
