class A
{
    
    public void z()
    {
        System.out.println("7");
    }
}

class B extends A                           //b will inherit proeprties of A
{
    public void x()
    {
        System.out.println("5");

    }


}

class C extends B                            //C willinherit properties of B and A
{
    public void y()
    {
         System.out.println("6");
    }

}
public class inheritance
{
    public static void main(String args[])
    {
        C obj=new C();                  //we can cal the method of parent class by creating the object of the parent class only
        obj.y();
        obj.x();
        obj.z();
    }
}