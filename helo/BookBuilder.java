public class BookBuilder {
private Book book = new Book();

    public BookBuilder id(int id) {
        book.setId(id);
       return this;
    }
    public BookBuilder author(String author) {
        book.setAuthor(author);
        return this;   
     }

    public BookBuilder title(String title) {
        book.setTitle(title);
        return this;   
     }

    public BookBuilder price(float price) {
        book.setPrice(price);
        return this;   
     }

     public Book build(){
        return book;
     }

}
