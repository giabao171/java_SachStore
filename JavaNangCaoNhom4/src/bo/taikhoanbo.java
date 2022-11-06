package bo;

import java.sql.SQLException;

import bean.taikhoanbean;
import dao.taikhoandao;

public class taikhoanbo {
	public taikhoanbean DangNhap (String tDN, String mK) {
		taikhoandao tkdn = new taikhoandao();
		try {
			return tkdn.ktDangNhap(tDN, mK);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public int DangKy (String tDN, String mK) {
		taikhoandao tkdn = new taikhoandao();
		try {
			return tkdn.DangKy(tDN, mK);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public static String maHoaMatKhau(String mK) {
		String mk ="";
		taikhoandao tkdao = new taikhoandao();
		mk = tkdao.getMd5Hash(mk);
		return mk;
	}
}
