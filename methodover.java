class methodover
 {
   int x=3;
  void m1()
   {
     System.out.println(""+x);
    }
  void m1(int a)
   {
     System.out.print(""+a);
    }
  }

  class B
  {
     public static void main (String args[])
    {
      methodover c=new methodover();
           c.m1();
           c.m1(23);
     }
 }
     