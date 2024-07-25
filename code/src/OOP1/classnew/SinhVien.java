package OOP1.classnew;

public class SinhVien {
    // thuoc tinh
    private String user;
    private String ngaysinh;
    private double diem1;
    private double diem2;
    private double diem3;
    //phuong thuc
    public void login(){
        System.out.println("dang nhap");
    }
    //constructor
    public SinhVien(String name, String thoigiansinh, double mon1, double mon2, double mon3){
        user = name;
        ngaysinh = thoigiansinh;
        diem1 = mon1;
        diem2 = mon2;
        diem3 = mon3;
    }
    public void output(){
        System.out.println("Ten sinh Vien : "+user+" "+ngaysinh);
        System.out.println("Ngay Sinh Vien : "+ngaysinh);
        System.out.println("Diem 1: "+diem1);
        System.out.println("Diem 2: "+diem2);
        System.out.println("Diem 3: "+diem3);
        System.out.println("Diem trung binh: "+(diem1+diem2+diem3));

    }
}
