class A
{
  int a,b;
void disp(int a)
{
System.out.println(""+a);
}
}
class B extends A
{
void mirror(int b)
{
System.out.println(""+b);
}
}
class C extends B
{
public static void main(String args[])
{  
C obj=new C();  
obj.disp(5); 
obj.mirror(6);
}  
}  