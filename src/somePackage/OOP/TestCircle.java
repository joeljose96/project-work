package somePackage.OOP;

public class TestCircle {
    public static void main(String[] args){
        /* declare and instance of Circle class called c1.
        Construct the instance c1 by invoking the default constructor
        which sets its radius and colour to their default value
         */
        Circle c1 =new Circle();
        //Invoke public methods on instance c1, via dot operator
        System.out.println("The circle has a radius of " +
                c1.getRadius() + "Circle has an area of " + c1.getArea());
        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2= new Circle(2.0);
        System.out.println("The circle has a radius of " +
                c2.getRadius() + "Circle has an area of " + c2.getArea());
        Circle c4= new Circle();
        c4.setColour("Beige");
        c4.setRadius(4.5);
    }
}
