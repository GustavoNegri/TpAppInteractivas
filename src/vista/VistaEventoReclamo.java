package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class VistaEventoReclamo extends JFrame {

	private static final long serialVersionUID = -277076000511824707L;
	private JPanel contentPane;
	private JTextField fieldEstado;
	private JTextField fieldCantidad;

	public VistaEventoReclamo() {
		setFont(new Font("Tahoma", Font.PLAIN, 14));
		setTitle("Evento Reclamo");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstado.setBounds(10, 9, 65, 19);
		contentPane.add(lblEstado);
		
		fieldEstado = new JTextField();
		fieldEstado.setEditable(false);
		fieldEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fieldEstado.setBounds(85, 8, 121, 20);
		contentPane.add(fieldEstado);
		fieldEstado.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidad.setBounds(10, 39, 65, 19);
		contentPane.add(lblCantidad);
		
		fieldCantidad = new JTextField();
		fieldCantidad.setEditable(false);
		fieldCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fieldCantidad.setColumns(10);
		fieldCantidad.setBounds(85, 38, 121, 20);
		contentPane.add(fieldCantidad);
	}
}
