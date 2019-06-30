class palindrome
 { 
   public static void main (String args[])
 {
   int a,n,sum=0;
     n=323;
      
     a=n%10;
    sum=(sum*0)+a;
      n=n/10;
    if(a==n)
    {
      System.out.println("palindrome");
    }
  }
}
 