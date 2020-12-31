package somePackage.OOP.Polymorphism;

public class Cat extends Animal {
    @Override //We are overriding the greeting method in the parent class, this is an instance of polymorphism
    public void greeting() {
        System.out.println("Meow!");
    }
}
