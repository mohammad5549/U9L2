public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean bathed;

    public Animal(String name, int age, boolean vaccinated)
    {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        bathed = false;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isVaccinated()
    {
        return vaccinated;
    }

    public boolean isBathed()
    {
        return bathed;
    }

    public void adopt()
    {
        System.out.println("I have been adopted!");
    }

    public void feed()
    {
        System.out.println("I have been fed!");
    }

    public void bathe()
    {
        System.out.println("I have been bathed!");
        bathed = true;
    }
}
