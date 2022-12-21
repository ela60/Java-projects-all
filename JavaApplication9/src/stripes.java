import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class Game implements ActionListener{
 
        Frame f=new Frame("Gasing Game");
        Label l1=new Label("Minimum:");
        Label l2=new Label("Maximum:");
        Label l3=new Label("G-Number:");
        TextField t1=new TextField();
        TextField t2=new TextField();
        TextField t3=new TextField();
        Button b1=new Button("Submit");
        Label statusLabel= new Label();

    Game(){
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,150,100,20);
        l3.setBounds(50,200,100,20);    
        t1.setBounds(200,100,100,20);
        t2.setBounds(200,150,100,20);
        t3.setBounds(200,200,100,20);  
        b1.setBounds(50,250,50,20);
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(500,600);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(statusLabel);
        b1.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
}
public void actionPerformed(ActionEvent e){
    int i=Integer.parseInt(t1.getText());
    int j=Integer.parseInt(t2.getText());
    int z=Integer.parseInt(t3.getText());

        if(e.getSource()==b1){
            Random r=new Random();
            int rand=r.nextInt(j);
                System.out.println(e.toString());    
         if(rand==z){
            statusLabel.setText("You win.  Random number is "+rand);             
         }
         else{
             statusLabel.setText("You Lost. Random number is "+rand);
         }
    }
}
public static void main(String args[]){
new Game();
        }
 }