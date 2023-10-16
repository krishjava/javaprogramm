/**
 * Hashset
 */
import java.util.*;
public class Hashset {

    public static void main(String[] args) {
        HashSet h= new HashSet();
        System.out.println(h);
        h.add("one");
        h.add(2);
        h.add(2);
        h.add("e");
        h.add("1");
        System.out.println(h);

        System.out.println("Traversal by iterator....");
        Iterator i= h.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println();
        System.out.println("ArrayList..");
        ArrayList a= new ArrayList(h);
        a.add("one");
        System.out.println(a);

        System.out.println("Linked Hashset...");
        LinkedHashSet h1= new LinkedHashSet();
        System.out.println(h1);
        h1.add("one");
        h1.add(2);
        h1.add(2);
        h1.add("e");
        h1.add("1");
        System.out.println(h1);
    }
}