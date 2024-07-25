package OOP1.classnew;

public class DanhSachSinhVien {
    private String id;
    private String name;
    private String className;
    private String birth;
    private double gpa;
    public DanhSachSinhVien(int id,String name, String className, String birth, double gpa){
        this.id ="SV" + String.format("%03d",id);
        this.name = name;
        this.className = className;
        this.birth = birth;
        this.gpa =(double)gpa;
    }
    public void chuaHoaTen(){
        String[]  arr = this.name.split("\\s+");
        String newName = "";
        for(String x : arr){
            newName += Character.toUpperCase(x.charAt(0));
            for(int j = 1; j < x.length(); j++){
                newName += Character.toLowerCase(x.charAt(j));
            }
            newName += " ";
        }
        this.name = newName.trim();
    }
    public void chuanhoangaysinh(){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(1) == '/'){
            sb.insert(0,"0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3,"0");
        }
        this.birth = sb.toString();
    }
    //toString
    public  String toString(){
        return this.id + " " + this.name + " " + this.className + " " + this.birth + " " + String.format("%.2f",this.gpa);
    }

}
