class a
{
    public void x()
    {
        System.out.println("in x ");
    } 
}

class b extends a
{
    public void x()
    {
        System.out.println("in");
    }
}
class c extends a
{
    public void x()
    {
        System.out.println("in z");
    }

}
public class poly
{
    public static void main(String args[])
    {
        a obj= new c();         //runtym polymorphism also we can create ref of a and objectof c/b as a is the parent class 
        obj.x();

         
        

    }
}
