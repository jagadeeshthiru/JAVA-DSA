//2)prime element in array
class Primearray
{
     public static void main(String[]args)
     {
       int a[]=new int[]{22,33,13,7};
         for(int x=0;x<=a.length-1;x++)
           {
             int count=0,num=a[x];

            for(int y=1;y<=num;y++)
             {
                  

                 if(num%y==0)
                {
                 count++;
               }
             }
            if(count==2)
            {
               System.out.println("The prime numbers: "+a[x]);
            }
          }
        
     }

}