package fullstaack.java.noon.NoonStackBatchJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import fullstaack.java.noon.NoonStackBatchJava.oop.Mobile;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel model;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	
	
	public View() {
		setTitle("Viewing Items");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Listing All Products");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setForeground(Color.YELLOW);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		model=new DefaultTableModel();
		
		model.addColumn("Model");
		model.addColumn("Brand");
		model.addColumn("RAM");
		model.addColumn("Internal");
		model.addColumn("Features");
		model.addColumn("Display Size");
		model.addColumn("Quantity");
		model.addColumn("Price");
		
		for(int index=0;index<ShopHome.stock.size();index++)
		{
			model.addRow(new Object[] {
					ShopHome.stock.get(index).getModel(),ShopHome.stock.get(index).getBrand(),
					ShopHome.stock.get(index).getRam(),ShopHome.stock.get(index).getInternal(),
					ShopHome.stock.get(index).getFeatures(),ShopHome.stock.get(index).getSize(),
					ShopHome.stock.get(index).getQty(),ShopHome.stock.get(index).getPrice()
			});
		}
		
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row=table.getSelectedRow();
				textField.setText(""+model.getValueAt(row, 0));
				textField_1.setText(""+model.getValueAt(row, 1));
				textField_2.setText(""+model.getValueAt(row, 2));
				textField_3.setText(""+model.getValueAt(row, 3));
				textField_4.setText(""+model.getValueAt(row, 4));
				textField_5.setText(""+model.getValueAt(row, 5));
				textField_6.setText(""+model.getValueAt(row, 6));
				textField_7.setText(""+model.getValueAt(row, 7));
			}
		});
		table.setForeground(Color.YELLOW);
		table.setBackground(Color.BLACK);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setToolTipText("Model");
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Brand");
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("RAM");
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Internal");
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Features");
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("Display Size");
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("Quantity");
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("Price");
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Edit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mobile temp=new Mobile();
				temp.setModel(textField.getText());
				temp.setBrand(textField_1.getText());
				temp.setRam(Integer.parseInt(textField_2.getText()));
				temp.setInternal(Integer.parseInt(textField_3.getText()));
				temp.setFeatures(textField_4.getText());
				temp.setSize(Float.parseFloat(textField_5.getText()));
				temp.setQty(Integer.parseInt(textField_6.getText()));
				temp.setPrice(Integer.parseInt(textField_7.getText()));
				ShopHome.stock.set(table.getSelectedRow(),temp);
				JOptionPane.showMessageDialog(View.this, "Mobile Updated");
			}
		});
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBackground(Color.BLACK);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setForeground(Color.YELLOW);
		btnNewButton_1.setBackground(Color.BLACK);
		panel.add(btnNewButton_1);
		
	}

}

