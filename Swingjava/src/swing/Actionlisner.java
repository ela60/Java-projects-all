
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Actionlisner extends JFrame{
    private Container c;
     private JTextField tf1,tf2;
    private Font f;
    
    Actionlisner(){
        initcomponents();
    }
    public void initcomponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        tf1 = new JTextField ();
        tf1.setBounds(50 , 50, 200, 50);
        c.add(tf1);
        tf1.addActionListener(new ActionListener(){
        
            public void actionperformed (ActionEvent e){
                String s = tf1.getText();
                JOptionPane.showMessageDialog(null,"tf1 ="+ s);
              
            }

            @Override
            public void actionPerformed(ActionEvent ae) {
                tf1.setText("");
                
            }
    
        });
                  
        tf2 = new JTextField ();
        tf2.setText("AMBIA ELA");
        tf2.setBounds(50 ,110, 200, 50);
        c.add(tf2);
        
    }
    
    
    public static void main(String[] args) {
        Actionlisner frame =new Actionlisner();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Ela wish");
    }
    
}
