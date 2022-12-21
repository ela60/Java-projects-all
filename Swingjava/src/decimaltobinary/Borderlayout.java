
package decimaltobinary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Borderlayout  extends JFrame{
    private Container c;
    private JButton bt1,bt2,bt3,bt4,bt5;
    private BorderLayout blayout;
    
    Borderlayout(){
        initcomponents();
    }
    public void initcomponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Elas Borderlayout => ");
        
        c=this.getContentPane();
         blayout=new BorderLayout(10,8);
         c.setLayout(blayout);
         
         bt1=new JButton("1");
         bt2=new JButton("2");
         bt3=new JButton("3");
         bt4=new JButton("4");
         bt5=new JButton("5");
         
         c.add(bt1,BorderLayout.NORTH);
         c.add(bt2,BorderLayout.WEST);
         c.add(bt3,BorderLayout.CENTER);
         c.add(bt4,BorderLayout.EAST);
         c.add(bt5,BorderLayout.SOUTH);
    }
    
    
    
    public static void main(String[] args) {
        Borderlayout frame=new Borderlayout();
        frame.setVisible(true);
    }
    
}
