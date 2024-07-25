package OOP1.classnew;

public class setter_getter_toString {
    private String id;
    private String name;
    private String className;
    private String brith;
    private double gpa;

    public setter_getter_toString(){
        id ="";
        name ="";
        className ="";
        brith = "";
        gpa = 0;
    }
//    public SinhVien1(String ma, String ten, String lop, String ngaysinh, double diem){
//        id = ma;
//        name = ten;
//        className = lop;
//        brith = ngaysinh;
//        gpa = (double)diem;
//    }
    //con tri this: giup chi ra ai la thuoc tinh, ai la tham so
    public setter_getter_toString(String id, String name, String className, String brith, double gpa){
        this.id = id;
        this.name = name;
        this.className = className;
        this.brith =brith;
        this.gpa = gpa;
    }
    public void chuanhoa(){
        StringBuilder sb = new StringBuilder(brith);
        if(sb.charAt(1) == '/'){
            sb.insert(0,"0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3,"0");
        }
        brith = sb.toString();
    }
    public void display(){
        System.out.print(id + " " + name + " " + className + " " + brith + " " + gpa  );
//        System.out.printf(" %.1f", gpa);
    }
    //setter and getter
    public double getGpa(){
        return this.gpa;
    }
    public  String getName(){
        return this.name;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    //toString
    public String toString(){
        //reuturn ve noi dung ma minh muon mo ta
        return this.id + " " + this.name + " " + this.className + " " + this.brith + " " + this.gpa;
    }
}
