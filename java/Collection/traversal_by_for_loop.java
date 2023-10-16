import java.util.*;

/**
 * traversal_by_for_loop
 */
public class traversal_by_for_loop {

    public static void main(String[] args) {
        ArrayList  a=new ArrayList();
        a.add(12);
        a.add(10);
        a.add(201);
        a.add(200);
        System.out.println(a);
        System.out.println("Traversal by For loop...........");
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i)); //  get() this is the method of ArrayList
        }
        System.out.println("Traversal by Foreach loop...........");
        for(Object o:a){
            System.out.println(o);
        }
    }
}