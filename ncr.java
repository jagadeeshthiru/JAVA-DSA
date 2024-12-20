class Factorial
{
       public static void main(String[]args)
        {
             int n=15,c,r=6,fact=1,fact2=1,ncr;
             int p =n-r;
              while(n>=1)
             
                   {
                    fact =fact*n;
                      n--;  
                        while(r>=1)
                         {
                             fact2 =fact2*r;
                             r--;
                         }
                  }
              System.out.println(fact);
              System.out.println(fact2);
              ncr=fact/(fact2*p);
            System.out.println(ncr);
         }
}