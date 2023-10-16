import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * BufferedOutPut
 */
public class BufferedOutPut {

    public static void main(String[] args) throws IOException{
        FileOutputStream fout=new FileOutputStream("buffered.txt");
        BufferedOutputStream buff=new BufferedOutputStream(fout);
        String s="Welcome in BufferedOutputStream";
        byte b[]=s.getBytes();
        buff.write(b);
        buff.flush(); // It is mandatory to flush the data in file 

    }
}