import javax.swing.*;

public class VendingMachineTest {
    public static void main(String[] args) {

        VendingMachine vm1 = new VendingMachine(5, 0);

        //JOptionPane.showMessageDialog(null, "Number of cans:\t" + vm1.getNumOfCans() +
        //        "\nNumber of tokens:\t" + vm1.getNumOfTokens());

        int choice = -1;

        while(choice != 2)
        {
            choice = JOptionPane.showConfirmDialog(null, "Would you like a can of soda?");

            if(choice == 0)
            {
                vm1.tokenEntered();
            }

            if(choice == 1)
            {
                JOptionPane.showMessageDialog(null, "Ok, goodbye");
                System.exit(1);
            }
        }

        System.exit(choice);

    }
}
