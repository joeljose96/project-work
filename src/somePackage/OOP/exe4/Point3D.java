package somePackage.OOP.exe4;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(float x, float y, float z){
    }

    public Point3D(){

    }

    public float getZ(){
        return z;
    }

    public void setZ(float z){
        this.z=z;
    }

    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.z=z;
    }

    public float[] getXYZ(){
        float[] arrayXYZ={getX(),getY(),z};
        return arrayXYZ;
    }
}
