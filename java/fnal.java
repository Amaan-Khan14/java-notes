//final-variable , method,class
final class xyz
{
    final int num=9;
      public final void show()
    {
        System.out.println("in");
    }
}
class abc
{


    public void show()
    {
        System.out.println("in b");
    }
}

        

     

//class abc extends xyz           //a final class cannot be inherited
//{}
public class fnal
{
    public static void main(String args[])
    {
        xyz a=new xyz();
        abc e=new abc(); 
        a.show();
        // a.num = 10;     //we cannot change the value ones it fixed(final) 
        System.out.println(a.num );
        e.show();


    }
}