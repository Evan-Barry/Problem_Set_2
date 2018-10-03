import javax.swing.*;

public class FractionTest {
    public static void main(String[] args) {

        Fraction f1;
        Fraction f2;

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter numerator 1"));
        int d1 = Integer.parseInt(JOptionPane.showInputDialog("Enter denominator 1"));

        f1 = new Fraction(n1, d1);

        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter numerator 2"));
        int d2 = Integer.parseInt(JOptionPane.showInputDialog("Enter denominator 2"));

        f2 = new Fraction(n2, d2);

        int choice = -1;

        while(choice != 0)
        {
            choice = Integer.parseInt(JOptionPane.showInputDialog("What operation would you like to do?" +
                    "\n1. Add\n2.Subtract\n3.Multiply\n4.Divide\n0. Exit"));

            switch (choice)
            {
                case 1:    JOptionPane.showMessageDialog(null,Fraction.addFraction(f1, f2));
                    break;

                case 2:    JOptionPane.showMessageDialog(null,Fraction.subFraction(f1, f2));
                    break;

                case 3:    JOptionPane.showMessageDialog(null,Fraction.multiplyFraction(f1, f2));
                    break;

                case 4:    JOptionPane.showMessageDialog(null,Fraction.divideFraction(f1, f2));
                    break;

                case 0:     System.exit(0);

                default:    JOptionPane.showMessageDialog(null, "Invalid choice input, please enter a number from 0-4");
            }
        }

    }
}
