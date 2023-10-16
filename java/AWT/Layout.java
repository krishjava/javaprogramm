/**
 * Layout
 */

import java.awt.*;
public class Layout {

    public static void main(String[] args) {
        
        Frame f= new Frame("MY GUI");
        f.setVisible(true);
        f.setSize(400,400);
        //f.setLocation(200,200);
        System.out.println(f.getLocation());
    }
}