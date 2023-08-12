class AmaanException extends Exception
{
    public AmaanException(String val)
    {

    }
}
public class myexcept
{
    public static void main(String x[])
    {
        int i=20;
        int j=0;
        try {
            j=18/i;
            if(j==0)
            throw new AmaanException("creating my own exception");
        }

        
        catch(AmaanException e){
            j=18/1;
            System.out.println("Its the default value");
        }
         
        
        
        
        
        catch (Exception e) {
            System.out.println("something went wrong");
            // TODO: handle exception
        }
        
        System.out.println("value of j is"+j);



    }
}