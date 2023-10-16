import java.util.ArrayList;
import java.util.Iterator;

/**
 * insert_user_def
 */
// From emp.java
public class insert_user_def {

    public static void main(String[] args) {
        ArrayList<emp> a= new ArrayList<emp>();
        // LinkedList,vector same as this 
        emp e1= new emp("krishan", "HCL", 21, 110);
        emp e2 = new emp("vikash", "MS", 20, 122);
        emp e3 = new emp("Rahul", "Oracle", 20, 1220);
        a.add(e1);
        a.add(e2);
        a.add(e3);
        System.out.println("By Object..");
        System.out.println(a);
        System.out.println();

        Iterator<emp> i = a.iterator();
        while(i.hasNext()){
            emp e = (emp)i.next(); // It is done by Without type casting bcz it is generic.....   emp e = i.next();
            e.show();
            System.out.println();
         // ystem.out.println(e);
        }
    }
}