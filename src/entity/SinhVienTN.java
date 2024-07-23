package entity;

public class SinhVienTN extends SinhVien {
    private double toan;
    private double ly;
    private double hoa;

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public SinhVienTN(String fullName, int age, String major,
                      double toan, double ly, double hoa) {
        super();
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;

    }
}
