class A
{
 int x;
  A(int x)
 {
   x=this.x;
   this.x++;
}
  void print()
  {
     System.out.print(x);
 }
}


class demo
{
 public static void main (String args[])
 {
  A.a=newA(5);
 }
}