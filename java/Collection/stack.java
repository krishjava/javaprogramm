import java.util.Iterator;
import java.util.Stack;

/**
 * stack
 */
public class stack {

    public static void main(String[] args) {
        Stack  s= new Stack();
        System.out.println(s);
        s.push(1);
        s.push("one");
        s.push(2);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());

        System.out.println();
        System.out.println("Traversal by Iterator....");
        Iterator i= s.iterator();
        while(i.hasNext()){
           // System.out.println(i.next());  Or
           Object o= (Object)i.next();
           System.out.println(o);
        }
    }
}