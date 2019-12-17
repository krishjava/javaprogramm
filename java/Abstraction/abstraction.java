import java.util.Scanner;

abstract class Masterremote{
    abstract void changeChannel();
    abstract void changeVolume();
    abstract void changeColor();
}
class samsung extends Masterremote{
    void changeChannel(){
        System.out.println("Samsung Channel Changed :");
    }
    void changeVolume() {
        System.out.println("Samsung Volume Changed :");
    }
    void changeColor() {
        System.out.println("Samsung Color Changed :");
    }
}
class Lg extends Masterremote{
    void changeChannel(){
        System.out.println("Lg Channel Changed :");
    }
    void changeVolume() {
        System.out.println("Lg Volume Changed :");
    }
    void changeColor() {
        System.out.println("Lg Color Changed :");
    }
}
class operate {
    public static void main(String[] args) {
       try {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Class Name : ");
        String name =  s.nextLine();
        Class c =Class.forName(name);
        Masterremote m =(Masterremote)c.newInstance();
        m.changeChannel();
        m.changeColor();
        m.changeVolume();
       } catch (Exception e) {
           System.out.println("Exception = "+e);
       }
    }
}