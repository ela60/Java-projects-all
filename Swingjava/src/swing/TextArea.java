
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextArea extends JFrame{
    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane scroll;
    
     TextArea(){
         initcomponents();
     }
    public void initcomponents(){
            c=this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.magenta);
            
             f= new Font("Arial",Font.TRUETYPE_FONT + Font.BOLD ,20);
          
            ta =new JTextArea("* ela loves her motherland");
            ta.setForeground(Color.blue);
            ta.setBackground(Color.LIGHT_GRAY);
            ta.setLineWrap(true);
            ta.setWrapStyleWord(true);
            ta.setFont(f);
           
         
            scroll=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setBounds(50,50,300,200);
            c.add(scroll);
            
          
         
    }
    
    public static void main(String[] args) {
        TextArea area =new TextArea();
        area.setVisible(true);
        area.setBounds(100, 50,500,400);
        area.setTitle("Elas show frame");
        area.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
