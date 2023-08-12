import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;


public Student (int a,String n ){
    age=a;
    name=n;

}

public String toString(){
    return "Student age="+age+" Student name= "+name;
}
}

public class srt{
    public static void main(String x[]){
      
        // Comparator<Student>studs=new Comparator<Student>() {            //student is a typ here tht we want 2 sort
        //     public int compare(Student i,Student j)
        //     {
        // //        if(i.age>j.age)
        // return 1;
        
        // else return-1
        // //     }
        // // };

        Comparator<Student> studs=(Student i,Student j)->  {           //we here uses a lambda expression as comparator is a functional interface 
            // if(i.age>j.age)
            // return 1;
            // else
            // return -1;

            return i.age>j.age? 1: -1; //we can also use ternary operator
        };

    
        List<Student>nums=new ArrayList<Student>();
        
        nums.add(new Student(15, "Amaan"));
        nums.add(new Student(10, "John"));
        nums.add(new Student(41, "Father"));
        nums.add(new Student(20,"xyz"));

        Collections.sort(nums, studs);      //for sorting

        for(Student s:nums)
         System.out.println(s);
    //     System.out.println("before use of sort"+nums);
     
    //     System.out.println("after using sort"+nums);
   }
}

    

