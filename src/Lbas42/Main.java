package Lbas42;

public class Main {
    public static void main(String[] args){
        SinhVien sv1 = new SinhVien();
        sv1.setId(1);
        sv1.setName("Tất Tay Tài");
        sv1.setPhone(666);
        sv1.setAddress("Tài Xỉu");

        SinhVien sv2 = new SinhVien();
        sv2.setId(2);
        sv2.setName("Tất Tay Xỉu");
        sv2.setPhone(111);
        sv2.setAddress("Xóc Đĩa");

        LopHoc lh = new LopHoc();
        lh.addSV(sv1);
        lh.addSV(sv2);
        lh.removeSV(sv2);

        System.out.println("Danh sach sinh vien:");
        for (SinhVien sv :lh.getDanhSachSV()){
            System.out.println(sv.getId() +" - "
                    +sv.getName()+ "-"
                    +sv.getPhone() +"-"
                    +sv.getAddress());
        }
    }
}
