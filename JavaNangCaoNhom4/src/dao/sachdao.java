package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaibean;
import bean.sachbean;

public class sachdao {
	public ArrayList<sachbean> getsach() {
		ArrayList<sachbean> ds = new ArrayList<sachbean>();
		
		try {
			//B1: ket noi csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			//b2: lay du lieu ve
			String  sql ="select * from sach";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			//Luu all du lie vao mang
			while (rs.next()) {
				String masach = rs.getString("masach");
				String tensach =rs.getString("tensach");
				String tacgia =rs.getString("tacgia");
				int soluong =rs.getInt("soluong");
				int gia = rs.getInt("gia");
				String anh =rs.getString("anh");
				String maloai = rs.getString("maloai");
				ds.add(new sachbean(masach, tensach, tacgia, soluong, gia, anh, maloai));
			}
			//Dong ket noi
			rs.close();
			kn.cn.close();
			return ds;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
}
