import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * linklist
 */
public class linklist {

    public static void main(String[] args) {
        
        System.out.println("this is default constructor.......");
        LinkedList l = new LinkedList();
        l.add("one");
        l.add("two");
        l.add("three");
        System.out.println(l);
        System.err.println();
        System.out.println("this is collection parameterized constructor.......");
        LinkedList l1 = new LinkedList();
        l1.add("four");
        l1.add("five");
        System.out.println(l1);
        System.out.println();
        System.out.println("Traversal by Iterator.......");
        Iterator i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();
        System.out.println("Generic Collecion");
        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("t");
        l2.add("w");
        l2.add("o");
        l2.add("2");
        Iterator ii = l2.iterator();
        while (ii.hasNext()) {
            String s=(String)ii.next();
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Traversal by ListIterator.......");
        ListIterator<String> list= l2.listIterator();
        System.out.println("Forward Traversal.......");
        while (list.hasNext()) {
            String s=(String)list.next();
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Backward Traversal.......");
        System.out.println("Forward Traversal.......");
        while (list.hasPrevious()) {
            String s=(String)list.previous();
            System.out.println(s);
        }
        System.out.println();
        System.out.println("LinkedList as Dequeue.......");
        System.out.println("At 1 Position = "+l.getFirst());
        System.out.println("At Last Position = "+l.getLast());
        System.out.println(l);
        l.addFirst("me");
        l.addLast("main");
        System.out.println(l);
        l.add(3,"krish");
        System.out.println(l);

        System.out.println();
        System.out.println("LinkedList as Dequeue.......");
        LinkedList<Integer> l3= new LinkedList<Integer>();
        l3.push(10);
        l3.push(0);
        System.out.println(l3.peek());
        System.out.println(l3);
        l3.pop();
        System.out.println(l3);

    }
}