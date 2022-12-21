
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Radiobutton extends JFrame{
    
    private Container c;
    private JRadioButton male,female;
    private ButtonGroup gp;
    private Font f;
    private JTextArea ta;
    
    
    Radiobutton(){
        initcomponents ();
    }
    public void initcomponents ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,400);
        this.setTitle("Elas RadioButton demo");
        
         c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.ORANGE);
         
          f= new Font("Arial", Font.BOLD ,20);
         
         gp=new ButtonGroup();
         
         
         male=new JRadioButton("Male");
         male.setBounds(50,50,100,50);
         male.setFont(f);
         male.setBackground(Color.cyan);
         male.setSelected(true);
         c.add(male);
         
         female=new JRadioButton("Female");
         female.setBounds(160,50,100,50);
         female.setFont(f);
         //female.setEnabled(false);
         female.setBackground(Color.cyan);
         c.add(female);
        
         gp.add(male);
         gp.add(female);
         
         ta=new JTextArea();
         ta.setBounds(20,110,340,200);
         ta.setFont(f);
         ta.setBackground(Color.PINK);
         c.add(ta);
        
         Hand ha=new Hand();
         male.addActionListener(ha);
         female.addActionListener(ha);
         
        
    }
    
      class Hand implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()==male)
            {
                ta.append("you have selected Male\n");
            }
            else
            {
                ta.append("you have selected Female\n");
            }
        }
    
}
      
    
    
    public static void main(String[] args) {
        
        Radiobutton frame =new Radiobutton();
        frame.setVisible(true);
    }
    
}
