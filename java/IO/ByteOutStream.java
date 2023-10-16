import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ByteOutStream
 */
public class ByteOutStream {

    public static void main(String[] args) throws IOException
    {
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        FileOutputStream fout1 = new FileOutputStream("bout1.txt");
        FileOutputStream fout2 = new FileOutputStream("bout2.txt");
        String s="My name is krishan"+" now"+21;
        byte b[]=s.getBytes();
        bout.write(b);
        bout.writeTo(fout1); 
        bout.writeTo(fout2);
    }
}