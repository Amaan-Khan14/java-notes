class students                  //concrete class
{
    private int marks;                    //encapsulation
    private String name;            //private can only be called in the same group
    
    public students()                        //constructor named after the clsss w/o data typ 
    {
        marks=20;                            //can assign the value 
        name="khan";
                                             //will be called whenever an obj is created
    }
    public students(int a, String n )        //paramatized cosntructor 
    {
        marks=a;
        name=n;
    }

    public int  getmarks()                  //getters 
    {
        return marks;
    }
    public void setname(String n)          //setters
    {
        name=n;
    }

     public String getname()
     {
        return name;
     }
     public void setage(int a)
     {
        marks=a;
     }

}
public class demo
{
    public static void main( String[] args)
    {
        students n= new students();
        students n1=new students(10, "amaan");    //when dont want the default values we can assign a new one         

        //  n.setage(30);
      //  n.setname("amaan");

      System.out.println(n.getname()+n.getmarks());
      System.out.println(n1.getname()+n1.getmarks());


    }

   
}