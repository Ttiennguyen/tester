import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;

public class JF_MiniStore_KhachHang extends JFrame {

	private JPanel contentPane;
	private JTextField txt_SDT;
	private JTextField txt_LienHe;
	private JTextField txt_DiaChi;
	private JTable table_ThongTinKH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_MiniStore_KhachHang frame = new JF_MiniStore_KhachHang();
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
	public JF_MiniStore_KhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_KhachHang = new JLabel("Khách Hàng");
		lbl_KhachHang.setBounds(172, 6, 139, 29);
		contentPane.add(lbl_KhachHang);
		
		JLabel lbl_SDT = new JLabel("Số điện thoại:");
		lbl_SDT.setBounds(33, 46, 88, 24);
		contentPane.add(lbl_SDT);
		
		txt_SDT = new JTextField();
		txt_SDT.setBounds(172, 45, 209, 26);
		contentPane.add(txt_SDT);
		txt_SDT.setColumns(10);
		
		txt_LienHe = new JTextField();
		txt_LienHe.setBounds(172, 133, 209, 26);
		contentPane.add(txt_LienHe);
		txt_LienHe.setColumns(10);
		
		JLabel lbl_LienHe = new JLabel("Thông tin liên hệ");
		lbl_LienHe.setBounds(29, 132, 116, 29);
		contentPane.add(lbl_LienHe);
		
		JLabel lbl_DiaChi = new JLabel("Địa chỉ:");
		lbl_DiaChi.setBounds(33, 91, 88, 29);
		contentPane.add(lbl_DiaChi);
		
		txt_DiaChi = new JTextField();
		txt_DiaChi.setBounds(172, 92, 209, 26);
		contentPane.add(txt_DiaChi);
		txt_DiaChi.setColumns(10);
		
		table_ThongTinKH = new JTable();
		table_ThongTinKH.setBounds(6, 171, 438, 81);
		contentPane.add(table_ThongTinKH);
	}
}
