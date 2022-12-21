
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Keylistner extends JFrame {
     private Container c;
     private JTextArea ta;
      private JTextField tf;
      
      Keylistner(){
          initcomponents();
      }
      public void initcomponents(){
          
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,100,500,500);
        this.setTitle("Elas keylistner demo");
        
         c=this.getContentPane();
         c.setLayout(null);
        
          tf=new JTextField ();
         tf.setBounds(50,50,150,50);
         c.add(tf);
         
         ta=new JTextArea ();
         ta.setBounds(50,110,300,300);
         ta.setBackground(Color.magenta);
         c.add(ta);
         
         tf.addKeyListener(new KeyListener (){
              @Override
           public void keyPressed(KeyEvent ke) {
               ta.append(" ELAS Key pressed ~" +ke.getKeyChar()+"\n");
           }
           
           @Override
           public void keyTyped(KeyEvent ke) {
               ta.append(" ELAS Key typed ~"+ke.getKeyChar()+"\n");
               
           }

           @Override
           public void keyReleased(KeyEvent ke) {
               ta.append("ELAS key relesed ~ "+ke.getKeyChar()+"\n");
           }
         
         } );
        
        
}
    
    
    public static void main(String[] args) {
        Keylistner frame =new  Keylistner();
        frame.setVisible(true);
    }
    
}
