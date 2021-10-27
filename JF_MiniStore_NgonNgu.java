import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JF_MiniStore_NgonNgu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_MiniStore_NgonNgu frame = new JF_MiniStore_NgonNgu();
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
	public JF_MiniStore_NgonNgu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox CheckBox_TiengViet = new JCheckBox("Tiếng Việt");
		CheckBox_TiengViet.setBounds(53, 77, 128, 23);
		contentPane.add(CheckBox_TiengViet);
		
		JCheckBox CheckBox_TiengAnh = new JCheckBox("Tiếng Anh");
		CheckBox_TiengAnh.setBounds(270, 77, 128, 23);
		contentPane.add(CheckBox_TiengAnh);
		
		JButton btn_Luu = new JButton("Lưu");
		btn_Luu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Luu.setBounds(53, 134, 117, 29);
		contentPane.add(btn_Luu);
		
		JButton btn_Return = new JButton("Quay lại");
		btn_Return.setBounds(270, 134, 117, 29);
		contentPane.add(btn_Return);
		
		JLabel lbl_ChuyenDoi = new JLabel("Chuyển đổi ngôn ngữ");
		lbl_ChuyenDoi.setBounds(150, 28, 162, 16);
		contentPane.add(lbl_ChuyenDoi);
	}
}