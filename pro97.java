/*    
   /*         *
     *       *
      *     *
       *   *
        * *
        * *
       *   *
      *     *
     *       *

    */
    class pro97{
        public static void main(String args[])
        {
           for(int i=1;i<=10;i++)
           {
               for(int j=1;j<=11;j++)
               {
                if(i==j || j==12-i )System.out.print("^");
                else System.out.print(" ");   
               }
               System.out.println();
           }
        }
    }