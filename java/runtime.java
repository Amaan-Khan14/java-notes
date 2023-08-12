public class runtime
{
    public static void main (String args[])
    {
        int i=2;
        int j=0;
        int nums[]=new int [5];
        String name=null; 
         try             
        {
            j=18/i;             //compiler will get the idea we are jsut experimenting something 
            // System.out.println(nums[5]);
            System.out.println(name.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("string is null");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("enter a valid limit");
        }
        catch (ArithmeticException e)
        {
            System.out.println("calculation is wrong");
        }
         catch (Exception e)            //always put parent class at the end 
        {
            System.out.println("something went wrong");
            // TODO: handle exception
        }

        System.out.println("value of j is "+j);
        System.out.println(("execution will still complete"));               
    }
}