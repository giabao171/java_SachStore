package dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.taikhoanbean;

public class taikhoandao {
	
	public taikhoanbean ktDangNhap(String tenDN, String Mk) throws SQLException{
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql="select * from DangNhap where TenDangNhap = ? and MatKhau = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		
		//Truyen cau lenh vao tham so
		cmd.setString(1,tenDN);
        cmd.setString(2,Mk);
        
        //Thuc hien
		ResultSet rs = cmd.executeQuery();
		taikhoanbean tk = null;
        while (rs.next()){
        	String tenDangNhap = rs.getString("TenDangNhap");
        	String matKhau = rs.getString("MatKhau");
        	Boolean quyen = rs.getBoolean("Quyen");
            tk= new taikhoanbean(tenDangNhap, matKhau, quyen);
        }
        rs.close();
		return tk;
	}
	
	public int DangKy(String tenDN, String Mk) throws SQLException{
		KetNoi kn = new KetNoi();
		kn.KetNoi();
		String sql="INSERT INTO DangNhap(TenDangNhap, MatKhau, Quyen) VALUES (?, ?, ?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		
		//Truyen cau lenh vao tham so
		cmd.setString(1,tenDN);
		cmd.setString(2,Mk);
		cmd.setBoolean(3,true);
		
		return cmd.executeUpdate();
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
