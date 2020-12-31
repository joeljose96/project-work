package somePackage.OOP;

public class MyCircle {
    int radius=1;
    MyPoint center= new MyPoint(0,0);

    public MyCircle(){
    }

    public MyCircle(int x, int y, int radius){
    }

    public MyCircle(MyPoint center, int radius){
    }

    public int getRadius(){
      return radius;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }
    MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int ex){
        center.setX(ex);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        int[] myArray={center.getX(),center.getY()};
        return myArray;
    }

    public void setXY(int x, int y){
        center.setX(x);
        center.setY(y);
    }

    public String toString(){
        return "MyCircle[radius=" + radius +",center="+ center.toString()+"]";
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumfrence(){
        return 2*radius*Math.PI;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
