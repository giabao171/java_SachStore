package dao;

import java.util.ArrayList;

import bean.monhocbean;

public class monhocdao {
	public ArrayList<monhocbean> getmonhoc() {
		ArrayList<monhocbean> ds = new ArrayList<monhocbean>();
		ds.add(new monhocbean("java", "Java nâng cao"));
		ds.add(new monhocbean("toan", "Toán siu cao cấp"));
		ds.add(new monhocbean("anh", "Anh văn chuyên ngành"));
		return ds;
	}

}
