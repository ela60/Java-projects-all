
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Buttondemo extends JFrame{
    private Container c;
    private JButton bt1,bt2;
    private Font f;
    private Cursor cursor ;
    private ImageIcon img1,img2;
    
    Buttondemo(){
        initcomponents();
    }
    public void initcomponents(){
         c=this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.yellow);
            
            f= new Font("Arial",Font.PLAIN + Font.BOLD ,20);
            cursor=new Cursor(Cursor.HAND_CURSOR);
            
            img1=new ImageIcon(getClass().getResource("submit.jpg"));
            img2=new ImageIcon(getClass().getResource("images.jpg"));
            
            bt1=new JButton("Login");
            bt1.setFont(f);
            bt1.setCursor(cursor);
            bt1.setForeground(Color.BLUE);
            bt1.setBackground(Color.PINK);
            bt1.setBounds(100,50,100,50 );
            c.add(bt1);
            
             bt1.addActionListener(new ActionListener(){
        
            public void actionperformed (ActionEvent e){
                String s = bt1.getText();
                JOptionPane.showMessageDialog(null,"bt1 ="+ s);
              
            }

            @Override
            public void actionPerformed(ActionEvent ae) {
                bt1.setText("");
                
            }
    
        });
            
            bt2=new JButton("clear");
            bt2.setFont(f);
            bt2.setCursor(cursor);
            bt2.setForeground(Color.BLUE);
            bt2.setBackground(Color.PINK);
            bt2.setBounds(210,50,100,50 );
            c.add(bt2);
             bt2.addActionListener(new ActionListener(){
        
            public void actionperformed (ActionEvent e){
                String s = bt2.getText();
                JOptionPane.showMessageDialog(null,"bt2 ="+ s);
              
            }

            @Override
            public void actionPerformed(ActionEvent ae) {
                bt2.setText("");
                
            }
    
        });
            
    }
    
    
    public static void main(String[] args) {
          Buttondemo frame =new  Buttondemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Ela wish ButtonPress");
    }
    }
    

