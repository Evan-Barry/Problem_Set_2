import javax.swing.*;
import java.util.GregorianCalendar;

public class BookDateTest {
    public static void main(String[] args) {

        int borrowDay, borrowMonth, borrowYear, returnDay, returnMonth, returnYear;

        borrowDay = Integer.parseInt(JOptionPane.showInputDialog("Please enter the day(date) you borrowed this book"));
        borrowMonth = Integer.parseInt(JOptionPane.showInputDialog("Please enter the month you borrowed this book"));
        borrowYear = Integer.parseInt(JOptionPane.showInputDialog("Please enter the year you borrowed this book"));
        returnDay = Integer.parseInt(JOptionPane.showInputDialog("Please enter the day(date) you returned this book"));
        returnMonth = Integer.parseInt(JOptionPane.showInputDialog("Please enter the month you returned this book"));
        returnYear = Integer.parseInt(JOptionPane.showInputDialog("Please enter the year you returned this book"));

        GregorianCalendar borrowedDate = new GregorianCalendar(borrowYear, borrowMonth, borrowDay);
        GregorianCalendar returnedDate = new GregorianCalendar(returnYear, returnMonth, returnDay);

        numOfDaysOnLoan(borrowedDate, returnedDate);
    }

    public static void numOfDaysOnLoan(GregorianCalendar borrowedDate, GregorianCalendar returnedDate)
    {
        int daysOnLoan = returnedDate.get(GregorianCalendar.DAY_OF_YEAR) - borrowedDate.get(GregorianCalendar.DAY_OF_YEAR);

        System.out.println(daysOnLoan);
    }
}
