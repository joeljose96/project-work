package somePackage.OOP;

public class Circle {
    private double radius;
    private String colour;

    //Constructor with default value for radius and colour
    public Circle() {
        radius = 1.0;
    }
    //Constructs a circle instance with a given color and default radius
    public Circle(double r){
        radius=r;
        colour="red";
    }
    // 3rd constructor with given colour and radius
    public Circle(double r, String c){
        radius=r;
        colour=c;
    }
    //retruns radius
    public double getRadius(){
        return radius;
    }

    public String getColour() {
        return colour;
    }
    //Setter for instance variable radius
    public void setRadius(double newRadius){
        radius=newRadius;
    }

    public void setColour(String newColour){
        colour=newColour;
    }
    public String toString() {
        return "Circle[radius=" + radius + " color=" + colour + "]";
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
