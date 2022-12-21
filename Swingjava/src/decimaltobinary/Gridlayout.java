
package decimaltobinary;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;

import javax.swing.JFrame;

public class Gridlayout extends JFrame {
    private Container c;
    private GridLayout gd;
    private JButton bt1,bt2,bt3,bt4;
    Gridlayout(){
        initcomponents();
    }
    public void initcomponents(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,350,300);
        this.setTitle("Elas  Gridyout => ");
        
         c=this.getContentPane();
         gd=new GridLayout(2,2,5,5);
        c.setLayout(gd);
        
        bt1=new JButton("1*");
        bt2=new JButton("2*");
        bt3=new JButton("3*");
        bt4=new JButton("4*");
        
        c.add(bt1);
        c.add(bt2);
        c.add(bt3);
         c.add(bt4);
        
    }
    
    public static void main(String[] args) {
        Gridlayout frame=new Gridlayout();
        frame.setVisible(true);
    }
    
}
