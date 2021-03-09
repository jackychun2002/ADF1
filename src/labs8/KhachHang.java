package labs8;

public abstract class KhachHang {
    protected int maKH;
    protected String tenKH;
    protected String ngayXuatHD;
    protected int soLuong;

    public int getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getNgayXuatHD() {
        return ngayXuatHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setNgayXuatHD(String ngayXuatHD) {
        this.ngayXuatHD = ngayXuatHD;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public abstract double thanhTien();
}