//4)Sum of even or prod of odd

class Mainn
{
  public static void main(String[]args)
     {
       int a[]=new int[]{22,33,13,45,65,45,56,68,78},sum=0,prod=1;
         for(int x=0;x<=a.length-1;x++)
           {
            if(a[x]%2==0)
              {
                  sum=sum+a[x];              
              }
             else
                {
                   prod=prod*a[x];
                }
           }
         System.out.println("Total sum of elements: "+sum);
        System.out.println("Total prod of elements: "+prod);
     }

}