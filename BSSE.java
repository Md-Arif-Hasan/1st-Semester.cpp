
package Exception_Handling;

public class BSSE {  
  private int test;
 
  
  public BSSE(int test) throws RollException{
      if((test==1))
      {
          this.test = test;
         
          System.out.println(" Correct !");
      }
      
        if(test==0)
      {
          this.test = test;
         
          System.out.println(" Invalid !");
      }
    
    }
}

 
