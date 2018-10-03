public class Animal {

    private String type;
    private String[] continents;
    private float weight;
    private int age;

    public String getType()
    {
        return type;
    }

    public String getContinents()
    {
        String continentsAsString = "";

        if(continents != null)
        {
            for(int i = 0; i < continents.length; i++)
            {
                continentsAsString += continents[i] + " ";
            }
        }

        return continentsAsString;
    }

    public float getWeight()
    {
        return weight;
    }

    public int getAge()
    {
        return age;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setContinents(String[] continents)
    {
        this.continents = continents;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Animal()
    {
        this.type = "No Type Specified";
        this.continents = null;
        this.weight = 0.0f;
        this.age = 0;
    }

    public Animal(String type, String[] continents, float weight, int age)
    {
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public String toString()
    {
        return "\nType: " + getType() +
                "\nContinent: " + getContinents() +
                "\nWeight: " + getWeight() +
                "\nAge: " + getAge();
    }

}
