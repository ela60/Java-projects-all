
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Createbox extends JFrame implements ActionListener{
    private Container c;
    private  JButton  redbutton ,bluebutton ,yellowbutton;
    Createbox(){
        initcomponents();
    }
    public void initcomponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Elas istnerbox demo");
        this.setBounds(100,100,600,500);
        
         c=this.getContentPane();
         c.setLayout(null);
         
         redbutton=new JButton("RED");
         redbutton.setBounds(50,50,100,50);
         c.add(redbutton);
         
         bluebutton=new JButton("BLUE");
         bluebutton.setBounds(50,110,100,50);
         c.add(bluebutton);
        
         yellowbutton=new JButton("YELLOW");
         yellowbutton.setBounds(50,170,100,50);
         c.add(yellowbutton);
         
         redbutton.addActionListener(this);
         bluebutton.addActionListener(this);
         yellowbutton.addActionListener(this);
    }
          @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==redbutton)
        {
             c.setBackground(Color.RED);
        }
        else if(e.getSource()==bluebutton)
        {
             c.setBackground(Color.BLUE);
        }
        else
        {
             c.setBackground(Color.YELLOW);
        }
        
    }
        
        

    
   
    
     
      public static void main(String[] args) {
          Createbox frame =new  Createbox();
        frame.setVisible(true);
        
    }

    
}
