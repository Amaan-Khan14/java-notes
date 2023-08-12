abstract class A
{
    public abstract void show();
    // {
    //     System.out.println("in a");
    // }
   
    
} 

public class anonymos
{
    public static void main(String args[])
    {
        A obj=new A()
    //     {                   //anonymous class, it will pver ride the show method 
    //        public void show()
    //        {
    //             System.out.println("in new a");
    //        }  
    //     };                          //we use semicolon after the bracket for anonymous class
    //    obj.show();
    {
         public  void show()
         {
            System.out.println("in anonymous abstract class");

         }

    };
         obj.show();
    }
    
   
    
}
