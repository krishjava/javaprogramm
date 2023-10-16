/**
 * string_buli_capacity
 */
public class string_buli_capacity {

    public static void main(String[] args) {
        System.out.println("Default Constructor......");
        StringBuffer s = new StringBuffer();
        String s1="krishan";
        s1.intern();
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append("krishan");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append("kumawat BCA");
        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println();
        s.append("kkkkkkkkkkkkkkkk");
        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println();
        s.append("r");
        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println();
        s.append("i");
        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println();
        s.append("krishankumawat BCAkkkkkkkkkkkkkkkk");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append("k");
        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println("Parameterized Constructor for Initial value ......");
        StringBuffer s1 = new StringBuffer(4);
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        System.out.println();
        s1.append("kris");
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        System.out.println();
        s1.append("h");
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        s1.append("h kuma");
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        System.out.println("Parameterized Constructor for String type value ......");
        StringBuffer s2  = new StringBuffer("krish");
        System.out.println(s2.length());
        System.out.println(s2.capacity());
        System.out.println();
        s2.append("kumar");
        System.out.println(s2.length());
        System.out.println(s2.capacity());
        System.out.println();
        s2.append("kumarkkkkkk");
        System.out.println(s2.length());
        System.out.println(s2.capacity());
        System.out.println();
        s2.append("k");
        System.out.println(s2.length());
        System.out.println(s2.capacity());
        System.out.println(s2);
    }
}