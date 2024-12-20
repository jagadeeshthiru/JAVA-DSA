class Exp
{
   public static void main(String[]args)
     {
         int a[]=new int[]{2,3,4,5,6,7};
        System.out.println("Before the exception");
          for(int x=0;x<=a.length;x++)
               {
                 System.out.println(a[x]);
               }
       System.out.println("After the exception");
     }
}