abstract class school
{
    public abstract void students();

    public void teachers()
    {
        System.out.println("teahers");
    }
}
class updatedschool extends school
{
    public void students()
    {
        System.out.println("student");
    }
}

public class abs
{
    public static void main(String args[])
    {
        school obj=new updatedschool();
        obj.teachers();
        obj.students();
    }
}