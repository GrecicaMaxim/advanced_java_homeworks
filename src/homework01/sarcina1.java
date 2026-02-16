package homework01;

class Book {
    // class attributes
    String title;
    int numberOfPages;

    // constructor with 2 parameters
    Book (String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    // this method prints a short description
    public void getInfo() {
        System.out.println("The book named \"" + this.title + "\" has " + this.numberOfPages + " pages.");
    }
}
public class sarcina1 {
    public static void main(String[] args) {
        // creating 2 Book objects
        Book b1 = new Book("Harry Potter and the Order of the Phoenix", 870);
        Book b2 = new Book("The Hunger Games", 374);

        // printing short description for these objects
        b1.getInfo();
        b2.getInfo();
    }
}
