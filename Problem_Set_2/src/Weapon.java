public class Weapon {

    private String model;
    private int ammoCapacity, fireRate;//fireRate is measured in rounds per minute

    public String getModel()
    {
        return model;
    }

    public int getAmmoCapacity()
    {
        return ammoCapacity;
    }

    public int getFireRate()
    {
        return fireRate;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setAmmoCapacity(int ammoCapacity)
    {
        this.ammoCapacity = ammoCapacity;
    }

    public void setFireRate(int fireRate)
    {
        this.fireRate = fireRate;
    }

    public Weapon()
    {
        setModel("No Model Set");
        setAmmoCapacity(0);
        setFireRate(0);
    }

    public Weapon(String model, int ammoCapacity, int fireRate)
    {
        this.model = model;
        this.ammoCapacity = ammoCapacity;
        this.fireRate = fireRate;
    }

    public String toString()
    {
        return "Model :\t" + getModel() +
                "\nAmmo Capacity :\t" + getAmmoCapacity() +
                "\nFire Rate :\t" + getFireRate() + "\n";
    }

}
