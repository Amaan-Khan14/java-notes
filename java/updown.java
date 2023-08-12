  class a
  {
    public void show()
    {
        System.out.println("in a");
    }
  }
  class b extends a
  {
    public void show1()
    {
        System.out.println("in b");
    }
  }

  public class updown
  {
    public static void main(String args[])
    {
        a obj= (a)new b(); //upcasting      //ref of a amd obj of b
        obj.show();
        //obj.show1() we cant call mehtod of b as ref is of a and it has no idea tht b exist/show1()
        b obj1=(b)obj;      //downcasting
        obj1.show1();

    }
  }