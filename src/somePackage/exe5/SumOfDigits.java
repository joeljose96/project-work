package somePackage.exe5;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        int input;
        int sumDigit;
        int sum=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        input=inp.nextInt();
        int digit=input%10;
        sum+=digit;
        while (input>0){
            input=input/10;
            digit=input%10;
            sum+=digit;
        }
        System.out.print("The sum of all digits is: "+ sum);

    }
}
