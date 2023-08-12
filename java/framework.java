import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class framework{
    public static void main(String x[])
    {
        // Collection<Integer> num=new ArrayList<Integer>();    //collection doesnt support index value
        // List <Integer>num=new ArrayList<Integer>();
         Set <Integer> num=new HashSet<Integer>(); //set doesnt support index value 
        
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);
        num.add(12);                      //list support repeated values
        // System.out.println(num.get(0));     //to get index values we use list

        // System.out.println(num.indexOf(12));
        //we dont have an index value so we cant use normal for loop so we use enhanced for loop for printing values one by one
        // for(int i:num)
        // {
        //     System.out.println(i);
        // }
         
        
         System.out.println(num);//instead of using for loop nd displaying every element we can directly call it at once by using collection
    }

}