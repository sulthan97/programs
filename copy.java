class student
{
  int x;
  int y;
 student()
  {
 
   }
 student(student s)
   {
    x=s.x;
   }
  }
  
  class demo
 {
  public static void main (String args[])
{
    student s=new student();
        s.x=10;
        s.y=20;
     student s1=new student (s);
  }
}