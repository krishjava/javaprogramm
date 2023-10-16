
import java.awt.*;
import java.awt.event.*;
public class First implements ActionListener {
    Label l;
    TextField tf;
    Button b,b1;
    Frame f;
    First(){
        f=new Frame("MY APP");
        f.setVisible(true);
        f.setSize(400,200);
        f.setLayout(new FlowLayout());
        f.setLocation(100,100);
        b=new Button("Click");
        f.add(b);
        b.addActionListener(this);
    }

    // This is callBack method for to write the Business Logic 
     
    public void actionPerformed(ActionEvent arg0){
        System.out.println("hi");

    }
    public static void main(String[] args) {
        First fs=new First();
    }
}