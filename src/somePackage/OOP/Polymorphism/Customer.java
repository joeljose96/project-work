package somePackage.OOP.Polymorphism;

public class Customer {
    public String name;
    boolean member=false;
    String memberType;

    public Customer(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public boolean isMember(){
        return member;
    }

    public void setMember(boolean member){
        this.member=member;
    }

    public String getMemeberType(){
        return memberType;
    }

    public void setMemberType(String type){
        memberType=type;
    }

}
