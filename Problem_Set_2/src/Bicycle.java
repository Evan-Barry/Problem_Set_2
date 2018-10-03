public class Bicycle {

    private String ownersName;
    private float value;
    private String make;

    public String getOwnersName()
    {
        return ownersName;
    }

    public float getValue()
    {
        return value;
    }

    public String getMake()
    {
        return make;
    }

    public void setOwnersName(String ownersName)
    {
        this.ownersName = ownersName;
    }

    public void setValue(float value)
    {
        this.value = value;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public Bicycle()
    {
        this.ownersName = "No Name Set";
        this.value = 0.00f;
        this.make = "No Make Set";
    }

    public Bicycle(String ownersName, float value, String make)
    {
        setOwnersName(ownersName);
        setValue(value);
        setMake(make);
    }

    public String toString()
    {
        return "Owner's Name: " + getOwnersName() +
                "\nValue: " + getValue() +
                "\nMake: " + getMake();
    }

}
