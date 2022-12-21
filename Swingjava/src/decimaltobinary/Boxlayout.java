
package decimaltobinary;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Boxlayout extends JFrame {
    
    private Container c;
    private JButton bt1,bt2,bt3,bt4,bt5;
    private BoxLayout blayout;
    
    Boxlayout (){
        initcomponents();
    }
    public void initcomponents(){//metod k call
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,350,300);
        this.setTitle("Elas  Boxlayout => ");
        
         c=this.getContentPane();
        blayout=new BoxLayout(c,BoxLayout.Y_AXIS);//by default center a 
        c.setBackground(Color.orange);
        c.setLayout(blayout);
        
        bt1=new JButton("1*");
        bt2=new JButton("2*");
        bt3=new JButton("3*");
        bt4=new JButton("4*");
        bt5=new JButton("5*");
        
        c.add(bt1);
        //c.add(Box.createHorizontalStrut(1));
         c.add(bt2);
          c.add(bt3);
           c.add(bt4);
            c.add(bt5);
        
    }
    
    
    
    public static void main(String[] args) {
        Boxlayout frame=new Boxlayout ();
        frame.setVisible(true);
        
    }
    
}
