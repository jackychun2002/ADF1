package Lbas42;

import java.util.ArrayList;

public class LopHoc {
    int maLop;
    String tenLop;
    String phonghoc;
    ArrayList<SinhVien> danhSachSV;

    public LopHoc(){
        danhSachSV = new ArrayList<SinhVien>();
    }

    public int getMaLop(){
       return maLop;
    }
    public void setMaLop(int maLop){
        this.maLop= maLop;
    }

    public String getTenLop(){
        return tenLop;
    }
    public void setTenLop(String tenLop){
        this.tenLop=tenLop;
    }

    public String getPhonghoc(){
        return phonghoc;
    }
    public void setPhonghoc(String phonghoc){
        this.phonghoc=phonghoc;
    }

    public ArrayList<SinhVien> getDanhSachSV(){
        return danhSachSV;
    }
    public void removeSV(SinhVien sv){
        getDanhSachSV().add(sv);
    }

    public void addSV(SinhVien sv){
        getDanhSachSV().add(sv);
    }

    public void printDanhSach(){
        System.out.println("Ma lop" + getMaLop());
        System.out.println("Ten lop" + getTenLop());
        System.out.println("Phong hoc"+ getPhonghoc());
        System.out.println("Danh sach SV:");
        for (SinhVien s : danhSachSV){
            System.out.println(s);
        }
    }
}
