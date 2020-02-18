
package Data_Storing;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class TestFile {
    
    private String FILENAME = "hello.txt";
    
    public void writeToFile_BufferWriter()
    {
        
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String content = JOptionPane.showInputDialog("About IIT DU");
            
            fw =new FileWriter(FILENAME,true);
            bw = new BufferedWriter(fw);
            bw.write(content);
            
            bw.write("\n");
            System.out.println("Write Done "+ content);
            
             if(bw != null){ bw.close();}
            if(fw != null) fw.close();
        }
        
        catch(IOException e)
        {
            System.out.println("Problem in File Write "+ e.getMessage());
        }
        
        finally
        {
           
        }
        
    }
    
    public void readFromFile_BufferReader() throws IOException 
    {
        BufferdReader br = null;
        FileReader fr = null;
        
        try{
            fr = new FileReader(FILENAME);
            br = new BufferdReader(fr);
            
            String sCurrentLine;
            
            while((sCurrentLine = br.readLine())!= null)
            {System.out.println(sCurrentLine);
            
        }
    }
        
       catch(IOException e)
       {
           System.out.println("Problem File Read" + e.getMessage());
       }
        
        finally
        {
            if(br != null) br.close();
            if(fr != null ) fr.close();
}
}
}
