package somePackage.OOP;

public class TestBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummyBook =new Book("Java for dummy", ahTeck, 19.95, 99);

        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);

        System.out.println(anotherBook.getName());
        anotherBook.setPrice(12);
        System.out.println(anotherBook.getPrice());
    }
}
