package somePackage.OOP;

public class TestAuthor {
    public static void main(String[] args){
        /* declare and instance of Author class called ahTeck.
        Construct the instance ahteck by invoking the default constructor
        which sets name, email and gender as described
         */
        Author ahTeck = new Author ("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());     // Test getter
        System.out.println("email is: " + ahTeck.getEmail());   // Test getter
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
