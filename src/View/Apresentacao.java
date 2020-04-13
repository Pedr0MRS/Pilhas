package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.Calculadora;
import javafx.scene.control.ComboBox;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;

public class Apresentacao extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private Calculadora calculadora = new Calculadora();
	private String value = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao frame = new Apresentacao();
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
	public Apresentacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Integer operadores[] = new Integer[] {32, 43, 45, 42, 47, 8 }; 
		List<Integer> list = Arrays.asList(operadores);
		
		JLabel lblExpresso = new JLabel("Express\u00E3o:");
		lblExpresso.setBounds(10, 49, 77, 14);
		contentPane.add(lblExpresso);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setBounds(185, 11, 89, 14);
		contentPane.add(lblCalculadora);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(90, 77, 96, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Vetor");
		comboBox.addItem("Dinâmica");
		
		JFormattedTextField textField = new JFormattedTextField();
		textField.setBounds(80, 46, 344, 20);
		contentPane.add(textField);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(171, 122, 89, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent btnCalcular) {
				String resultado = "";
				try {
					resultado = calculadora.Calcular(textField.getText(), comboBox.getSelectedIndex());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				}
				textField_1.setText(resultado);
			}
		});
		contentPane.add(btnCalcular);
		
		JLabel lblTipoDePilha = new JLabel("Tipo de Pilha:");
		lblTipoDePilha.setBounds(10, 80, 77, 14);
		contentPane.add(lblTipoDePilha);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(10, 194, 77, 14);
		contentPane.add(lblResultado);
		
		textField_1 = new JTextField();
		textField_1.setBounds(80, 191, 344, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
