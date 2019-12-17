package p2;
import static p1.test1.*;

import p1.test1;
/**
 * test2
 */
public class test2 extends test1{

    public static void main(String[] args) {
        System.out.println(y);
        System.out.println(new test2().x);
        new test2().show();
    }
}