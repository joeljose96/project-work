package somePackage.OOP.exe4;

import somePackage.OOP.Circle;

public class Cylinder extends Circle {
    private double height =1.0;

    public Cylinder(){
        super();
        height=1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super();        // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double height, double radius){
        super(radius);
        this.height=height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    // super. notation is used because the getArea method has an override
    public double getVolume(){
        return super.getArea()*height;
    }

    /*Override notation is used because getArea method is also present in the superclass so if you want
    to use a method with the same name in the subclass, the override needs to be used
     */
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height +2*super.getArea();
    }
}
