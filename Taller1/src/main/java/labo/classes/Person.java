package labo.classes;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private Book book;
    private String name;
    private int age;
    private String dui;
    private Date loanDate;
    private Date limitDate;

    public Person(Book book, String name, int age, String dui) {
        this.book = book;
        this.name = name;
        this.age = age;
        this.dui = dui;
        //Use actual date
        this.loanDate = new Date();
        //Limit date is set to 7 days after the loan
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.loanDate);
        cal.add(Calendar.DAY_OF_MONTH, 7);


    }

    public String getBook() {
        return book.getId();
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public Date getLoanDate() {
        return loanDate;
    }


    public Date getLimitDate() {
        return limitDate;
    }
}
