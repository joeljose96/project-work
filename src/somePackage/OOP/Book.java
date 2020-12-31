package somePackage.OOP;

public class Book {
    private String name;
    private double price;
    private int qty=0;
    Author[] authors=new Author[2];
    public Book(String name, Author author, double price){
    }
    public Book(String name, Author author, double price, int qty){
    }
    public String getName(){
        return name;
    }

    /*public String getAuthor(){
        return authors.getName();
    }*/

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }

}
