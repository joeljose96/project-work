package somePackage;

public class SumAverageRunningInt {
    public static void main(String[] args){
        float average;
        int lowerbound=1;
        int upperbound=100;
        int sumOdd=0;
        int sumEven=0;
        int absDiff;
        int sqsum=0;
        int count=0;
        int square=0;
        for (int number=lowerbound; number<=upperbound; ++number){
            if (number%2==1){
                sumOdd+=number;
            } else {
                sumEven+=number;
            }
        }
        if (sumOdd>sumEven){
            absDiff=sumOdd-sumEven;
        } else {
            absDiff=sumEven-sumOdd;
        }
        System.out.println("Odd numbers sum to: "+ sumOdd+", even numbers sum to: "+sumEven+", absolute difference between sum of odd and sum of even is: "+absDiff);

        /*average=sqsum/(upperbound-lowerbound+1);
        System.out.println("Sum is "+ sqsum);
        System.out.println("Average is "+ average);
        /*if (number==1){
            System.out.println("ONE");
        } else if (number==2){
            System.out.println("TWO");
        } else if (number==3){
            System.out.println("THREE");
        } else {
            System.out.println("OTHER");
        }*/
    }
}
