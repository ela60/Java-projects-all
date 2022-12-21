
package swing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseListener;

public class Mouselistener extends JFrame {
    private Container c;
    private JTextArea ta;
    private JTextField tf;
    private JScrollPane scroll;
     private Cursor cursor ;
    
    Mouselistener(){
        initcomponents();
    }
    public void initcomponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Elas Mouse4Listener => ");
        
         c=this.getContentPane();
         c.setLayout(null);
         
          cursor=new Cursor(Cursor.HAND_CURSOR);
        
         tf=new JTextField();//write
         tf.setBounds(200,20,150,50);
         tf.setCursor(cursor);
         c.add(tf);
         
         ta=new JTextArea();
         ta.setBounds(150,80,300,300);
         ta.setBackground(Color.green);
         c.add(ta);
         
         scroll=new JScrollPane(ta);
         scroll.setBounds(150,80,300,300);
         c.add(scroll);
         
         tf.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                ta.append("Mouse Clicked \n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                ta.append("Mouse Pressed \n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                ta.append("Mouse Released \n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                ta.append("Mouse Entered \n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                ta.append("Mouse Exited \n");
            }
         
         
         
         });
        
    }
    
    public static void main(String[] args) {
        Mouselistener frame =new Mouselistener();
        frame.setVisible(true);
    }
    
}
