import java.util.Scanner;

enum Status
{
    Failed,Loadin,Success,Running;
}


public class enm {
    public static void main(String args[])
    {
        Status s=Status.Failed;
        Scanner sc=new Scanner(System.in);
        
        switch(s)
        {
            case Failed:
            System.out.println("process failed");
            break;

            case Loadin:
            System.out.println("loading");
            break;

            case Running:
            System.out.println("in progress");
            break;

            case Success:
            System.out.println("completed successfully");
            break;

        }
    
        // if(s==Status.Failed)
        // System.out.println("process failed");
        // else if(s==Status.Loadin)
        // System.out.println("loading");
        // else if(s==Status.Running)
        // System.out.println("in porgress");
        // else
        // System.out.println("process completed");
       
    }
    
}
