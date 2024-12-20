import java.io.FileReader;
import java.io.FileNotFoundException;
class data
{
    public static void main(String[]args) 
    {
       try
       {
           FileReader file=new FileReader("C:\\Users\\jagadeesh\\Desktop\\dta.txt");
           System.out.println("file is found so excepton is not found");
        }
       catch(FileNotFoundException e)
          {
              System.out.println("File not found exception will occured");
          }

    }

}