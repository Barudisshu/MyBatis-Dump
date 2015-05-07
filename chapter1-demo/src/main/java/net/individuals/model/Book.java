package net.individuals.model;


public class Book {

    private int id;
    private String bookname;
    private String author;
    private String publisher;
    private int price;
    private int booktypeid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBooktypeid() {
        return booktypeid;
    }

    public void setBooktypeid(int booktypeid) {
        this.booktypeid = booktypeid;
    }
}