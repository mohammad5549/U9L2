public class Cat extends Animal{
    private boolean hasPlayedWith;
    private boolean litterClean;

    public Cat(String name, int age, boolean vaccinated)
    {
        super(name, age, vaccinated);
        hasPlayedWith = false;
        litterClean = false;
    }

    public boolean isHasPlayedWith()
    {
        return hasPlayedWith;
    }

    public boolean isLitterClean()
    {
        return litterClean;
    }

    public void play()
    {
        System.out.println("I have been played with!");
        hasPlayedWith = true;
    }

    public void cleanLitter()
    {
        System.out.println("My litter has been cleaned!");
        litterClean = true;
    }
}
