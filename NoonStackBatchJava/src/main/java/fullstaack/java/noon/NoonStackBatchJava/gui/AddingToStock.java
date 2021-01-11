package fullstaack.java.noon.NoonStackBatchJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import fullstaack.java.noon.NoonStackBatchJava.oop.Mobile;

public class AddingToStock extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JComboBox comboBox;
	JList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddingToStock frame = new AddingToStock();
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
	public AddingToStock() {
		setResizable(false);
		setTitle("New Item to Stock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New Mobile Into Stock");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.YELLOW);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.YELLOW);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Model");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setBounds(124, 34, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Brand");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.YELLOW);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(124, 76, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RAM");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.YELLOW);
		lblNewLabel_1_2.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(124, 116, 46, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Internal");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setForeground(Color.YELLOW);
		lblNewLabel_1_3.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_3.setBounds(124, 157, 85, 14);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Features");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setForeground(Color.YELLOW);
		lblNewLabel_1_4.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_4.setBounds(124, 195, 85, 14);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Quantity");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5.setForeground(Color.YELLOW);
		lblNewLabel_1_5.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_5.setBounds(124, 271, 85, 28);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Display size");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_6.setForeground(Color.YELLOW);
		lblNewLabel_1_6.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_6.setBounds(124, 310, 85, 25);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Price");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_7.setForeground(Color.YELLOW);
		lblNewLabel_1_7.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblNewLabel_1_7.setBounds(124, 356, 46, 14);
		panel.add(lblNewLabel_1_7);
		
		textField = new JTextField();
		textField.setForeground(Color.YELLOW);
		textField.setBackground(Color.BLACK);
		textField.setBounds(393, 33, 118, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Any Brand", "Realme", "Redmi", "Nokia", "Samsung", "One Plus", "Apple", "Huwai"}));
		comboBox.setForeground(Color.YELLOW);
		comboBox.setBackground(Color.BLACK);
		comboBox.setBounds(393, 74, 118, 22);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.YELLOW);
		textField_1.setBackground(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBounds(393, 115, 118, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.YELLOW);
		textField_2.setBackground(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBounds(393, 156, 118, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.YELLOW);
		textField_3.setBackground(Color.BLACK);
		textField_3.setBounds(393, 277, 118, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.YELLOW);
		textField_4.setBackground(Color.BLACK);
		textField_4.setColumns(10);
		textField_4.setBounds(393, 314, 118, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.YELLOW);
		textField_5.setBackground(Color.BLACK);
		textField_5.setColumns(10);
		textField_5.setBounds(393, 355, 118, 20);
		panel.add(textField_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(393, 195, 118, 62);
		panel.add(scrollPane);
		
		list= new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Select Features", "Camera", "UHD", "4K", "Dolby atmos", "Dolby vision"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setForeground(Color.YELLOW);
		list.setBackground(Color.BLACK);
		scrollPane.setViewportView(list);
		
		JButton btnNewButton = new JButton("Add to stock");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mobile mob=new Mobile();
				mob.setModel(textField.getText());
				mob.setBrand((String)comboBox.getSelectedItem());
				mob.setRam(Integer.parseInt(textField_1.getText()));
				mob.setInternal(Integer.parseInt(textField_2.getText()));
				Object[] each=(Object[])list.getSelectedValues();
				mob.setFeatures(Arrays.toString(each));
				mob.setQty(Integer.parseInt(textField_3.getText()));
				mob.setSize(Float.parseFloat(textField_4.getText()));
				mob.setPrice(Integer.parseInt(textField_5.getText()));
				ShopHome.stock.add(mob);
				JOptionPane.showMessageDialog(AddingToStock.this, "Stock added");
			}
		});
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(180, 398, 118, 23);
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				comboBox.setSelectedIndex(0);
				list.clearSelection();
			}
		});
		btnClear.setForeground(Color.YELLOW);
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(336, 398, 89, 23);
		panel.add(btnClear);
	}
}
