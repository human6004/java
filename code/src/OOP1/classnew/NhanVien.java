package OOP1.classnew;

public class NhanVien {
    private  String id;
    private  String name;
    private  String sex;
    private  String age;
    private  String address;
    private  String mathue,hopdong;

    public NhanVien(String number, String s, String s1, String s2, String s3, String s4, String s5) {
        id = number;
        name = s;
        sex = s1;
        age = s2;
        address = s3;
        mathue = s4;
        hopdong = s5;
    }


    public String toString(){
        return this.id + " " + this.name + " " + this.sex + " " + this.age + " " + this.address + " " + this.mathue + " " + this.hopdong;
    }
}
