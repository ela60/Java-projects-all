
package swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Table extends JFrame {
     private java.awt.Container c;
      private JLabel label;
      private Font f;
      private JTable table;
      private JScrollPane scroll;
      
      private String[] col={ "ID","NAME"};
      private String[][] row={
                            
                            {"2038520121","Ambia Ela"},
                            {"2038520128","Puspita Singha"},
                            {"2038520115","Mubashira Jahan",},
                            {"2038520133","Krishna Debthnath"},
                            {"2038520131","Joyti "},
                            {"2038520132","sadia "},
                            {"2038520102","ema"},
                            {"2038520117","mim "},
                            {"2038520127","maria "},
                            {"2038520103","Nodi "},
                          };
    
    Table(){
        initcomponents();
        
    }
    public void initcomponents(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setBounds(100,100,750,450);
         this.setTitle("Elas Table =>");
         
         c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.magenta);
         
          f= new Font("Arial",Font.PLAIN + Font.BOLD ,14);
         
         label=new JLabel(" CSE-03 Female Students Details");
         label.setFont(f);
         label.setBounds(250,20,200,50);
         c.add(label);
         
         table=new JTable(row,col);
         scroll=new JScrollPane(table);
         scroll.setBounds(50,80,600,150);
         c.add(scroll);
         
    }
    public static void main(String[] args) {
         Table frame=new Table();
         frame.setVisible(true);
    }
   
    
}
