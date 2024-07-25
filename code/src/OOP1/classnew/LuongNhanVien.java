package OOP1.classnew;

public class LuongNhanVien {
    private String id,hoTen;
    private int LuongCoBan, NgayCong;
    private  String ChucVu;
    public LuongNhanVien(String id, String hoTen, int LuongCoBan, int NgayCong, String ChucVu) {
        this.id = id;
        this.hoTen = hoTen;
        this.LuongCoBan = LuongCoBan;
        this.NgayCong = NgayCong;
        this.ChucVu = ChucVu;
    }
    public  int getLuongCoBan() {
        return this.LuongCoBan * this.NgayCong;
    }
    public  int getThuong(){
        int luong = this.getLuongCoBan();
        if(this.NgayCong >= 25){
            return (int)(0.2*luong);
        }
        else if(this.NgayCong >= 20){
            return (int)(0.1*luong);
        }
        return 0;
    }
    public int getPhuCap(){
        if(this.ChucVu.equals("GD")) return 250000;
        else if (this.ChucVu.equals("PGD")) return 200000;
        return 150000;
    }
    public String toString(){
        return this.id + " " + this.hoTen + " " + this.getLuongCoBan() + " " + this.getThuong() + " " + this.getPhuCap() + " " + (this.getLuongCoBan() + this.getThuong() + this.getPhuCap());
    }
}
