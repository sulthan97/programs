 class elevator
      {
       
 public static void main ( String args[])
      { 
          int uf=7;
          int ud=10;
          

        if (uf > 10|| uf < 0 )
        {
            System.out.println("Invalid selection");
        }

       else if (uf <= ud && uf > ud)
           {
            for (int i = 1; i <= uf; i++)
                System.out.println(""+ i);
      }
    }
}