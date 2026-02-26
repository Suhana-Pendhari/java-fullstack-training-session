
record Book(String name, double price) {
}

public class Recordtest1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Book book1 = new Book("HeadFirst Java", 1200.00);
        System.out.println(book1); // Uses generated toString()
        System.out.println("Book Name: " + book1.name()); // Uses generated accessor
        System.out.println("Book Price: " + book1.price());
        /*
         * setters are not there
         * //Java records are designed to be immutable data carriers.
         * This means that once a record object is created,
         * its component values cannot be changed.
         * Therefore, records do not have traditional "setter" methods in the same way
         * that regular
         * Java classes often do.
         * //The purpose of records is to provide a concise way to declare classes
         * that are primarily used to store data, and immutability is a key
         * characteristic
         * of this design
         */

    }
}