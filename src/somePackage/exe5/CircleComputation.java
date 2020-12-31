package somePackage.exe5;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter, area, circumfrence;
        Scanner radiusInput = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius=radiusInput.nextDouble();
        diameter=2*radius;
        circumfrence=Math.PI*diameter;
        area=Math.PI*radius*radius;
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumfrence is: %.2f%n", circumfrence);
        System.out.printf("Area is: %.2f%n", area);
        //The following is computation for a sphere:
        double surfaceArea, volume;
        surfaceArea=4*Math.PI*radius*radius;
        volume=(4/3)*Math.PI*radius*radius;
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}