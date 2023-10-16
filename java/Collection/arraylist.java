import java.util.ArrayList;

/**
 * arraylist
 */
public class arraylist {
    public static void main(String[] args) {
        ArrayList al= new ArrayList<>();
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al);
        al.add(12);
        al.add(12.3);
        al.add(12);
        System.out.println(al.isEmpty());
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(10));
        System.out.println(al.contains(12));
        al.add(1,20);
        System.out.println(al);
        al.set(2, 200);
        System.out.println(al);

        ArrayList al1= new ArrayList<>();
        al1.add(12);
        al1.add(10);
        al1.add(100);
        System.out.println(al1);
        al1.removeAll(al);
        System.out.println(al1);
    }
}