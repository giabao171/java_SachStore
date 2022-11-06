package bo;

import dao.chitiethoadondao;

public class chitiethoadonbo {
	public int ThemCTHD(String maSach, int soLuongMua, Long maHoaDon, Boolean damua) {
		chitiethoadondao cthddao = new chitiethoadondao();
		try {
			return cthddao.Them(maSach, soLuongMua, maHoaDon, damua);
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
}
