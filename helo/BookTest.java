public class BookTest {
    public static void main(String[] args) {
        Book book1 = new BookBuilder().id(0).author("abhey").title("god").price(453).build();
        Book book2 = new BookBuilder().id(1).author("june").build();
    System.out.println(book1);
    System.out.println(book2);
    
    }
}
