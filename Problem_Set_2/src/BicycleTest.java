import java.util.Scanner;

public class BicycleTest {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String ownersName, make;
        float value;

        System.out.print("Enter the name of the bike's owner: ");
        ownersName = input.nextLine();

        System.out.print("Enter value of the bike: ");
        value = input.nextFloat();

        System.out.print("Enter the make of the bike: ");
        input.nextLine();
        make = input.nextLine();

        Bicycle bike1 = new Bicycle(ownersName, value, make);

        System.out.println(bike1.toString());

        Bicycle bike2 = new Bicycle();

        System.out.print("Enter the name of the bike's owner: ");
        ownersName = input.nextLine();

        System.out.print("Enter value of the bike: ");
        value = input.nextFloat();

        System.out.print("Enter the make of the bike: ");
        input.nextLine();
        make = input.nextLine();

        bike2.setOwnersName(ownersName);
        bike2.setValue(value);
        bike2.setMake(make);

        System.out.println(bike2.toString());

        bike1.setValue(bike1.getValue() + 10);
        System.out.println("Bike 1 new value is " + bike1.getValue());

        System.out.println("The bike owners are " + bike1.getOwnersName() + " and " + bike2.getOwnersName());

        System.out.println("The value of the 2 bikes is " + (bike1.getValue() + bike2.getValue()));
    }
}
