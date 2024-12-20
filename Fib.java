class Fibonacci1
 {
 public static void main(String[]args)
    {
            
         int a=0,b=1,n=20,c=0,i=1;
         while(i<=n)  
         {
           c=a+b;   // 1 2 3 5 8 13 21 33 55	
           System.out.println(a); // ANS: 0 1 1 2 3 5 8 13 21
           a=b; // 1 1 2 3 5 8 13 21 34
           b=c;    // 1 2 3 5 8 13 21 34 55

            
           i++;
           
       }
    }
}