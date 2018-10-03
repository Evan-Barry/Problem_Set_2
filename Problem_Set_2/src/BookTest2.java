import javax.swing.*;

public class BookTest2 {

    public static void main(String[] args) {

        String userTitleFave, userTitleLeast, userISBNFave, userISBNLeast;
        float userPriceFave, userPriceLeast;
        int userNumberOfPagesFave, userNumberOfPagesLeast;

        userTitleFave = JOptionPane.showInputDialog("Enter title of your favourite book");
        userISBNFave = JOptionPane.showInputDialog("Enter ISBN of your favourite book");
        userPriceFave = Float.parseFloat(JOptionPane.showInputDialog("Enter price of your favourite book"));
        userNumberOfPagesFave = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Pages in your favourite book"));

        userTitleLeast = JOptionPane.showInputDialog("Enter title of your least favourite book");
        userISBNLeast = JOptionPane.showInputDialog("Enter ISBN of your least favourite book");
        userPriceLeast = Float.parseFloat(JOptionPane.showInputDialog("Enter price of your least favourite book"));
        userNumberOfPagesLeast = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Pages in your least favourite book"));

        Book FaveBook = new Book(userTitleFave, userPriceFave, userISBNFave, userNumberOfPagesFave);
        Book LeastFaveBook = new Book(userTitleLeast, userPriceLeast, userISBNLeast, userNumberOfPagesLeast);

        JOptionPane.showMessageDialog(null, FaveBook.toString(),"Favourite Book",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, LeastFaveBook.toString(),"Least Favourite Book",JOptionPane.INFORMATION_MESSAGE);
    }

}
