package fullstaack.java.noon.NoonStackBatchJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("mob.jpg"));
		setTitle("Login Into the MobileExpress");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblMobileExpress = new JLabel("Mobile Express");
		lblMobileExpress.setFont(new Font("Usuzi", Font.BOLD | Font.ITALIC, 18));
		lblMobileExpress.setForeground(Color.YELLOW);
		lblMobileExpress.setBounds(128, 11, 204, 23);
		contentPane.add(lblMobileExpress);
		
		JLabel lblUserNameTo = new JLabel("User name");
		lblUserNameTo.setForeground(Color.YELLOW);
		lblUserNameTo.setFont(new Font("Usuzi", Font.BOLD, 14));
		lblUserNameTo.setBounds(66, 78, 117, 23);
		contentPane.add(lblUserNameTo);
		
		JLabel lblPassWord = new JLabel("Pass word");
		lblPassWord.setForeground(Color.YELLOW);
		lblPassWord.setFont(new Font("Usuzi", Font.BOLD, 14));
		lblPassWord.setBounds(66, 140, 117, 23);
		contentPane.add(lblPassWord);
		
		textField = new JTextField();
		textField.setForeground(Color.YELLOW);
		textField.setBackground(Color.BLACK);
		textField.setBounds(250, 79, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('#');
		passwordField.setForeground(Color.YELLOW);
		passwordField.setBackground(Color.BLACK);
		passwordField.setBounds(250, 141, 117, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(Login.this, "Login Pressed");
				//System.out.println("Login pressed");
				String one=textField.getText();
				String two=passwordField.getText();
				if(one.equals("arunriyazaravind")&&two.equals("mobileexpress"))
				{
					JOptionPane.showMessageDialog(Login.this, "Login Authorised");
					ShopHome home=new ShopHome();
					home.setVisible(true);
					Login.this.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(Login.this, "Login Failed");
				}
			}
		});
		btnLogin.setForeground(Color.YELLOW);
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setBounds(116, 219, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Clear pressed");
				JOptionPane.showMessageDialog(Login.this, "Clear Pressed");
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnClear.setForeground(Color.YELLOW);
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(250, 219, 89, 23);
		contentPane.add(btnClear);
	}
}
