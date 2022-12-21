
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Test extends JFrame {
    
    private Container c;
    private JLabel imglabel,textlabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton clearbutton;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;
    
    Test(){
           c=this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.BLUE);
            
            f= new Font("Arial",Font.PLAIN + Font.BOLD ,20);
            
            img =new ImageIcon(getClass().getResource("car.jpg"));
            imglabel=new JLabel (img);
            imglabel.setBounds(20,10,img.getIconWidth(),img.getIconHeight());
            c.add(imglabel);//container sate add
            
            textlabel =new JLabel("Enter any number :");
            textlabel.setBounds(20,200,250,50);
            textlabel.setForeground(Color.ORANGE);
            textlabel.setFont(f);
            c.add(textlabel);
            
            tf=new JTextField();
            tf.setBounds(230,200,90,50);
            tf.setFont(f);
            tf.setHorizontalAlignment(JTextField.CENTER);
            tf.setBackground(Color.YELLOW);
            c.add(tf);
            
            cursor =new Cursor(Cursor.HAND_CURSOR);
            
            clearbutton=new JButton("clear");
            clearbutton.setBounds(230,260,90,50 );
            clearbutton.setCursor(cursor);
            clearbutton.setFont(f);
            c.add( clearbutton);
            
             ta =new JTextArea();
             ta.setBounds(20,350,300,300);
             ta.setFont(f);
             ta.setBackground(Color.yellow);
             c.add(ta);
             
             tf.addActionListener(new ActionListener(){ 
                 
                 public void actionPerformed(ActionEvent e){
                     
                     String value=tf.getText();
                     
                     if(value.isEmpty()){
                         JOptionPane.showMessageDialog(null, "you didnt give any value");
                     }
                     else{
                         ta.setText("");
                     int num=Integer.parseInt(tf.getText());
                     
                     for(int i=1;i<=10;i++){
                         
                         int result=num*i;
                         String r=String.valueOf(result);//textfield lekha ta integer buje na tai string dekabe
                         String n=String.valueOf(num);
                         String incr=String.valueOf(i);
                         
                         ta.append(n+" X "+incr + " = "+r+"\n");
                     }
                     
                    }
                 }
                 
             });
             
              clearbutton.addActionListener(new ActionListener(){
        
            
                @Override
                public void actionPerformed(ActionEvent e) {
                           ta.setText(" ");
                          
                
            }
                       
        });
                 
    }
 
    public static void main(String[] args) {
         Test frame =new  Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,20,360,700);
        frame.setTitle("Elas Multiplication table");
    }
}
