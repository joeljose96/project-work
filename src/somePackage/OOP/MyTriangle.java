package somePackage.OOP;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
    }
    public String toString(){
        return "MyTriangle[v1="+v1+",v2="+v2+",v3="+v3+"]";
    }
    public double getPerimeter(){
        return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
    }

    public String getType(){
        if (v1.distance(v2)==v1.distance(v3)&v2.distance(v3)==v1.distance(v2)){
            return "Equalateral";
        } else if((v1.distance(v2)==v1.distance(v3)) && (v2.distance(v3)!=v1.distance(v2)) || (v1.distance(v2)!=v1.distance(v3)) && (v2.distance(v3)==v1.distance(v2))){
            return "Isosceles";}
        else {return "Scalene";}
    }
}
