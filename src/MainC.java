import entity.SinhVien;
import entity.SinhVienTN;

public class MainC {
    public static void main(String[] args) {
        SinhVienTN sinhVienTN1 = new SinhVienTN("Đào Công Hùng", 26, "FullStack", 10, 10, 10);
        sinhVienTN1.setFullName("Đào Công Hùng");


        System.out.println(">> fullName: "+ sinhVienTN1.getFullName());
        System.out.println(">> toan: " + sinhVienTN1.getToan() );

    }
}