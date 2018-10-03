public class AnimalTest {
    public static void main(String[] args) {

        String[] dogCont = new String[2];
        dogCont[0] = "Europe";
        dogCont[1] = "North America";

        String[] catCont = new String[3];
        catCont[0] = "Asia";
        catCont[1] = "Africa";
        catCont[2] = "South America";

        Animal dog = new Animal("Dog", dogCont, 10.5f, 2);
        Animal cat = new Animal("Cat", catCont, 5.3f, 3);
        Animal frog = new Animal();

        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(frog.toString());

    }
}
