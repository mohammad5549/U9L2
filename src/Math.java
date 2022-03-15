public class Math extends Subject{
    private boolean goodAtMath;

    public Math(String teacher, double grade, boolean goodAtMath)
    {
        super(teacher, grade);
        this.goodAtMath = goodAtMath;
    }

    public boolean isGoodAtMath()
    {
        return goodAtMath;
    }
}
