public class Science extends Subject{
    private int labs;

    public Science(String teacher, double grade, int labs)
    {
        super(teacher, grade);
        this.labs = labs;
    }

    public int getLabs()
    {
        return labs;
    }
}
