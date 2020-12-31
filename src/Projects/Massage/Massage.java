package Projects.Massage;

import java.util.ArrayList;
import java.util.Scanner;

public class Massage {
    static double price;
    static double distance;
    public static void main(String[] args) {
        double totalRevenue=0;
        double totalMileageCost=0;
        ArrayList<Double> treatmentPrices = new ArrayList<Double>();
        ArrayList<Double> distances = new ArrayList<Double>();
        Scanner p =new Scanner(System.in);
        System.out.println("Enter price charged for therapy or enter '-1' once finished: ");
        while (price!=-1) {
            price = p.nextDouble();
            treatmentPrices.add(price);
        }

        System.out.println("Enter round trip distance or enter '-1' once finished: ");
        while (distance!=-1) {
            distance = p.nextDouble();
            distances.add(distance);
        }

        System.out.println(treatmentPrices);
        System.out.println(distances);

        for (int i=0 ; i<distances.size()-1; i++){
            totalRevenue+=distances.get(i);
        }

        for (int k=0; k<distances.size()-1; k++){
            totalMileageCost+=distances.get(k)*0.45;
        }

        double profit=totalRevenue-totalMileageCost;
        System.out.println("Total Profit this tax year is: " + profit +" Tax payable is: " + 0.2*profit);
    }
}
