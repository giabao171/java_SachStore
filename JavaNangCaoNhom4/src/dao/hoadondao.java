package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import bean.hoadonbean;
import bean.khachhangbean;

public class hoadondao {
	public int Them(Long makh, Date ngayMua, Boolean damua) throws SQLException {
		KetNoi kn =new KetNoi();
		kn.KetNoi();
		String sql="insert into hoadon(makh, NgayMua, damua) values (?, ?, ?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		
		//Truyen cau lenh vao tham so
		java.sql.Date ns = new java.sql.Date(ngayMua.getTime());
		
		cmd.setLong(1,makh);
		cmd.setDate(2,ns);
		cmd.setBoolean(3,damua);
				
		return cmd.executeUpdate();
	}
	
	public long getMHD() throws SQLException {
		KetNoi kn =new KetNoi();
		kn.KetNoi();
		String sql="select top 1 MaHoaDon from hoadon order by MaHoaDon desc";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		
		ResultSet rs = cmd.executeQuery();
		long mhd = 0;
		while (rs.next()){
			mhd = rs.getLong("MaHoaDon");
	    }
		rs.close();
		return mhd;
	}
}
