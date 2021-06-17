package pl.abramczyk.model;

public class Book {
    private String author;
    private String title;
    private int Iban;

    public Book(String author, String title, int iban) {
        this.author = author;
        this.title = title;
        Iban = iban;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIban() {
        return Iban;
    }

    public void setIban(int iban) {
        Iban = iban;
    }
}
