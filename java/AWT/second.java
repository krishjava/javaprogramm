
import java.awt.*;
import java.awt.event.*;
public class second implements ActionListener {
    Label l;
    TextField tf;
    Button b,b1;
    Frame f;
    second(){
        f=new Frame("MY APP");
        f.setVisible(true);
        f.setSize(400,200);
        f.setLayout(new FlowLayout());
        f.setLocation(100,100);
        b=new Button("Click");
        b1=new Button("No Click");
        f.add(b);
        f.add(b1);
        b.addActionListener(this);
        b1.addActionListener(this);
    }

    // This is callBack method for to write the Business Logic 
     
    public void actionPerformed(ActionEvent arg0){
        System.out.println("hi");

    }
    
    public static void main(String[] args) {
        second fs=new second();
    }
}
