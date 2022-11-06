package dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.khachhangbean;
import bean.taikhoanbean;

public class khachhangdao {

	public int dangKy(String hoTen, String diaChi, String soDt, String Email, String tenDn, String Pass)throws SQLException {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql="insert into KhachHang(hoten,diachi,sodt,email,tendn,pass) values (?,?,?,?,?,?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		
		//Truyen cau lenh vao tham so
		cmd.setString(1,hoTen);
		cmd.setString(2,diaChi);
		cmd.setString(3,soDt);
		cmd.setString(4,Email);
		cmd.setString(5,tenDn);
		cmd.setString(6,Pass);
		
		return cmd.executeUpdate();
	}
	
	public khachhangbean KTDangNhap(String tenDN, String Pass) throws SQLException {
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql="select * from KhachHang where tendn = ? and pass =?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		
		//Truyen cau lenh vao tham so
		cmd.setString(1,tenDN);
		cmd.setString(2,Pass);
		        
		//Thuc hien
		ResultSet rs = cmd.executeQuery();
		khachhangbean khb =null;
		while (rs.next()){
			Long makh = rs.getLong("makh");
			String ht = rs.getString("hoten");
			String dc = rs.getString("diachi");
			String sdt = rs.getString("sodt");
			String email = rs.getString("email");
			String tdn = rs.getString("tendn");
			String pass = rs.getString("pass");
			khb = new khachhangbean(makh, ht, dc, sdt, email, tdn, pass);
	    }
		rs.close();
		return khb;
		
	}
	
	public static String getMd5Hash(String input) {
	    try {
	      MessageDigest md = MessageDigest.getInstance("MD5");
	      byte[] messageDigest = md.digest(input.getBytes());
	      BigInteger no = new BigInteger(1, messageDigest);
	      String hashtext = no.toString(16);
	      while (hashtext.length() < 32) {
	        hashtext = "0" + hashtext;
	      }
	      return hashtext;
	    } catch (NoSuchAlgorithmException e) {
	      throw new RuntimeException(e);
	    }
	  }
}
