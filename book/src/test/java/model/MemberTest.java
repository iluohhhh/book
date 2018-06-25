package model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MemberTest {

    @Test
    public void testLoan() throws Exception {

        Member member = new Member();
        member.setId(3578);
        member.setName("gaolongtian");

        Book searchBook = new Book();
        searchBook.setId(4);
        searchBook.setISBN("IBSO-0004");
        searchBook.setTitle("gradle");

        Book book = new Book();
        book.setId(1);
        book.setISBN("IBSO-0001");
        book.setTitle("java ee");
        book.setLoanTo(member);

        Book book1 = new Book();
        book1.setId(2);
        book1.setISBN("IBSO-0002");
        book1.setTitle("java");
        book1.setLoanTo(member);

        List<Loan> loans = new ArrayList<Loan>();
        Loan loan = new Loan();
        loan.setId(1);
        loan.setMember(member);
        loan.setBook(book);

        Loan loan1 = new Loan();
        loan1.setId(2);
        loan1.setMember(member);
        loan1.setBook(book1);

        loans.add(loan);
        loans.add(loan1);


        member.setLoans(loans);
        List<ISpecification<Member>> iSpecifications = new ArrayList<>();
        iSpecifications.add(new HasReachMaxSpecification());
        iSpecifications.add(new LoanOnlyOneSpecification());
        member.setiSpecifications(iSpecifications);
        Loan loan2 = member.loan(searchBook);
        if (loan2 == null) {
            System.out.print("你已不能借书");
        } else {
            System.out.print(loan2.getBook().getTitle() + "借书成功");
        }

    }

    @Test
    public void testReturnBook() throws Exception {
        Member member = new Member();
        member.setId(3578);
        member.setName("gaolongtian");

        Book returnBook = new Book();
        returnBook.setId(3);
        returnBook.setISBN("IBSO-0003");
        returnBook.setTitle("gradle");
        returnBook.setLoanTo(member);

        Book book = new Book();
        book.setId(1);
        book.setISBN("IBSO-0001");
        book.setTitle("java ee");
        book.setLoanTo(member);

        Book book1 = new Book();
        book1.setId(2);
        book1.setISBN("IBSO-0002");
        book1.setTitle("java");
        book1.setLoanTo(member);

        Book book2 = new Book();
        book2.setId(3);
        book2.setISBN("IBSO-0003");
        book2.setTitle("gradle");
        book2.setLoanTo(member);

        List<Loan> loans = new ArrayList<Loan>();
        Loan loan = new Loan();
        loan.setId(1);
        loan.setMember(member);
        loan.setBook(book);

        Loan loan1 = new Loan();
        loan1.setId(2);
        loan1.setMember(member);
        loan1.setBook(book1);

        Loan loan2 = new Loan();
        loan2.setId(3);
        loan2.setMember(member);
        loan2.setBook(book2);

        loans.add(loan);
        loans.add(loan1);
        loans.add(loan2);

        member.setLoans(loans);
        Loan loan3 = member.returnBook(returnBook);
        System.out.print(loan3.getBook().getTitle()+"还书成功");
    }

    @Test
    public void testCanLoan() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: returnBook(Book book)
     */


    /**
     * Method: findCurrentLoanFor(Book book)
     */
    @Test
    public void testFindCurrentLoanFor() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: validate()
     */
    @Test
    public void testValidate() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getId()
     */
    @Test
    public void testGetId() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setId(int id)
     */
    @Test
    public void testSetId() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getName()
     */
    @Test
    public void testGetName() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setName(String name)
     */
    @Test
    public void testSetName() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getLoans()
     */
    @Test
    public void testGetLoans() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setLoans(List<Loan> loans)
     */
    @Test
    public void testSetLoans() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getiSpecifications()
     */
    @Test
    public void testGetiSpecifications() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setiSpecifications(List<ISpecification<Member>> iSpecifications)
     */
    @Test
    public void testSetiSpecifications() throws Exception {
//TODO: Test goes here... 
    }


} 
