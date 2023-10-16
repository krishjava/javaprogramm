
import java.awt.*;
import java.awt.event.*;
public class third implements ActionListener {
    Label l;
    TextField tf;
    Button b,b1;
    Frame f;
    third(){
        f=new Frame("MY APP");
        f.setVisible(true);
        f.setSize(400,200);
        f.setLayout(new FlowLayout());
        f.setLocation(100,100);
        b=new Button("Click");
        b1=new Button("No Click");
        tf=new TextField(10);

        f.add(tf);
        f.add(b);
        f.add(b1);
        b.addActionListener(this);
        b1.addActionListener(this);
    }

    // This is callBack method for to write the Business Logic 
     
    public void actionPerformed(ActionEvent e){
        // System.out.println(e.getActionCommand()); // It retirns the String of Component 
        // System.err.println(e.getSource());       // It retirns the Object of Component 
        Object o=e.getSource();
    
        if(o == b1){
            System.out.println("No Click..");
            tf.setText("No clicked....");
        }
        else{
            System.out.println("Click...");
            tf.setText("clicked....");
        }
         

    }
    
    public static void main(String[] args) {
        third fs=new third();
    }
}
