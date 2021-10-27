import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JButton;

public class JF_MiniStore_Product extends JFrame {

	private JPanel contentPane;
	private JTextField txt_MaSP;
	private JTextField txt_TenSP;
	private JTextField txt_GiaBan;
	private JTextField txt_DonViTinh;
	private JTable table_BangSP;
	private JTextField txt_TimKiem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_MiniStore_Product frame = new JF_MiniStore_Product();
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
	public JF_MiniStore_Product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_BangSP = new JLabel("Bảng Sản phẩm ");
		lbl_BangSP.setBounds(178, 6, 99, 16);
		contentPane.add(lbl_BangSP);
		
		JLabel lbl_MaSP = new JLabel("Mã Sản Phẩm ");
		lbl_MaSP.setBounds(6, 26, 88, 16);
		contentPane.add(lbl_MaSP);
		
		txt_MaSP = new JTextField();
		txt_MaSP.setBounds(106, 21, 220, 26);
		contentPane.add(txt_MaSP);
		txt_MaSP.setColumns(10);
		
		JLabel lbl_TenSP = new JLabel("Tên Sản Phẩm ");
		lbl_TenSP.setBounds(6, 54, 99, 16);
		contentPane.add(lbl_TenSP);
		
		txt_TenSP = new JTextField();
		txt_TenSP.setBounds(106, 49, 220, 26);
		contentPane.add(txt_TenSP);
		txt_TenSP.setColumns(10);
		
		JLabel lbl_GiaBan = new JLabel("Giá Bán ");
		lbl_GiaBan.setBounds(6, 82, 61, 16);
		contentPane.add(lbl_GiaBan);
		
		txt_GiaBan = new JTextField();
		txt_GiaBan.setBounds(106, 77, 220, 26);
		contentPane.add(txt_GiaBan);
		txt_GiaBan.setColumns(10);
		
		JLabel lbl_DonViTInh = new JLabel("Đơn Vị Tính");
		lbl_DonViTInh.setBounds(6, 106, 99, 16);
		contentPane.add(lbl_DonViTInh);
		
		txt_DonViTinh = new JTextField();
		txt_DonViTinh.setBounds(106, 101, 220, 26);
		contentPane.add(txt_DonViTinh);
		txt_DonViTinh.setColumns(10);
		
		table_BangSP = new JTable();
		table_BangSP.setBounds(6, 164, 438, 87);
		contentPane.add(table_BangSP);
		
		JLabel lbl_TimKiem = new JLabel("Tìm Kiếm");
		lbl_TimKiem.setBounds(6, 131, 61, 16);
		contentPane.add(lbl_TimKiem);
		
		txt_TimKiem = new JTextField();
		txt_TimKiem.setBounds(106, 126, 220, 26);
		contentPane.add(txt_TimKiem);
		txt_TimKiem.setColumns(10);
		
		JButton btn_Return = new JButton("đóng");
		btn_Return.setBounds(327, 101, 117, 29);
		contentPane.add(btn_Return);
		
		JButton btn_SuaSP = new JButton("sửa");
		btn_SuaSP.setBounds(327, 77, 117, 29);
		contentPane.add(btn_SuaSP);
		
		JButton btn_XoaSP = new JButton("xoá");
		btn_XoaSP.setBounds(327, 49, 117, 29);
		contentPane.add(btn_XoaSP);
		
		JButton btn_ThemSP = new JButton("thêm mới");
		btn_ThemSP.setBounds(327, 21, 117, 29);
		contentPane.add(btn_ThemSP);
		
		JButton btn_TimKiem = new JButton("tìm kiếm");
		btn_TimKiem.setBounds(327, 126, 117, 29);
		contentPane.add(btn_TimKiem);
	}
}