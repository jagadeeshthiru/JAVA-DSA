class Sqrt
{
    public static void main(String[]args)
       {
              int num=1;
                                
                   

                 while(num<=1000) 
                 {
                   double num1 =Math.sqrt(num);
                  int num2 =(int)num1;

              
                    if(num1==num2)
                     {
                        System.out.println("It is a perfect Squre :"+num);
                      }
                  num++;
                 }
                
        }
}