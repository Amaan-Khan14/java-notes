interface Human
{
    int ageM=20,ageF=19;

    void info();
}

class Male implements Human 
{
    public void info()
    {
        System.out.println("age is  "+ageM);
    }
}
class Female implements Human
{
    public void info()
    {
        System.out.println("age is "+ageF);
    }
}

class Display
{
   public void show(Human call)
   {
    call.info();

   }

}

public class impt 
{
    public static void main(String x[])
    {
        Human M = new Male();
        Human F=new Female();
        
        Display obj= new Display();
        obj.show( M);
        obj.show(F);
    }

}
