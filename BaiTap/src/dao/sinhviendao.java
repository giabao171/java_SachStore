package dao;

import java.util.ArrayList;

import bean.sinhvienbean;

public class sinhviendao {
	public ArrayList<sinhvienbean> getsinhvien(){
		ArrayList<sinhvienbean> ds = new ArrayList<sinhvienbean>();
		ds.add(new sinhvienbean("001", "Trương Phú Quốc", "Đak Nông", "quoc123@gmail.com", "nam.jpg", "java"));
		ds.add(new sinhvienbean("002", "Ngô Thị Kim Dung", "Đà Nẵng", "dun456@gmail.com", "nu.jpg", "toan"));
		ds.add(new sinhvienbean("003", "Nguyễn Gia Bảo", "Huế", "bao789@gmail.com", "nam.jpg", "anh"));
		ds.add(new sinhvienbean("004", "Hoàng Thị Diễm Quỳnh", "Huế", "quynh147@gmail.com", "nu.jpg", "java"));
		ds.add(new sinhvienbean("005", "Mai Thị Như Ý", "Quảng Trị", "y258@gmail.com", "nu.jpg", "toan"));
		ds.add(new sinhvienbean("006", "Hà Thị Lụa", "Huế", "lua369@gmail.com", "nu.jpg", "anh"));
		return ds;
	}

}
