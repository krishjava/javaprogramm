import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * printwrite
 */
public class printwrite {

    public static void main(String[] args) throws IOException {
        Writer w=new FileWriter("printwriter.txt");
        PrintWriter pw=new PrintWriter(System.out);
        PrintWriter pw1=new PrintWriter(w);
        pw1.write("print writer class ...");
        pw1.flush();
        pw.write("Console Output");
        pw.write("& Println() called by Passing true....");
        pw.close();
    }
}