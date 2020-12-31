package somePackage.OOP;

public class MyPoint {
    int x=0;
    int y=0;
    public MyPoint(){}
    public MyPoint(int x, int y) {
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
        int[] myArray= {x,y};
        return myArray;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double distance(int x, int y){
        int squareD1= (int) Math.pow(this.x-x,2);
        int squaredD2= (int) Math.pow(this.y-y,2);
        int sumSquared=squareD1+squaredD2;
        return Math.sqrt(sumSquared);
        }

    public double distance(MyPoint another){
        int xDiff=this.x-another.x;
        int yDiff=this.y-another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(){
        return Math.sqrt(x*x +y*y);
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}