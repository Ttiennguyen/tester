import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JF_MiniStore_General_Management extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_MiniStore_General_Management frame = new JF_MiniStore_General_Management();
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
	public JF_MiniStore_General_Management() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_QuanLiChung = new JLabel("Quản lý chung");
		lbl_QuanLiChung.setBounds(171, 6, 96, 36);
		contentPane.add(lbl_QuanLiChung);
		
		JButton btn_SanPham = new JButton("Sản Phẩm");
		btn_SanPham.setBounds(54, 54, 138, 44);
		contentPane.add(btn_SanPham);
		
		JButton btn_khachHang = new JButton("khách Hàng");
		btn_khachHang.setBounds(236, 54, 138, 44);
		contentPane.add(btn_khachHang);
		
		JButton btn_NhanVien = new JButton("Nhân Viên");
		btn_NhanVien.setBounds(236, 110, 138, 44);
		contentPane.add(btn_NhanVien);
		
		JButton btn_Thoat = new JButton("Thoát");
		btn_Thoat.setBounds(236, 166, 138, 44);
		contentPane.add(btn_Thoat);
		
		JButton btn_GioHang = new JButton("Giỏ Hàng");
		btn_GioHang.setBounds(54, 110, 138, 44);
		contentPane.add(btn_GioHang);
		
		JButton btn_NgonNgu = new JButton("Ngôn Ngữ");
		btn_NgonNgu.setBounds(54, 166, 138, 44);
		contentPane.add(btn_NgonNgu);
	}

}