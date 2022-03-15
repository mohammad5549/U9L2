public class Dog extends Animal{
    private boolean hasBeenWalked;
    private int barks;

    public Dog(String name, int age, boolean vaccinated)
    {
        super(name, age, vaccinated);
        hasBeenWalked = false;
        barks = 0;
    }

    public boolean isHasBeenWalked()
    {
        return hasBeenWalked;
    }

    public int getBarks()
    {
        return barks;
    }

    public void walk()
    {
        System.out.println("I have been walked!");
        hasBeenWalked = true;
    }

    public void bark()
    {
        System.out.println("I have barked!");
        barks++;
    }
}
