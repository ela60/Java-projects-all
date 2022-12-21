
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Combobox extends JFrame {
    
    private Container c;
    private JComboBox cb;
    private String [] programinglan ={"c","c++","java","c#","python","mysql","php"};
    private JLabel label;
    private JButton button;
    
    Combobox(){
        initcomponents();
    }
    public void initcomponents()
    {
        //frame ta create
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Elas ComboBox demo");
        
        c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.PINK);
         
         cb=new JComboBox(programinglan);
         cb.setBounds(50,150,100,50);
         cb.setEditable(true);
         cb.setSelectedIndex(4);//0 teke count hoi
         cb.addItem("fortant");
         cb.removeItemAt(7);
         c.add(cb);
         
         button=new JButton(" show ");
         button.setBounds(50,250,80,50);
         c.add(button);
         
         label=new JLabel();
         label.setBounds(160,150,200,50);
         
         c.add(label);
         
         button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String s =cb.getSelectedItem().toString();//string obj
                label.setText("ela selected language ~> "+s);
                
            }
         
         
         
         });
         
         System.out.println("Total item ="+cb.getItemCount());
    }
    
    
    public static void main(String[] args) {
        Combobox frame =new Combobox();
        frame.setVisible(true);
    }
    
}
