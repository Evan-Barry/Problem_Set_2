import java.util.Scanner;

public class MyPointTest {

    static MyPoint point = new MyPoint();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int i = -1;

        //System.out.println(point.toString());

        while(i != 0)
        {
            System.out.print("\n\n\n\n\n\n\n\n\nPoint: " + point.toString() +
                    "\n1. Move Horizontally" +
                    "\n2. Move Vertically" +
                    "\n3. Translate" +
                    "\n4. Distance From Origin" +
                    "\n\nInput choice(0 to exit): ");

            i = input.nextInt();

            switch (i){
                case 1:
                    System.out.print("How far would you like to move horizontally? ");
                    int xMove = input.nextInt();

                    point.moveHorizontally(xMove);
                    break;

                case 2:
                    System.out.print("How far would you like to move vertically? ");
                    int yMove = input.nextInt();

                    point.moveVertically(yMove);
                    break;

                case 3:
                    System.out.print("How far would you like to translate on x-axis? ");
                    int xTrans = input.nextInt();

                    System.out.print("How far would you like to translate on y-axis? ");
                    int yTrans = input.nextInt();

                    point.translate(xTrans, yTrans);
                    break;

                case 4:
                    point.distanceFromOrigin();
                    break;
            }
        }

    }


}
