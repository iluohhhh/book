package model;

import java.util.List;

public class Member {

    int id;
    String name;
    List<Loan> loans;
    List<ISpecification<Member>> iSpecifications;

    public Loan loan(Book book) {
        Loan loan = null;
        if (canLoan(book)) {
            LoanFactory loanFactory = new LoanFactory();
            loan = loanFactory.createLoan(book, this);
//            loans.add(loan);
        }
        return loan;
    }

    boolean canLoan(Book book) {
        LoanOnlyOneSpecification.book = book;
        if (book.getLoanTo() == null && validate()) {
            return true;
        } else {
            return false;
        }
    }

    public Loan returnBook(Book book) {
        Loan loan = findCurrentLoanFor(book);
        loan.markAsReturn();
//        book.setLoanTo(null);
        return loan;
    }

    Loan findCurrentLoanFor(Book book) {
        for (Loan loan : this.loans) {
            if (loan.getBook().getISBN().equals(book.getISBN())
                    && loan.getMember().getName().equals(book.getLoanTo().getName())) {
                return loan;
            }
        }
        return null;
    }

    boolean validate() {
        for (ISpecification iSpecification : iSpecifications) {
            if (iSpecification.isSatisfiedBy(this)) {
                return false;
            }
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public List<ISpecification<Member>> getiSpecifications() {
        return iSpecifications;
    }

    public void setiSpecifications(List<ISpecification<Member>> iSpecifications) {
        this.iSpecifications = iSpecifications;
    }
}
