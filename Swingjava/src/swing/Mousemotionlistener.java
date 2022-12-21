
package swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mousemotionlistener extends JFrame {
    
    private Container c;
     private JTextArea ta;
    private JTextField tf;
   
    Mousemotionlistener(){
        initcomponents();
    }
    public void initcomponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,400);
        this.setTitle("Elas Mouse Motion listener => ");
        
         c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.yellow);
         
         ta=new JTextArea();
         ta.setBounds(10,20,200,200);
         ta.setBackground(Color.BLUE);
         c.add(ta);
         
         tf=new JTextField();//write
         tf.setBounds(220,20,150,50);
         c.add(tf);
         
         ta.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent me) {
                tf.setText("Mouse Dragged ~" +me.getX() +" " +me.getY());//xposition then y
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                tf.setText("Mouse Moved ~"+me.getX() +" " +me.getY());
            }
         
         });
         
    }
    
    public static void main(String[] args) {
        
        Mousemotionlistener frame=new Mousemotionlistener();
        frame.setVisible(true);
    }
    
}
