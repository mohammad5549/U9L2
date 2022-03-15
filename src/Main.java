public class Main {
    public static void main(String[] args) {
        Dog maDawg = new Dog("Pradeep", 16, true);

        System.out.println(maDawg.getName());
        System.out.println(maDawg.getAge());
        System.out.println(maDawg.isVaccinated());
        System.out.println(maDawg.isBathed());
        maDawg.adopt();
        maDawg.feed();
        maDawg.bathe();

        System.out.println(maDawg.isHasBeenWalked());
        System.out.println(maDawg.getBarks());
        maDawg.walk();
        maDawg.bark();

        Cat myCat = new Cat("Pradeep", 16, true);

        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        System.out.println(myCat.isVaccinated());
        System.out.println(myCat.isBathed());
        myCat.adopt();
        myCat.feed();
        myCat.bathe();

        System.out.println(myCat.isHasPlayedWith());
        System.out.println(myCat.isLitterClean());
        myCat.play();
        myCat.cleanLitter();
    }
}
