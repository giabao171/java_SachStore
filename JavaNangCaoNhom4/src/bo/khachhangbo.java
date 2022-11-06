package bo;

import java.sql.SQLException;

import bean.khachhangbean;
import dao.khachhangdao;
import dao.taikhoandao;

public class khachhangbo {
	
	public int DangKyKh(String hoTen, String diaChi, String soDt, String Email, String tenDn, String Pass) {
		khachhangdao khdao = new khachhangdao();
		try {
			return khdao.dangKy(hoTen, diaChi, soDt, Email, tenDn, Pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public khachhangbean DangNhapKh(String tendn, String pass) {
		khachhangdao khdao = new khachhangdao();
		try {
			return khdao.KTDangNhap(tendn, pass);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public static String ConvertPassMd5(String pass) {
		String mk ="";
		khachhangdao khdao = new khachhangdao();
		mk = khdao.getMd5Hash(pass);
		return mk;
	}
}
