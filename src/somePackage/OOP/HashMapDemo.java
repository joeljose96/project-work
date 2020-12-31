package somePackage.OOP;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        //loop through hashmap

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        //print values
        // Print keys
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }


    }
}
