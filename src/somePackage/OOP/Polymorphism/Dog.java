package somePackage.OOP.Polymorphism;

public class Dog extends Animal {
    @Override  //Override polymorphism
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {   //here the method is being overloaded, another instance of polymorphism
        System.out.println("Woooooooooof!");
    }
}

//Overloaded method is where more than one method share the same name with different parameters
