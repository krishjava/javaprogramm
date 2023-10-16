import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * vactor
 */
// Methods in vactor.txt

public class vactor {

    public static void main(String[] args) {
        Vector v= new Vector();
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());
        v.add(10); // add() method of 
        v.addElement(12);  // addElement() method of Enumeration Legacy
        System.out.println(v);
        v.addElement(12);
        v.addElement(12);
        v.addElement(12);
        v.addElement(12);
        v.addElement(12);
        v.addElement(12);
        v.addElement(12);
        v.addElement(12);
        v.addElement(13);
        System.out.println("Beyond the capacity.........");
        System.out.println("Capacity = "+v.capacity());
        System.out.println("size = "+v.size());

        System.out.println("We can Initlize the initial Capacity......");
        Vector vv = new Vector(2);
        System.out.println("Initial Capacity = "+vv.capacity());
        vv.add(100);
        vv.add(200);
       
        System.out.println("size = "+vv.size());
        System.out.println("Beyond the capacity.........");
        vv.add(300);
        System.out.println("Capacity = "+vv.capacity());
        System.out.println("size = "+vv.size());

        System.out.println("we can pass Vector object in vector constructor............");
        Vector vvv  = new Vector(vv);
        System.out.println("Initial Capacity = "+vvv.capacity());
        System.out.println(vvv);
        System.out.println("Beyond the capacity.........");
        vvv.add(200);
        System.out.println("Capacity = "+vvv.capacity());
        System.out.println();
        System.out.println("Here we can define increment size itself........");
        Vector v4= new Vector(3,2); // capacity=3     incremental factor= 2
        System.out.println("Capacity = "+v4.capacity());
        System.out.println("size = "+v4.size());
        v4.add(2000);
        v4.add(3000);
        v4.add(5000);
        System.out.println(v4);
        System.out.println("Beyond the capacity.........");
        v4.add(200);
        System.out.println("Capacity = "+v4.capacity());
        System.out.println();
        System.out.println("Traversal by Iterator..........");
        Iterator i=vv.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println();
        System.out.println("Traversal by Enumeration..........");
        Enumeration  e=vv.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}