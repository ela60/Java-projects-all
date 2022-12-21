
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Newframe extends JFrame{
     private Container c;
     private JLabel label;
     private Font f;
    
    Newframe(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(420,50,400,400);
        this.setTitle("Elas Frame");
        
         c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.PINK);
         
         f= new Font("Arial",Font.PLAIN + Font.BOLD ,18);
         
         label =new JLabel(" welcomne to this interface ");
         label.setBounds(50,50,250,50);
         label.setFont(f);
         c.add(label);
    }
    
    
    public static void main(String[] args) {
        Newframe fr =new Newframe();
        fr.setVisible(true);
    }
}
