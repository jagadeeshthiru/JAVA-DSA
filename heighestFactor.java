class Factor12
{
   public static void main(String[]args)
    {
          int num =1,end=35,temp=0;//35=====1,5,7,35   24==1,2,3,4,6,12,24
          while(num<end) //1<35
           {
               if(end%num==0)//35%1==0
           
                {
                     
                        System.out.println(num);
                temp=num;//1
                }
            num++;
           }
System.out.println(" second heihest factor"+temp);


       }
}