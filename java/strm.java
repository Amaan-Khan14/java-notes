import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class strm {
    public static void main(String x[])
    {
        List<Integer>no=Arrays.asList(1,2,4,5,6);
        // Stream<Integer>s = no.stream();
        // Stream<Integer> s1=s.filter(n->n%2==0);
        // s1.forEach(n->System.out.println(n));
       int result= no.stream()   //better way for stream api
        .filter(i->i%2==0)
        .map(i->i*2)
        .reduce(0,(c,e)->c+e);
        System.out.println(result);

        
    }
}
