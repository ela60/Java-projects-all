package swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class TextFiledemo extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
    private Font f;
    
    
    TextFiledemo(){
        initcomponents();
    }
    public void initcomponents (){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);
        
        f= new Font("Arial",Font.ITALIC + Font.BOLD ,20);
        
        tf1 = new JTextField ();
        tf1.setBounds(50 , 50, 200, 50);
        tf1.setFont(f);
        tf1.setForeground(Color.yellow);
        tf1.setBackground(Color.red);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
        
        tf2 = new JTextField ();
        tf2.setText("AMBIA ELA");
        tf2.setBounds(50 ,110, 200, 50);
        tf2.setFont(f);
        tf2.setForeground(Color.yellow);
        tf2.setBackground(Color.red);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);
        
    }
    public static void main(String[] args) {
        TextFiledemo frame =new TextFiledemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Ela wish");
    }
    
}