import java.util.*;
public class ass18 {

    public static void main(String[] args) {
        String s="i am a student";
        String s1=" and from Bca";
        String s2="krishan";
        String s3="KRISHAN";
        String s4="     KRishan's File    ";
        System.out.println("Length = "+s.length());
        System.out.println(s.concat(s1));
        System.out.println("S2(String) equal to s3(String)"+s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println("Index of 'k' is "+s2.indexOf("k"));
        System.out.println(s4.trim());
        System.out.println(s2.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s1.replace("and ","& "));
        String s5="krish kumawat";
        System.out.println(s5.replaceFirst("k","KK"));
        System.out.println(s5.replaceAll("k","KK"));
        System.out.println(s.startsWith("i"));
        System.out.println(s.endsWith("tn"));
    }
}