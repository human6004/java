package OOP1.classnew;

public class ThiSinh {
    private  String ma,hoTen;
    private double toan,ly,hoa;
    public  ThiSinh(String ma, String hoTen, double toan, double ly, double hoa){
        this.ma =ma;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double getTongDiem(){
        double TongDiem = this.ly + this.toan + this.hoa;
        String KhuVuc =this.ma.substring(0,3);
        if(KhuVuc.equals("KV1")) return TongDiem + 0.5;
        else if(KhuVuc.equals("KV@")) return TongDiem + 1;
        else return TongDiem+ 3;
    }
    public  String toString(){
        String result ="";
        if(this.getTongDiem() >= 24){
            result = "TRUNG TUYEN";
        }
        else{
            result = "TRUOT";
        }
        if(this.getTongDiem() == (int)this.getTongDiem()){
            return  this.ma + " " + this.hoTen + " " + this.ma.charAt(2) + " " + this.getTongDiem() + " " + result;
        }
        else{
            return  this.ma + " " + this.hoTen + " " + this.ma.charAt(2) + " " + String.format("%.1f",this.getTongDiem()) + " " + result;
        }
    }
}

