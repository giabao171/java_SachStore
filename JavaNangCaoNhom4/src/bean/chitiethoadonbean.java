package bean;

public class chitiethoadonbean {
	private Long MaChiTietHD;
	private String MaSach;
	private int SoLuongMua;
	private Long MaHoaDon;
	private Boolean damua;
	public chitiethoadonbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chitiethoadonbean(Long maChiTietHD, String maSach, int soLuongMua, Long maHoaDon, Boolean damua) {
		super();
		MaChiTietHD = maChiTietHD;
		MaSach = maSach;
		SoLuongMua = soLuongMua;
		MaHoaDon = maHoaDon;
		this.damua = damua;
	}
	public Long getMaChiTietHD() {
		return MaChiTietHD;
	}
	public void setMaChiTietHD(Long maChiTietHD) {
		MaChiTietHD = maChiTietHD;
	}
	public String getMaSach() {
		return MaSach;
	}
	public void setMaSach(String maSach) {
		MaSach = maSach;
	}
	public int getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		SoLuongMua = soLuongMua;
	}
	public Long getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(Long maHoaDon) {
		MaHoaDon = maHoaDon;
	}
	public Boolean getDamua() {
		return damua;
	}
	public void setDamua(Boolean damua) {
		this.damua = damua;
	}
	
	
	
}
