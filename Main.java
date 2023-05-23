public class Main {
    public static void main(String[] args) {
        QuanLyMuaVe quanLyMuaVe = new QuanLyMuaVe();
        
        quanLyMuaVe.themKhachHang("9098310012", "Nguyễn Văn Dũng", "Ga A", 100000);
        quanLyMuaVe.themKhachHang("1231312355", "Vũ Thị Thanh Bình ", "Ga B", 150000);
        quanLyMuaVe.themKhachHang("0938849474", "Nguyễn Vũ Thành Long ", "Ga C", 200000);

        System.out.println("Danh sách khách hàng:");
        for (KhachHang khachHang : quanLyMuaVe.danhSachKhachHang) {
            System.out.println(khachHang);
        }

        quanLyMuaVe.banVe();

        System.out.println("Danh sách khách hàng sau khi bán vé:");
        for (KhachHang khachHang : quanLyMuaVe.danhSachKhachHang) {
            System.out.println(khachHang);
        }

        quanLyMuaVe.huyKhachHang("9098310012");

        System.out.println("Danh sách khách hàng sau khi hủy:");
        for (KhachHang khachHang : quanLyMuaVe.danhSachKhachHang) {
            System.out.println(khachHang);
        }

        quanLyMuaVe.thongKe();
        quanLyMuaVe.luuDanhSach();
        quanLyMuaVe.hienThiDanhSachGa();
        quanLyMuaVe.hienThiDanhSachGaVaSoVeTuongUng();
    }
}