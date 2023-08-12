import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class input {
    public static void main(String x[]) throws IOException
    {
         int num1,num2;
         String name;

        // InputStreamReader a=new InputStreamReader(System.in);
        // BufferedReader b=new BufferedReader(a);
        // System.out.println("Enter two values element");
        // num1= Integer.parseInt(b.readLine());
        // num2=Integer.parseInt(b.readLine());
        // System.out.println("Value of 1st number:"+ num1 +" \nValue of 2nd num : " +num2);
        // int add=num1+num2;
        // System.out.println("Sum is : "+add);
        // b.close();

        Scanner a=new Scanner(System.in);
        
        System.out.println("Enter ur name");
        name=a.nextLine();
         System.out.println("Enter any two values");
        num1=a.nextInt();
        num2=a.nextInt();
        System.out.println("Value of 1st number:"+ num1 +" \nValue of 2nd num : " +num2);
        System.out.println("My name is :" +name);
        int add=num1+num2;
        System.out.println("Sum is : "+add);
        a.close();



        
        

    }
    
}
