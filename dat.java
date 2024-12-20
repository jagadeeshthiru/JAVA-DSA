import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class dat
{
    public static void main(String[]args) throws FileNotFoundException, IOException, SQLException
    {    
    try{
        FileReader file=new FileReader("C:\\Users\\jagadeesh\\Desktop\\dta.txt");
       } 
         /*catch (FileNotFoundException se) 
             {
                 System.out.println("Exception Handle");
            }  */ 
            catch (SQLException fe) 
             {
                 System.out.println("Exception Handle1");
            }    
    }
}