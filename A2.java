class A
{
  int x=5;
  }
 
class B extends A
 {
  int x=10;
  void m2()
  {
    int x=20;
    System.out.println(""+x);
    System.out.println(""+this.x);
    
    System.out.println(""+super.x);
  }
} 

class C
 {
   public static void main(String args[])
   {
     B b =new B();
      b.m2();
    }
 }