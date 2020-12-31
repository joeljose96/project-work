package somePackage.OOP.exe5;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin;
    private Point end;

    public Line(Point begin, Point end){
        this.begin=begin;
        this.end=end;
    }

    public Line(int beginX, int beginY, int endX, int endY){
        begin=new Point(beginX,beginY);
        end=new Point(endX, endY);
    }
}
