
package swing;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class Windowlistener extends JFrame {
    private java.awt.Container c;
    Windowlistener (){
        initcomponents();
    }
    public void initcomponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,400);
        this.setTitle("Elas Foucs listener => ");
        
         c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.lightGray);
         
         this.addWindowListener(new WindowListener(){//this means frame ar sate add
            @Override
            public void windowOpened(WindowEvent we) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent we) {
                 System.out.println("windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent we) {
                 System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent we) {//window minimise
                 System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                 System.out.println("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent we) {
                 System.out.println("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                 System.out.println("windowDeactivated");
            }
         
         });
         
    }
    
    public static void main(String[] args) {
        Windowlistener frame = new Windowlistener ();
         frame.setVisible(true);
    }
    
}
