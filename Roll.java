
package Exception_Handling;

import javax.swing.JOptionPane;

/**
 *
 * @author Arif Hasan
 */
public class Roll {
    public static void main(String[] args) {
        BSSE student ;
        int flag;
        
        try{
            
            String str = JOptionPane.showInputDialog("Enter the roll :");
  
        // Creating array of string length 
        char[] ch = new char[8]; 
  
        // Copy character by character into array 
        for (int i = 0; i < 8; i++) { 
            ch[i] = str.charAt(i); 
        } 
  
        // Printing content of array 
        //for (int i = 0; i < 8; i++) { 
            if(ch[0]=='B' && ch[1]=='S' && ch[2]== 'S' && ch[3]=='E' &&( ch[4] >= '0' && ch[4] <= '9')&&( ch[5] >= '0' && ch[5] <= '9')&&( ch[6] >= '0' && ch[6] <= '9')&&( ch[7] >= '0' && ch[7] <= '9'))
            {
                flag =1;
                student = new BSSE(flag);
            }
            else
            {
                flag =0;
                student = new BSSE(flag);
            }
       // } 
            
        
        
          
    }
        catch(RollException e)
        {
            System.out.println(e.getMessage());
        }
          
  } 
}
