import javax.swing.*;

public class MessageTest {
    public static void main(String[] args) {

        Message greetings = new Message("Obi Wan Kenobi", "General Grievous");

        greetings.append("Hello there!");

        JOptionPane.showMessageDialog(null, greetings.toString());

    }
}
