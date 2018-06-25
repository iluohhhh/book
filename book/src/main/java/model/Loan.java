package model;

import java.time.LocalDateTime;

public class Loan {

    int id;
    LocalDateTime LoanTime;
    LocalDateTime LoanForReturn;
    LocalDateTime returnTime;
    Book book;
    Member member;

    void markAsReturn() {
        returnTime = LocalDateTime.now();
    }

    boolean hasNotBeenReturn() {
        return returnTime == null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getLoanTime() {
        return LoanTime;
    }

    public void setLoanTime(LocalDateTime loanTime) {
        LoanTime = loanTime;
    }

    public LocalDateTime getLoanForReturn() {
        return LoanForReturn;
    }

    public void setLoanForReturn(LocalDateTime loanForReturn) {
        LoanForReturn = loanForReturn;
    }

//    public LocalDateTime getReturnTime() {
//        return ReturnTime;
//    }


    public void setReturnTime(LocalDateTime returnTime) {
        this.returnTime = returnTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
