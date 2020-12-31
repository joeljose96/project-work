package somePackage.exe5;

import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args){
        final double SALES_TAX_RATE=0.07;
        final int SENTINEL=-1;
        double taxInclusivePrice, actualPrice, salesTax, sum, actualPriceSum, taxSum;
        sum=0;
        actualPriceSum=0;
        taxSum=0;
        Scanner price =new Scanner(System.in);
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        taxInclusivePrice=price.nextDouble();
        while (taxInclusivePrice!=SENTINEL){
            actualPrice=taxInclusivePrice/(1+SALES_TAX_RATE);
            salesTax=taxInclusivePrice-actualPrice;
            sum+=taxInclusivePrice;
            actualPriceSum+=actualPrice;
            taxSum+=salesTax;
            System.out.printf("Actual price is: %.2f%n",actualPrice);
            System.out.printf(" Sales Tax is: %.2f%n", salesTax);
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            taxInclusivePrice=price.nextDouble();
        }
        System.out.printf("Total price is: %.2f%n",sum);
        System.out.printf("Total actual price is: %.2f%n",actualPriceSum);
        System.out.printf("Total sales tax is: %.2f%n",taxSum);

        }

    }

