import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * BufferedInput
 */
public class BufferedInput {

    public static void main(String[] args)throws IOException {
        FileInputStream fin=new FileInputStream("buffered.txt");
        BufferedInputStream buff=new BufferedInputStream(fin);
        while(true){
            int i=buff.read();
            if(i==-1)
            break;
            System.out.print((char)i);
        }
    }
}