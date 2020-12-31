package somePackage.OOP.exe4;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){

    }

    public String getSchool(){
        return school;
    }

    public void setSchool(){
        this.school=school;
    }

    public void setPay(double pay){
        this.pay=pay;
    }
}
