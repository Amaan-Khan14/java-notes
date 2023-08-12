interface A
{
    String name="Amaan";
    int age= 19,rollno=78;
    float dob=14.1004f;

    void displayAge();
}

interface B extends A
{
    void displayRollNo();
   
}
interface C
{
    void displayDob();

}
   

class display implements B,C            //we can directly used two interfacing seperating by comma(,) nd as b extend a we can only use b for implementation
{
    public void displayAge()
    {
        System.out.println("age"+age);
    }

    public void displayRollNo()
    {
        System.out.println("Roll No is "+rollno);
    }

    public void displayDob()
    {
        System.out.println("Date of Birth is "+dob);
    }

}

public class interfac
{
    public static void main(String arg[])
    {
        display obj= new display() ;
        obj.displayAge();
        obj.displayRollNo();
        obj.displayDob();
        System.out.println("name is "+A.name);  // to call static in other class we can also use only the class name.var

    }
}
