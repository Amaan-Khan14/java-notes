class Vehicle

{
    String noPlate,name;
    int price;

    public Vehicle(String n,String np,double p)
    {
        name=n;
        noPlate=np;
        price=(int)p;
    }

    public Vehicle(String n,String np,int p)
    {
        name=n;
        noPlate=np;
        price=p;


    }
}

public class expt{
    public static void main(String x[]){
        Vehicle obj=new Vehicle("Audi","MH04CJ9768", 400000);  //as per ur intrst(values)
        Vehicle obj1 = new Vehicle("BMW","MH04KK1210",25000);  //as per ur intrst(values)

        System.out.println("Name : "+obj.name+"\nNumber Plate of vehicle : "+obj.noPlate+"\nPrice of Vehicle : "+obj.price);

         System.out.println("Name : "+obj1.name+"\nNumber Plate of vehicle : "+obj1.noPlate+"\nPrice of Vehicle : "+obj1.price);



    }

}


