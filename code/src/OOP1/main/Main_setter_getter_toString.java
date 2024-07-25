package OOP1.main;

import OOP1.classnew.setter_getter_toString;

public class Main_setter_getter_toString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        String c = sc.nextLine();
////        double d = sc.nextDouble();
//        SinhVien1 x = new SinhVien1("SV001",a,b,c, sc.nextDouble());
        setter_getter_toString x = new setter_getter_toString("SV001","teo","cntt","2/2/2222", 3.9);
        x.display();
        x.setGpa(2.8);
        System.out.println();
        x.display();
        System.out.println(" " + x.getName());
        System.out.println(x.getGpa());
        System.out.println(x);
    }
}
