package contests.thirtyDaysOfCode.dayThirteen;

/**
 * Created by Nick on 1/28/2016.
 */
class MyBook extends Book {

    private int price;

    MyBook(String title, String author, int price) {

        super(title, author);
        this.price = price;

    }

    @Override
    void display() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

    }

}