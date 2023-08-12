class Human
{
      public Human()
      {
        
        System.out.println("in human");

      }  

      public Human(int n)
      {
        this();
         System.out.println("in human int");
      }
}



class Human1 extends Human
{
    public Human1()
    {
        super(5);                                   //calls constructor of the super class
        System.out.println("in human1");
    }

     public Human1(int n)
      {
        //super();
        this();                                      //calls the constructor of the same class
         System.out.println("in human int1");
      }
}
public class ThisSuper
{
    public static void main(String args[])
    {
        Human1 obj= new Human1(5);
      
    }
}