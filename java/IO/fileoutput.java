import java.io.FileOutputStream;
 
public class fileoutput {

    public static void main(String[] args) {
       try {
        //FileOutputStream fout= new FileOutputStream("fileout.txt");  // This for Update Mode 
        FileOutputStream fout= new FileOutputStream("fileout.txt",true);  // This for Append Mode 
        //String s="My name is krishan kumawat ";
        // ORRR
        String s=javax.swing.JOptionPane.showInputDialog(null,"Enter the Text..");
        byte b[]=s.getBytes();
        /*for(int i=0; i<b.length; i++){
            fout.write(b[i]);
        }*/
        //  ORRRR
        fout.write(b);
        fout.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
        }
    }
