package somePackage.exe5;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args){
        Scanner inc = new Scanner(System.in);
        int income;
        double taxPayable = 0;
        final double TAX_RATE_ABOVE20K=0.1;
        final double TAX_RATE_ABOVE40K=0.2;
        final double TAX_RATE_ABOVE60K=0.3;
        System.out.print("Enter the taxable income: ");
        income=inc.nextInt();
        if (income<20000){
            taxPayable=0;
        } else if(income <=40000){
            taxPayable=(income-20000)*0.1;
        } else if (income <=60000){
            taxPayable=(20000*0.1)+(income-40000)*0.2;
        } else {
            taxPayable=(20000*0.1)+(20000*0.2)+(income-60000)*0.3;
        }
        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
    }
}
