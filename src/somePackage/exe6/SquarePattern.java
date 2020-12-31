package somePackage.exe6;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size;
        System.out.print("Enter the size: ");
        size=inp.nextInt();
        for(int row=1; row<=size; row++){
            for(int col=1; col<=size; col++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
