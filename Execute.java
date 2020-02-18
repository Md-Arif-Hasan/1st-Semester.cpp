
package Data_Storing;

import java.io.IOException;

/**
 *
 * @author Arif Hasan
 */
public class Execute {
    public static void main(String[] args) throws IOException {
      TestFile tf = new TestFile();
    tf.writeToFile_BufferWriter();
    tf.readFromFile_BufferReader();  
    }

}
