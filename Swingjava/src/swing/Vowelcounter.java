
package swing;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Container;

public class Vowelcounter extends JFrame{
    private Container c;
    private JLabel promptlabel,vowellabel,alabel,elabel,ilabel,olabel,ulabel;
    private JTextArea inputTextArea;
    private JScrollPane scroll;
    
    int totalvowel =0;
    int letter_a   =0;
    int letter_e   =0;
    int letter_i   =0;
    int letter_o    =0;
    int letter_u   =0;
    
    
    Vowelcounter(){
        initcomponens();
    }
    public void initcomponens(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Elas counting Vowel => ");
        
         c=this.getContentPane();
         c.setLayout(null);
         
         promptlabel=new JLabel ("ENTER VOWELC- ");
         promptlabel.setBounds(10,20,100,30);
         c.add(promptlabel);
         
         inputTextArea=new JTextArea();
         inputTextArea.setBackground(Color.yellow);
         inputTextArea.setLineWrap(true);//line wrap means line shesa necha nea jai
         inputTextArea.setWrapStyleWord(true);//word by word wrap 
         
         scroll=new JScrollPane(inputTextArea);
         scroll.setBounds(110,20,450,100);
         c.add(scroll);
         
         vowellabel=new JLabel ();
         vowellabel.setBounds(110,150,250,30);
         c.add(vowellabel);
         
         alabel=new JLabel ();
         alabel.setBounds(110,190,250,30);
         c.add(alabel);
         
         elabel=new JLabel ();
         elabel.setBounds(110,230,250,30);
         c.add(elabel);
         
         ilabel=new JLabel ();
         ilabel.setBounds(110,270,250,30);
         c.add(ilabel);
         
         olabel=new JLabel ();
         olabel.setBounds(110,310,250,30);
         c.add(olabel);
         
         ulabel=new JLabel ();
         ulabel.setBounds(110,350,250,30);
         c.add(ulabel);
         
         inputTextArea.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
                if(ke.getSource()==inputTextArea){//user text input deasa kina
                    
                    if(ke.VK_A==ke.getKeyCode())
                    {
                        letter_a++;//0 silo 1 increment hbe
                        totalvowel++;
                    }
                }
                
                if(ke.getSource()==inputTextArea){
                    
                    if(ke.VK_E==ke.getKeyCode())
                    {
                        letter_e++;
                        totalvowel++;
                    }
                }
                
                if(ke.getSource()==inputTextArea){
                    
                    if(ke.VK_I==ke.getKeyCode())
                    {
                        letter_i++;
                        totalvowel++;
                    }
                }
                
                if(ke.getSource()==inputTextArea){
                    if(ke.VK_O==ke.getKeyCode())
                    {
                        letter_o++;
                        totalvowel++;
                    }
                }
                
                if(ke.getSource()==inputTextArea){
                    
                    if(ke.VK_U==ke.getKeyCode())
                    {
                        letter_u++;
                        totalvowel++;
                    }
                }
                
                vowellabel.setText("Total number of vowel "+totalvowel);
                alabel.setText("Total number of A ~ "+letter_a);
                elabel.setText("Total number of E ~ "+letter_e);
                ilabel.setText("Total number of I ~ "+letter_i);
                olabel.setText("Total number of O ~ "+letter_o);
                ulabel.setText("Total number of U ~ "+letter_u);
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
             
             
         });
         
         
    }
    
    public static void main(String[] args) {
        Vowelcounter frame=new Vowelcounter();
        frame.setVisible(true);
    }
    
}
