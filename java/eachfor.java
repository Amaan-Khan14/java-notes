import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class eachfor {
    public static void main(String x[])
    {
        List<Integer>no=Arrays.asList(1,2,3,4,5,6,7,8,9);

        // for(int i=1;i<=no.size();i++)       //normal for loop
        // {
        //     System.out.println(i);
        // }

        // for( int n: no)         //enhanced for loop
        // {
        //     System.out.println(n);
        // }

        // Consumer<Integer> n1=new Consumer<Integer>() {       //foreach main syntax
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };




        no.forEach(n1->System.out.println(n1));     //through lambda expression when only one statement is req


        
    }
    
}
