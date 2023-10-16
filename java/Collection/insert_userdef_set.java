/**
 * insert_userdef_set
 */

import java.util.*;
public class insert_userdef_set {

    public static void main(String[] args) {
        HashSet<emp> h= new HashSet<emp>();
        h.add(new emp("kumar", "Tesla", 30, 122));
        h.add(new emp("krish", "Google", 22, 122));
        h.add(new emp("ajay","HCL",23,122));
        System.out.println(h);
    }
}