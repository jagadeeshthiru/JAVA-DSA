class revt
{
   public static void main(String[]args)
    {
           String s="Hello all Good morning";
           String s1[]=s.split(" ");
        for(int x=0;x<s1.length;x++)
          {
             String sn="";
              String str=s1[x];
             for(int y=0;y<str.length();y++)
              {
                  char ch=str.charAt(y);
                  if(y%2==0)
                    { 
                      if(ch>='a'&&ch<='z')
                        {
                            sn=sn+(char)(ch-32);
                        }
                       else if(ch>='A'&&ch<='Z')
                         {
                             sn=sn+(char)(ch+32);
                         }
                       else
                          {
                             sn=sn+ch;
                          }
                    }
              }
              System.out.println(sn);

          }
                }
}