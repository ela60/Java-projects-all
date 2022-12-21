
package swing;

import java.awt.CardLayout;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;


public class CardDemo extends JFrame implements ActionListener{
    private Container c;
    private CardLayout cd;
    private JButton bt1,bt2,bt3,bt4;
    
    
    CardDemo(){
        initcomponents();
    }
    public void initcomponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,350,300);
        this.setTitle("Elas  Cardlayout => ");
        
         c=this.getContentPane();
         cd=new CardLayout(10,10);
        c.setLayout(cd);
        
        bt1=new JButton("1");
        bt1=new JButton("2");
        bt1=new JButton("3");
        bt1=new JButton("4");
        
        c.add(bt1,"First");
        c.add(bt2 ,"Second");
        c.add(bt3,"Third");
        c.add(bt4,"Four");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        cd.next(c);
        cd.show(c, "third");
    }
    
    public static void main(String[] args) {
      CardDemo frame=new CardDemo();
        frame.setVisible(true);
    }
}
