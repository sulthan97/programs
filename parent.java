class parent 
{
   String name="subyth";
 
   parent()
    {

    }
    void dostuff()

     {
      System.out .print(""+name);
     }
  }


    
   class child extends parent
   {
     public static void main(String args[])
      {
        parent j=new parent();
           j.dostuff();
      }
}
  
   