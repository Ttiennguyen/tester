import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JF_MiniStore_Login extends JFrame {

	private JPanel contentPane;
	private JTextField txt_UserName;
	private JPasswordField JPassword_pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_MiniStore_Login frame = new JF_MiniStore_Login();
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
	public JF_MiniStore_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_UserName = new JLabel("UserName ");
		lbl_UserName.setBounds(39, 68, 73, 21);
		contentPane.add(lbl_UserName);
		
		JLabel lbl_Password = new JLabel("Password ");
		lbl_Password.setBounds(39, 110, 73, 16);
		contentPane.add(lbl_Password);
		
		txt_UserName = new JTextField();
		txt_UserName.setBounds(123, 61, 275, 34);
		contentPane.add(txt_UserName);
		txt_UserName.setColumns(10);
		
		JLabel lbl_MiniStore = new JLabel("Mini Store ");
		lbl_MiniStore.setBounds(200, 33, 67, 16);
		contentPane.add(lbl_MiniStore);
		
		JButton btn_Login = new JButton("Login ");
		btn_Login.setBounds(123, 159, 133, 43);
		contentPane.add(btn_Login);
		
		JButton btn_Cancel = new JButton("Cancel");
		btn_Cancel.setBounds(268, 159, 130, 43);
		contentPane.add(btn_Cancel);
		
		JPassword_pass = new JPasswordField();
		JPassword_pass.setBounds(124, 105, 274, 34);
		contentPane.add(JPassword_pass);
	}
}
