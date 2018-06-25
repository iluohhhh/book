package model;

public class Book {

    int id;
    String ISBN;
    String title;
    Member loanTo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Member getLoanTo() {
        return loanTo;
    }

    public void setLoanTo(Member loanTo) {
        this.loanTo = loanTo;
    }
}
