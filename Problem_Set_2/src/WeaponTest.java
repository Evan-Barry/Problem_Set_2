public class WeaponTest {
    public static void main(String[] args) {

        Weapon glock = new Weapon();
        Weapon uzi = new Weapon("Uzi", 100, 36000);
        Weapon machineGun = new Weapon();

        machineGun.setModel("AK-47");
        machineGun.setAmmoCapacity(30);
        machineGun.setFireRate(600);

        System.out.println(glock.toString());
        System.out.println(uzi.toString());
        System.out.println(machineGun.toString());


    }
}
