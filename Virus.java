class Virus
{
   public static void main(String[]args)
     {
     String s="Vital information resources under size";
       String s1[]=s.split(" ");
       
       for(int x=0;x<s1.length;x++)
         {
           String sn="";
            String str=s1[x];
            for(int y=0;y<str.length();y++)
                {
                  char ch=str.charAt(y);
                  if(y==0)
                   {
                     sn=sn+ch;
                   }
                }
            System.out.print(sn);
         }
     }
}