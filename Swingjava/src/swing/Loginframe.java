
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Loginframe extends JFrame {
    private JLabel userLabel,passLabe1;
    private JTextField tf1;
    private JPasswordField pf;
    private JButton loginbutton,clearbutton;
    private Container c;
    private Font f;
    
    Loginframe(){
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setBounds(100,50,420,350);
          this.setTitle("ela login demo");
                
            c=this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.yellow);
            
            f= new Font("Arial",Font.PLAIN + Font.BOLD ,22);
            
            userLabel=new JLabel("userLabel");
            userLabel.setFont(f);
            userLabel.setBounds(50,50,150,50 );
            c.add( userLabel);
            
             tf1 = new JTextField ();
             tf1.setBounds(170,50,200,50);
             tf1.setFont(f);
             c.add(tf1);
             
            passLabe1=new JLabel("password : ");
            passLabe1.setBounds(50,120,150,50 );
            passLabe1.setFont(f);
            c.add( passLabe1);
            
            pf=new JPasswordField();
            pf.setBounds(170,120,200,50);
            pf.setEchoChar('*');
            pf.setFont(f);
            c.add(pf);
           
            loginbutton=new JButton("login");
            loginbutton.setBounds(170,190,90,50 );
            loginbutton.setFont(f);
            c.add( loginbutton);
             
            clearbutton=new JButton("clear");
            clearbutton.setBounds(280,190,90,50 );
            clearbutton.setFont(f);
            c.add( clearbutton);
             
            clearbutton.addActionListener(new ActionListener(){
        
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               tf1.setText(" ");
               pf.setText("");
                
            }
           
        });
            
            loginbutton.addActionListener(new ActionListener(){
        
            
            @Override
            public void actionPerformed(ActionEvent ae) {
              String username = tf1.getText();
              String password = pf.getText();
              
              if(username.equals("ela") && password.equals("777")){
                  JOptionPane.showMessageDialog(null,"you are successfully login");
                 // dispose();
                  Newframe frame=new Newframe();
                  frame.setVisible(true);
              }
              else{
                 JOptionPane.showMessageDialog(null,"Invalid username and password");
            }
            }
        });
    
    }
    public static void main(String[] args) {
        Loginframe frame=new Loginframe();
        frame.setVisible(true);
    }

   
}

   

           
                    
