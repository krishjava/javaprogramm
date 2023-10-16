import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferwiter {

    public static void main(String[] args)throws IOException {
        FileWriter fw=new FileWriter("./bufferwriter.txt");
        BufferedWriter wr=new BufferedWriter(fw);
        String s="jhkhhiuwhk";
        wr.write(s);
        wr.flush();
    }
}