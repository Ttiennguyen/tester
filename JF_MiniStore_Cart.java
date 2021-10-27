import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JF_MiniStore_Cart extends JFrame {

	private JPanel contentPane;
	private JTextField txt_NhapMaSP;
	private JTextField txt_NhapSL;
	private JTextField txt_NhapGiaTien;
	private JTable table_giohang;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_MiniStore_Cart frame = new JF_MiniStore_Cart();
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
	public JF_MiniStore_Cart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_GioHang = new JLabel("Giỏ Hàng");
		lbl_GioHang.setBounds(187, 6, 61, 16);
		contentPane.add(lbl_GioHang);
		
		JLabel lbl_maSP = new JLabel("Nhập mã SP");
		lbl_maSP.setBounds(6, 32, 78, 16);
		contentPane.add(lbl_maSP);
		
		txt_NhapMaSP = new JTextField();
		txt_NhapMaSP.setBounds(104, 29, 208, 26);
		contentPane.add(txt_NhapMaSP);
		txt_NhapMaSP.setColumns(10);
		
		JLabel lbl_SoLuong = new JLabel("Nhập số lượng");
		lbl_SoLuong.setBounds(4, 68, 94, 16);
		contentPane.add(lbl_SoLuong);
		
		txt_NhapSL = new JTextField();
		txt_NhapSL.setColumns(10);
		txt_NhapSL.setBounds(104, 63, 208, 26);
		contentPane.add(txt_NhapSL);
		
		txt_NhapGiaTien = new JTextField();
		txt_NhapGiaTien.setBounds(104, 101, 208, 26);
		contentPane.add(txt_NhapGiaTien);
		txt_NhapGiaTien.setColumns(10);
		
		JLabel lbl_GiaTien = new JLabel("Giá tiền");
		lbl_GiaTien.setBounds(6, 106, 61, 16);
		contentPane.add(lbl_GiaTien);
		
		table_giohang = new JTable();
		table_giohang.setBounds(6, 153, 438, 113);
		contentPane.add(table_giohang);
		
		JButton btn_themSP = new JButton("thêm");
		btn_themSP.setBounds(327, 27, 117, 29);
		contentPane.add(btn_themSP);
		
		JButton btn_XoaSP = new JButton("xoá ");
		btn_XoaSP.setBounds(327, 63, 117, 29);
		contentPane.add(btn_XoaSP);
		
		JButton btn_InHoaDon = new JButton("in hoá đơn");
		btn_InHoaDon.setBounds(324, 101, 117, 29);
		contentPane.add(btn_InHoaDon);
	}
}