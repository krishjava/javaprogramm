import java.io.Console;

public class consoledemo {
    public static void main(String[] args) {
        Console c= System.console();
        String name= c.readLine("Enter your Name : ");
        char ch[]=c.readPassword("%s","Password : ");
        String str=new String(ch);
        System.out.println(name);
        System.out.println(str);
    }
}