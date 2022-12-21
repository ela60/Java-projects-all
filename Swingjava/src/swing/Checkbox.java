
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Checkbox extends JFrame {
    
    private Container c;
    private JCheckBox javabox , cbox, mysqlbox;
    private ButtonGroup gp;
    private Font f;
    private JLabel label;
    
    
    Checkbox()
    {
        initcomponenets ();
    }
    public void initcomponenets ()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,400);
        this.setTitle("Elas CheckBox demo");
        
        
        
         
         gp=new ButtonGroup();
         
         f=new Font("Arial",Font.PLAIN + Font.BOLD,20);
         
         javabox=new JCheckBox ("Java");
         javabox.setBounds(50,100,100,30);
         javabox.setBackground(Color.yellow);
         javabox.setFont(f);
         c.add(javabox);
         
         cbox=new JCheckBox ("C",true);//selecte takbe
         cbox.setBounds(50,130,100,30);
         cbox.setBackground(Color.yellow);
         cbox.setFont(f);
         c.add(cbox);
         
         mysqlbox=new JCheckBox ("Mysql");
         mysqlbox.setBounds(50,160,100,30);
         mysqlbox.setBackground(Color.yellow);
         mysqlbox.setFont(f);
         c.add(mysqlbox);
         
         gp.add(javabox);
         gp.add(cbox);
         gp.add(mysqlbox);
         
         label=new JLabel("ela haven't selected anything");
         label.setBounds(50,200,300,30);
         label.setFont(f);
         c.add(label);
         
          Hand ha=new Hand();
          javabox.addItemListener(ha);
          cbox.addItemListener(ha);
          mysqlbox.addItemListener(ha);
         
    }
    
    class Hand implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {//hand ar sob box obj asbe akhne
            if(e.getSource()==javabox)
            {
                label.setText("ela selected java");
            }
            else if(e.getSource()==cbox)
            {
                label.setText("ela selected C");
            }
            else
            {
                label.setText("ela selected Mysql");
            }
    }
    
    }
    public static void main(String[] args) {
        Checkbox frame=new Checkbox();
         frame.setVisible(true);
        
        
    }
    
}
