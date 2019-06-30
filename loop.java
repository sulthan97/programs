class Loop
  { 
    public static void main (String args[])
{  
  int n=1;
     for(n=1; n<=50; n++)
           {  
            if(n%3=0 && n%5!=0)
               {
                  System.out.println("bing");
               } else if( n%5=0 && n%3!=0 )
                         
                    {   
                        System.out.println("bong");

                     } else if(n%3=0 && n%5=0)
                             
                             { 
                                  System.out.println("bing bong");
                              }else{
                                     System.out.println(n); 
                                  }

                    }


           }
   }
                         
             
           