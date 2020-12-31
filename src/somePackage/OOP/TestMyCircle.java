package somePackage.OOP;

public class TestMyCircle {
    public static void main(String[] args){
        MyCircle c1= new MyCircle();
        System.out.println(c1.toString());
        c1.setCenterX(-4);
        System.out.println(c1.getCenterX());
        c1.setXY(-3,6);
        c1.setRadius(6);
        System.out.println("Circle C1 has center "+ "("+c1.getCenterXY()[0]+","+c1.getCenterXY()[1]+")" + ", radius:" + c1.getRadius()+" and Area:"+ c1.getArea());

    }
}
