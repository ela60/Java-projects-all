
package slidshowdemo;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slidshowdemo extends JFrame implements ActionListener {
    private CardLayout card;
    private Container c;
    private JPanel panel;
    private JButton prebutton,nextbutton;
    private ImageIcon icon;
    private JLabel label;
    
     Slidshowdemo(){
         initcomponents();
         ShowImage();
     }
     
     public void ShowImage(){
         String[] imagenames={"1.jpg","2.jpg","3.jpg","4.jpg"};
         
         for(String n: imagenames){
            icon=new ImageIcon("src/image/"+n);  
            
            //resizeing the image
            Image img=icon.getImage();
            Image newImage=img.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
            icon=new ImageIcon(newImage);
            
            label=new JLabel(icon);
            panel.add(label);
            
         }
     }
     
     public void initcomponents(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setBounds(100,90,600,640);
         this.setTitle("Elas slidshowpicture =>");
         
         c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.yellow);
         
         card=new CardLayout();
         
         panel=new JPanel(card);
         panel.setBounds(10,10,560,500);//picxel
         c.add(panel);
         
         prebutton =new JButton("Previous");
         prebutton.setBounds(10,540,100,50);
         c.add(prebutton);
        
          nextbutton =new JButton("Next");
          nextbutton.setBounds(470,540,100,50);
          c.add(nextbutton);
          
          prebutton.addActionListener(this);
          nextbutton.addActionListener(this);
         
     }
     
     @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==prebutton){
            card.previous(panel);
        }
         
        if(ae.getSource()==nextbutton){
            card.next(panel);
        }
       
       
    }
    
    public static void main(String[] args) {
         Slidshowdemo frame =new  Slidshowdemo();
          frame.setVisible(true);
    }

    
    
}
