package decimaltobinary;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class DecimalToBinary extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtDecimal;
	private JTextField txtBinary;

	public static void main(String[] args) {
		new DecimalToBinary();
	}

	public DecimalToBinary() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		contentPane.add(getLabel("Decimal",12, 16, 80, 19));
		contentPane.add(getLabel("Binary",12, 47, 80, 19));

		txtDecimal = getTextField(90, 16, 126, 19);
		contentPane.add(txtDecimal);

		txtBinary = getTextField(90, 47, 126, 19);
		contentPane.add(txtBinary);

		JButton cmdConvert = new JButton("Convert");
		cmdConvert.setFont(new Font("Dialog", Font.PLAIN, 11));
		cmdConvert.addActionListener( this );
		cmdConvert.setBounds(90, 80, 80, 30);
		contentPane.add(cmdConvert);
		
		setResizable(false);
		setTitle("Decimal To Binary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		setLocationRelativeTo( null );
		setVisible( true );
	}
	
	private JLabel getLabel( String caption, int x, int y, int w, int h ) {
		JLabel lbl = new JLabel( caption );
		lbl.setBounds(x, y, w, h);
		
		return lbl;
	}
	
	private JTextField getTextField( int x, int y, int w, int h ) {
		JTextField tf = new JTextField();
		tf.setBounds(x, y, w, h);
		
		return tf;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		try {
			int decimal = Integer.parseInt( txtDecimal.getText() );

			String str ="";
			for(;decimal>0;){
				int binary = decimal%2;
				str = Integer.toString(binary) + str;
				decimal /= 2;
			}

			txtBinary.setText( str );
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog( null, e.getMessage() );
			txtBinary.setText( "Wrong input" );
		}
	}
}