/**
 * Book
 */
public class Book {
 private int id;
 private String author;
 private String title;
 private float price;
@Override
public String toString() {
    return "Book [id=" + id + ", author=" + author + ", title=" + title + ", price=" + price + "]";
}
public void setId(int id) {
    this.id = id;
}
public void setAuthor(String author) {
    this.author = author;
}
public void setTitle(String title) {
    this.title = title;
}
public void setPrice(float price) {
    this.price = price;
}

 
    
}