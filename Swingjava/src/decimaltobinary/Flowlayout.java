
package decimaltobinary;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Flowlayout extends JFrame {
    private Container c;
    private JButton buttons[];
    private FlowLayout flayout;
    
    Flowlayout(){
        initcomponents();
    }
    public void initcomponents(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,350,300);
        this.setTitle("Elas Flowlayout => ");
        
        c=this.getContentPane();
        flayout=new FlowLayout(FlowLayout.LEFT);//by default center a 
        c.setBackground(Color.DARK_GRAY);
        flayout.setHgap(10);
        flayout.setVgap(20);
         c.setLayout(flayout);
         
        buttons=new JButton[9];//button class array create
        
        for(int i=0;i<9;i++)
        {
            buttons[i]=new JButton(""+ (i+1));
            c.add(buttons[i]);
        }
        
        
    }
    
    public static void main(String[] args) {
        Flowlayout frame=new Flowlayout();
        frame.setVisible(true);
    }
    
}
