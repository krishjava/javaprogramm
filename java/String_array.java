/**
 * String_array
 */
public class String_array {

    public static void main(final String[] args) {
        String s = "krishan";
        //s[1]='o';
        //String s1="krishan";
        String s1=new String("krishan");
        String st=s1.intern();
        System.out.println(s.equals(s1));
        System.out.println(s==st);
    }
}