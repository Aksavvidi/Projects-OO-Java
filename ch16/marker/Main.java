package gr.aueb.cf.ch16.marker;

public class Main {

    public static void main(String[] args) {
        Item book = new Book(1, "123", "Th.", "Java I");
        Item cd = new CompactDick(1, "Prince");

        deliver(book);
        deliver(cd);

    }
    public static void deliver(Item item){
        if (item instanceof Book){
            System.out.println("Book Delivered");
        } else if (item instanceof CompactDick) {
            System.out.println("CD delivered");

        }else {
            throw new AssertionError();
        }
    }
}
