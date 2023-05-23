import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class QuanLyMuaVe {
	Queue<KhachHang> danhSachKhachHang;	
	Set<String> danhSachGa;
	
	public QuanLyMuaVe() {
		danhSachKhachHang = new LinkedList<>();
		danhSachGa = new HashSet<>();
	}
	public void themKhachHang (String soCMND, String tenKhachHang, String gaDen, double giaTien ) {
		for(KhachHang khachHang : danhSachKhachHang) {
			if(khachHang.getSoCMND().equals(soCMND)){
				khachHang.gaDen = gaDen;
				khachHang.giaTien = giaTien;
				return;
			}
		}
		KhachHang KhachHangMoi = new KhachHang(soCMND, tenKhachHang, gaDen, giaTien);
		danhSachKhachHang.add(KhachHangMoi);
	}
	
	public void banVe() {
		if(danhSachKhachHang.isEmpty()) {
			System.out.println("Khong co khach hang trong danh sach mua ve ");
			return;
		}
		
		KhachHang khachHangDauTien = danhSachKhachHang.poll();
		System.out.println("Ban ve thanh cong " + khachHangDauTien);
	}
	public void huyKhachHang(String soCMND) {
        Iterator<KhachHang> iterator = danhSachKhachHang.iterator();
        while (iterator.hasNext()) {
            KhachHang khachHang = iterator.next();
            if (khachHang.getSoCMND().equals(soCMND)) {
                iterator.remove();
                System.out.println("Hủy thành công khách hàng: " + khachHang);
                return;
            }
        }

        System.out.println("Không tìm thấy khách hàng có số CMND: " + soCMND);
    }
	public void thongKe() {
        int khachHangChoNhanVe = danhSachKhachHang.size();
        int khachHangDaNhanVe = danhSachKhachHang.size();
        double tongTienDaThu = 0;

        for (KhachHang khachHang : danhSachKhachHang) {
            tongTienDaThu += khachHang.getGiaTien();
        }

        System.out.println("Thống kê tình hình bán vé:");
        System.out.println("Khách hàng chờ nhận vé: " + khachHangChoNhanVe);
        System.out.println("Khách hàng đã nhận vé: " + khachHangDaNhanVe);
        System.out.println("Tổng số tiền đã thu: " + tongTienDaThu);
    }

    public void luuDanhSach() {
        System.out.println("Lưu danh sách khách hàng vào file.");
    }

    public void hienThiDanhSachGa() {
        System.out.println("Danh sách các ga đang chờ mua vé:");
        for (String ga : danhSachGa) {
            System.out.println(ga);
        }
    }

    public void hienThiDanhSachGaVaSoVeTuongUng() {
        System.out.println("Danh sách các ga đang chờ mua vé và số vé tương ứng:");
        for (KhachHang khachHang : danhSachKhachHang) {
            danhSachGa.add(khachHang.getGaDen());
        }
        for (String ga : danhSachGa) {
            int soVeTuongUng = 0;
            for (KhachHang khachHang : danhSachKhachHang) {
                if (khachHang.getGaDen().equals(ga)) {
                    soVeTuongUng++;
                }
            }
            System.out.println("Ga: " + ga + ", Số vé tương ứng: " + soVeTuongUng);
        }
    }
    
}
