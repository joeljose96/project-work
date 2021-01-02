package Projects.InvestmentCalculator;

import java.util.Random;
import java.util.Scanner;

public class InvestmentReturn {
    static int initalAmount;
    public static final int WORKING_DAYS_IN_YEAR = 250;
    public static double marketReturns;
    public static int yearsInvested;
    static int monthlyAmount;


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random r=new Random();
        double multiplier;
        System.out.println("Welcome to Investment calculator");
        System.out.print("Enter initial investment amount: £");
        initalAmount=scanner.nextInt();
        double currentValue=initalAmount;
        System.out.print("Enter how many years would you like to invest for: ");
        yearsInvested=scanner.nextInt();
        System.out.println("How much would you like to add monthly: ");
        monthlyAmount=scanner.nextInt();
        for (int i=1; i<=yearsInvested; i++){
            int day=1;
            do {
                marketReturns=r.nextGaussian()/100;
                multiplier=1+marketReturns;
                if (day%20==0){
                    currentValue+=monthlyAmount;
                }
                currentValue=currentValue*multiplier;
                day++;
            } while (day<=250);
            System.out.println("Investment value after "+i + " years is £"+currentValue);
        }
        System.out.println();
        System.out.println("Final value of investment after "+ yearsInvested + " is "+ currentValue);
    }
}
