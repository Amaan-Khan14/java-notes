

@FunctionalInterface                    //interface must have only one method
interface Student
{
    void name(String name);
}

@FunctionalInterface

interface Plus
{
    int add(int i,int j);
}
public class funinterfac 
{
    public static void main( String x[])
    {
         Student s = (name) -> System.out.println("my name is "+ name);                    //-> is known as lambda expression nd is used only in functional interface for chngs chk interfac.java file nd anonymous.java
         s.name("Amaan");

         Plus ad= (i,j) -> i+j;             //int is a return typ we dont have to mention return we can directly call wat we want to return
         int result = ad.add(5,40);
         System.out.println("sum is "+result);

    


    }
    
}