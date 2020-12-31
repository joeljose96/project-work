package somePackage.OOP.exe4.fourPoint5;

public class Square extends Rectangle {
    public Square(){
    }

    public Square(double side){
        super(side,side); // Call superclass Rectangle(side, side)
    }

    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return this.getLength();
    }

    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public void setWidth(double side){
        width=side;
    }

    @Override
    public void setLength(double side){
        length=side;
    }
}
