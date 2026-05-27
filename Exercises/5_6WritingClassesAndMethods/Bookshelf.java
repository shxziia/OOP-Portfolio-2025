public class Bookshelf {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", "Secker & Warburg", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960);

        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();

        book1.setTitle ("Nineteen Eighty-Four");
        book1.setPublisher("Harcourt Brace Jovanovich");

        System.out.println("\nUpdated Book 1 Information:");
        System.out.println(book1);


    }
}
