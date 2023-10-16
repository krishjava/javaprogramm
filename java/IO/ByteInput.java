import java.io.ByteArrayInputStream;

/**
 * ByteInput
 */
public class ByteInput {

    public static void main(String[] args) {
        byte b[]={35,36,37,38};
        ByteArrayInputStream bin = new ByteArrayInputStream(b);
        int k = 0;  
         while ((k = bin.read()) != -1) {  
       
        char ch = (char) k;  
        System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch); 
         } 
    }
}



