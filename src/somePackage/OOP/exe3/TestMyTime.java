package somePackage.OOP.exe3;

public class TestMyTime {
    public static void main(String[] args) {
        //Will use try catch to handle exceptions
        // Case 1: valid input
        //int hour = 23, minute = 58, second = 58;
        // Case 2: invalid input
        int hour = 21, minute = 58, second = 58;

        MyTime t12;
        //t12 = new MyTime(second, minute, hour);
        // Without try-catch, the program will terminate abruptly if exception thrown

        try {
            t12=new MyTime(hour, minute, second);
            // If input is invalid, throw exception. Skip the rest, goto "catch".
            // Else complete "try", skip "catch"
            System.out.println("Valid input");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("Error in input. Set to default value");
            t12=new MyTime();
        }

        System.out.println("Time is " + t12);
        System.out.println("Life goes on...");
    }
}
