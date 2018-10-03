import javax.swing.*;

public class BookTest {
    public static void main(String[] args) {

        Book TheHobbit = new Book("The Hobbit", 10.00f, "9789402306538", 310);

        int pages = TheHobbit.getNumberOfPages();
        System.out.println("Number of pages in " + TheHobbit.getTitle() + " is " + pages);

        JOptionPane.showMessageDialog(null, TheHobbit.toString());
    }
}
