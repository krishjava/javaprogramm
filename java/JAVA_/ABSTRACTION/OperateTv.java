import java.util.Scanner;

public class OperateTv {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of Tv....");
        String Tv=s.nextLine();

        try {
            Class c=Class.forName(Tv);
          MasterRemote m=(MasterRemote)c.newInstance();
          m.changeChannel();
          m.changeColor();
          m.changeVolume();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}