
import java.io.*;

/**
 * write_stream
 */
public class write_stream {

    public static void main(String[] args) throws IOException {
        Writer w = new FileWriter("Writer.txt");  
        String s="This is Writer Class";
        w.write(s);
        w.close();
        System.out.println("Success");
        }
}