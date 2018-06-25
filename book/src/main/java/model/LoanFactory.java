package model;

import java.time.LocalDateTime;

public class LoanFactory {

    Loan createLoan(Book book, Member member) {
        Loan loan = new Loan();
        loan.setBook(book);
        loan.setMember(member);
        loan.setLoanTime(LocalDateTime.now());
        loan.setLoanForReturn(LocalDateTime.now().plusDays(10));
        return loan;
    }
}
