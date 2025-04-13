package caso2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class caso2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel contentPane_1;
	private JLabel lblNewLabel;
	private JTextField txt1;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextArea txtS;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					caso2 frame = new caso2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public caso2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			contentPane_1 = new JPanel();
			contentPane_1.setLayout(null);
			contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane_1.setBounds(10, 11, 434, 261);
			contentPane.add(contentPane_1);
			{
				lblNewLabel = new JLabel("Ingresa el numero");
				lblNewLabel.setBounds(10, 15, 129, 14);
				contentPane_1.add(lblNewLabel);
			}
			{
				txt1 = new JTextField();
				txt1.setColumns(10);
				txt1.setBounds(121, 12, 86, 20);
				contentPane_1.add(txt1);
			}
			{
				scrollPane = new JScrollPane();
				scrollPane.setBounds(33, 91, 361, 159);
				contentPane_1.add(scrollPane);
				{
					txtS = new JTextArea();
					scrollPane.setViewportView(txtS);
				}
			}
			{
				btnNewButton = new JButton("Celsius a F");
				btnNewButton.addActionListener(this);
				btnNewButton.setBounds(217, 11, 111, 23);
				contentPane_1.add(btnNewButton);
			}
			{
				btnNewButton_1 = new JButton("Minutos a seg");
				btnNewButton_1.addActionListener(this);
				btnNewButton_1.setBounds(318, 45, 106, 23);
				contentPane_1.add(btnNewButton_1);
			}
			{
				btnNewButton_2 = new JButton("Km a Millas");
				btnNewButton_2.addActionListener(this);
				btnNewButton_2.setBounds(217, 45, 89, 23);
				contentPane_1.add(btnNewButton_2);
			}
			{
				btnNewButton_3 = new JButton("Borrar");
				btnNewButton_3.addActionListener(this);
				btnNewButton_3.setBounds(118, 40, 89, 23);
				contentPane_1.add(btnNewButton_3);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_3) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		double cel= Double.parseDouble(txt1.getText());
				convertir c= new convertir(cel, cel);
				txtS.append("La convercion es: " +c.Convertir(cel) );
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		double km= Double.parseDouble(txt1.getText());
		convertir c= new convertir(km, km);
		txtS.append("La convercion es: " +c.Convertir1(km));
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		
		int min= Integer.parseInt(txt1.getText());
		convertir c =new convertir(min);
		txtS.append("La convercion es: " +c.Convertir1(min));
		
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		
		txt1.setText("");
		txtS.setText("");
		txt1.requestFocus();
		
	}
}



















