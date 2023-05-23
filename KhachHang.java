
public class KhachHang {
	String soCMND;
	String tenKhachHang;
	String gaDen;
	double giaTien;
	
	public KhachHang(String soCMND, String tenKhachHang, String gaDen, double giaTien) {
		this.soCMND = soCMND;
		this.tenKhachHang = tenKhachHang;
		this.gaDen = gaDen;
		this.giaTien = giaTien;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getGaDen() {
		return gaDen;
	}

	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

	@Override
	public String toString() {
		return "KhachHang [soCMND=" + soCMND + ", tenKhachHang=" + tenKhachHang + ", gaDen=" + gaDen + ", giaTien="
				+ giaTien + "]";
	}
	
}
