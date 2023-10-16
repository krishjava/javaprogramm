/**
 * Startwith
 */
public class Startwith {
    public static void main(String[] args) {
    String s = "krishankumawat"; 
    System.out.println(s);
    
    System.out.println(s.startsWith("kr"));
    System.out.println(s.startsWith("Kr"));

    System.out.println(s.startsWith("ha", 5));
    System.out.println(s.startsWith("ha", 4));
    }
}