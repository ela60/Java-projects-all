
package swing;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
public class Foucslistener extends JFrame{
    private Container c;
    private JButton button;
    private JTextArea ta;
    
    Foucslistener(){
        initcomponents();
    }
    public void initcomponents(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,400);
        this.setTitle("Elas Foucs listener => ");
        
         c=this.getContentPane();
         c.setLayout(null);
          c.setBackground(Color.RED);
         
         button =new JButton("Button");
         button.setBounds(40,50,100,50);
         c.add(button);
         
         ta=new JTextArea();
         ta.setBounds(200,30,200,200);
         c.add(ta);
         
         button.addFocusListener(new FocusListener(){
             
             @Override
             public void focusGained(FocusEvent fe) {
                 ta.setText(" Focus Gained *");
             }

             @Override
             public void focusLost(FocusEvent fe) {
                 ta.setText(" Focus Lost *");
             }
         
         
         });
         
         
    }
    
    public static void main(String[] args) {
       Foucslistener frame=new Foucslistener();
        frame.setVisible(true);
        
    }
    
}
