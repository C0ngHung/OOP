package entity;

public class SinhVien {
    public static String schoolName = "FPT";
    private String fullName;
    private int age;
    private String major;

   public SinhVien() {}

    public SinhVien(String fullName, int age, String major) {
        this.fullName = fullName;
        this.age = age;
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
