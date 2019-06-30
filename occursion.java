class occursion
{
 public static void main(String argss[])
 {
   char x[]={'a','a','b','b','b','c','c'};
    int a[]=new int[300];  
     for (int i=0;i<x.length;i++)
     {
       int y=x[i];
        a[y]=a[97]+1;
    System.out.print(""+a[y]);
      }
   }
 }