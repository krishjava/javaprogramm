import java.util.*;

 
public class iterator {

    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(12);
        a.add(10);
        a.add(201);
        a.add(200);
        System.out.println(a);
        Iterator i=a.iterator();
        System.out.println(i);
        System.out.println(i.next());

        while(i.hasNext()){
            System.out.println(i.next());
        }
        // Other way to Traverse all elements
        System.out.println("Other Way......"); 
        while(i.hasNext()){
            Integer ii=(Integer)i.next(); // Here 'i' is Implementing type class But i am cast in integer 
            System.out.println(ii);
        }
        System.out.println("Traversal by ListIterator ......");
        ListIterator li=a.listIterator();
        System.out.println(li);

        System.out.println("It is for Forward Direction.....");
        while(li.hasNext()){
            System.out.println(li.next()); // It does not Generate Any Error 
        }

        System.out.println("It is for Backward Direction.....");
        while(li.hasPrevious()){
            System.out.println(li.previous()); // It does not Generate Any Error 
        }
        System.out.println(li.next());

      
    }
}