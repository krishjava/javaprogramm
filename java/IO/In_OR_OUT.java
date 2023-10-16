import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * In_OR_OUT
 */
public class In_OR_OUT {

    public static void main(String[] args) {
       try {
        FileOutputStream fout=new FileOutputStream("fout.txt",true);
        String s="My name is krishan "+" now i am in BCA 3 year";
        byte b[]=s.getBytes();
        fout.write(b);

        FileInputStream fin=new FileInputStream("fout.txt");
        
        int i=0;
        while(((i=fin.read())!=-1)){
            System.out.print((char)i);
        }
        // Orr
        /*while(true){
        int i=fin.read();
        if(i==-1)
        break;
        System.out.print((char)i);
        }*/

       } catch (Exception e) {
           e.printStackTrace();
       }

    }
}
