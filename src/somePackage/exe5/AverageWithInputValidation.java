package somePackage.exe5;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args){
        Scanner integer= new Scanner(System.in);
        final int NUM_STUDENTS=3;
        int input;
        boolean isValid;
        int sum=0;
        double average;
        for (int studentNo=1; studentNo<=NUM_STUDENTS;studentNo++) {
            isValid = false;
            do {
                System.out.print("Enter a number between 0-10 or 90-100: ");
                input = integer.nextInt();
                if ((input >= 0 && input <= 10) || (input >= 90 && input <= 100)) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
        }
    }
}
