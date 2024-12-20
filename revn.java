class revn
{
 public static void main(String[]args)
   {
    String s="hello all good morning";
    String s1[]=s.split(" ");
    StringBuffer sn=new StringBuffer();
   for(int x=0;x<s1.length;x++)
     {
      String str=s1[x];
           
        for(int y=0;y<str.length()-1;y++)
         {
            StringBuffer sb=new StringBuffer(str);
            sb.reverse();
            sn=sb;
           
         }
 System.out.println(sn);
       
     }
   }
}