package Projects.Massage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class MassageWithHashMap {
    static double price;
    static double distance;
    static int invoiceNum;
    public static void main(String[] args) {
        double totalRevenue=0;
        double totalMileageCost=0;
        double totalProfit;
        int invId;
        LinkedHashMap<Integer, Double> treatments =new LinkedHashMap<>();

        ArrayList<Integer> invoices= new ArrayList<>();
        ArrayList<Double> treatmentPrices = new ArrayList<>();
        ArrayList<Double> distances = new ArrayList<>();
        ArrayList<ArrayList<Double>> priceDistance = new ArrayList<ArrayList<Double>>();
        Scanner p =new Scanner(System.in);
        System.out.println("Enter Invoice number or enter '-1' when finished: ");
        invId=p.nextInt();
        invoices.add(invId);
        System.out.println("Enter price charged for therapy: ");
        treatmentPrices.add(p.nextDouble());
        System.out.println(("Enter round trip distance traveled: "));
        distances.add(p.nextDouble());
        treatments.put(invoices.get(0),treatmentPrices.get(0));
        while (invId!=-1) {
            System.out.println("Enter Invoice number or enter '-1' when finished: ");
            invId=p.nextInt();
            if (invId!=-1) {
                invoices.add(invId);
                System.out.println("Enter price charged for therapy: ");
                double nextPrice=p.nextDouble();
                treatmentPrices.add(nextPrice);
                System.out.println(("Enter round trip distance traveled: "));
                double nextDistance=p.nextDouble();
                distances.add(nextDistance);
                treatments.put(invoices.get(invoices.size()-1),treatmentPrices.get(treatmentPrices.size()-1));
                System.out.println(treatments);
            }
        }

        for (int i=0 ; i<treatmentPrices.size(); i++){
            totalRevenue+=treatmentPrices.get(i);
        }

        for (int i=0 ; i<distances.size(); i++){
            totalMileageCost+=distances.get(i)*0.45;
        }

        totalProfit=totalRevenue-totalMileageCost;

        System.out.println("Total revenue is: £" + totalRevenue);
        System.out.println("Total profit is: £" + totalProfit);
        System.out.println(("Total tax payable is: £" +totalProfit*0.2));








        /*
Attempt 1


        System.out.println("Enter round trip distance or enter '0' once finished: ");
        while (distance!=0) {
            distance = p.nextDouble();
            distances.add(distance);
        }

        System.out.println(treatmentPrices);
        System.out.println(distances);

        for (int i=0 ; i<distances.size(); i++){
            totalRevenue+=distances.get(i);
        }

        for (int k=0; k<distances.size(); k++){
            totalMileageCost+=distances.get(k)*0.45;
        }

        double profit=totalRevenue-totalMileageCost;
        System.out.println("Total Profit this tax year is: " + profit +" Tax payable is: " + 0.2*profit);*/
    }
}
