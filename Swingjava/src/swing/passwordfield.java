
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;


    public class passwordfield extends JFrame{
        private Container c;
        private JPasswordField pf;
         private Font f;
    
        
        passwordfield(){
            initcomponents ();
        }
        public void initcomponents(){
            c=this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.yellow);
            
             f= new Font("Arial",Font.TRUETYPE_FONT + Font.BOLD ,23);
            
            pf=new JPasswordField();
            pf.setEchoChar('*');
            pf.setForeground(Color.cyan);
            pf.setBackground(Color.magenta);
            pf.setFont(f);
            pf.setBounds(50, 20,150,50);
            c.add(pf);
        
        } 
        
        public static void main(String[] args) {
          passwordfield frame =new passwordfield();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Ela wish password");
    }
        }

