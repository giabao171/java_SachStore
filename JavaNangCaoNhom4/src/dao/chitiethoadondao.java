package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class chitiethoadondao {
	public int Them(String maSach, int soLuongMua, Long maHoaDon, Boolean damua) throws SQLException {
		KetNoi kn =new KetNoi();
		kn.KetNoi();
		String sql="insert into ChiTietHoaDon(MaSach, SoLuongMua, MaHoaDon, damua) values (?, ?, ?, ?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		
		//Truyen cau lenh vao tham so
		
		cmd.setString(1,maSach);
		cmd.setInt(2,soLuongMua);
		cmd.setLong(3,maHoaDon);
		cmd.setBoolean(4,damua);
				
		return cmd.executeUpdate();
	}
}
