
package swing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Labelimg extends JFrame {
     private java.awt.Container c;
     private JLabel label;
     private ImageIcon img;
    Labelimg (){
        initcomponents();
        
    }
    public void initcomponents(){
         c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.YELLOW);
         
         img=new ImageIcon(getClass().getResource("e.png"));
         
         label=new JLabel("Image icon",img,JLabel.LEFT);
         label.setBounds(20,00,350,350);
         c.add(label);
    }
    
    public static void main(String[] args) {
        Labelimg frame=new Labelimg();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("Ela wish label");
    
    }
    
}
