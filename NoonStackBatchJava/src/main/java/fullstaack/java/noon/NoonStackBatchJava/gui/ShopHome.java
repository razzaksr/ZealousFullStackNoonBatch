package fullstaack.java.noon.NoonStackBatchJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fullstaack.java.noon.NoonStackBatchJava.oop.Mobile;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ShopHome extends JFrame
{
	private JPanel contentPane;
	static List<Mobile> stock=new ArrayList<Mobile>();
	

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { ShopHome frame = new ShopHome();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public ShopHome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("mob.jpg"));
		Mobile mob1=new Mobile("6.1Plus", "Nokia", "FullHd,Snapdragon620G", 4, 64, 15600, 20, 5.5F);
		Mobile mob2=new Mobile("V20", "Vivo", "Hd,Snapdragon580G", 4, 128, 24600, 200, 5.5F);
		Mobile mob3=new Mobile("9Lite", "Nokia", "20MBCamera,HD", 3, 32, 9600, 10, 5.5F);
		Mobile mob7=new Mobile("5S", "Realme", "FullHd,Snapdragon620G,128MBCamera", 4, 128, 21600, 10, 6.5F);
		
		stock.add(mob1);stock.add(mob2);stock.add(mob3);stock.add(mob7);
		
		setBackground(Color.BLACK);
		setTitle("Mobile Express Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 454);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(Color.YELLOW);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Stock");
		mnNewMenu.setBackground(Color.YELLOW);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add to Stock");
		mntmNewMenuItem.setForeground(Color.YELLOW);
		mntmNewMenuItem.setBackground(Color.BLACK);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddingToStock adding=new AddingToStock();
				adding.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("View Items");
		mntmNewMenuItem_1.setBackground(Color.BLACK);
		mntmNewMenuItem_1.setForeground(Color.YELLOW);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				View view=new View();
				view.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Mobile Express Home");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.YELLOW);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
	}

}
