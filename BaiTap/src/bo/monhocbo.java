package bo;

import java.util.ArrayList;

import bean.monhocbean;
import dao.monhocdao;

public class monhocbo {
	monhocdao mhdao = new monhocdao();
	ArrayList<monhocbean> ds;
	public ArrayList<monhocbean> getmonhoc() {
		ds = mhdao.getmonhoc();
		return ds;
	}
}
	
