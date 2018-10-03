import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class VendingMachine {

    private int numOfCans, numOfTokens;

    public int getNumOfCans()
    {
        return numOfCans;
    }

    public int getNumOfTokens()
    {
        return numOfTokens;
    }

    public void setNumOfCans(int numOfCans)
    {
        this.numOfCans = numOfCans;
    }

    public void setNumOfTokens(int numOfTokens)
    {
        this.numOfTokens = numOfTokens;
    }

    public VendingMachine()
    {
        setNumOfCans(0);
        setNumOfTokens(0);
    }

    public VendingMachine(int numOfCans, int numOfTokens)
    {
        setNumOfCans(numOfCans);
        setNumOfTokens(numOfTokens);
    }

    public void tokenEntered()
    {
        Object[] fillUpOption = {"Fill Up"};

        if(getNumOfCans() > 0)
        {
            setNumOfTokens(getNumOfTokens()+1);
            setNumOfCans(getNumOfCans()-1);

            JOptionPane.showMessageDialog(null, "Enjoy your soda");
        }

        else
        {
            int choice = JOptionPane.showConfirmDialog(null, "No cans left. Please fill up");

            if(choice == 0)
            {
                fillUp(10);
                JOptionPane.showMessageDialog(null, "10 cans have been put into the vending machine");
            }

            else
            {
                JOptionPane.showMessageDialog(null, "Ok, no cans left");
            }
        }
    }

    public void fillUp(int cans)
    {
        setNumOfCans(getNumOfCans() + cans);
    }
}
