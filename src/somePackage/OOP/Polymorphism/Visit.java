package somePackage.OOP.Polymorphism;

import java.util.Date;

public class Visit extends Customer {
    Customer customer;
    Date date;
    double serviceExpense;
    double productExpense;

    public Visit(String name, Date date){
        super(name);
        this.date=date;
    }

    public double getServiceExpense(){
        return serviceExpense;
    }

    public void setServiceExpense(double ex){
        serviceExpense=ex;
    }

    public double getProductExpense(){
        return productExpense;
    }

    public void setProductExpense(double ex){
        productExpense=ex;
    }

    public double getTotalExpense(){
        if (customer.isMember()){
            if (customer.getMemeberType()=="Premium"){
                return 0.8*getServiceExpense() + 0.1*getProductExpense();
            }
            else if (customer.getMemeberType()=="Gold"){
                return 0.85*getServiceExpense() + 0.1*getProductExpense();
            }
            else if (customer.getMemeberType()=="Silver"){
                return 0.9*getServiceExpense() + 0.1*getProductExpense();
            }
        }
        return productExpense+serviceExpense;

    }
}
