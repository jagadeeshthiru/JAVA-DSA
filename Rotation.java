//3)left and right rotations



class Rotation
{
public static void main(String[]args)
     {
       int a[]=new int[]{10,20,30,40,50};
         int temp=a[a.length-1];
         for(int x=a.length-1;x>=0;x--)
           {
             if(x==0)
             {
              a[x]=temp;
             }
             else
               {
                a[x]=a[x-1];
                }
           }
          for(int t:a)
           {
             System.out.println(t);
           }
         
      } 
}
