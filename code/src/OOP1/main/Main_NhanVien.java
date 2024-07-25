package OOP1.main;

import OOP1.classnew.NhanVien;

import java.util.Scanner;

public class Main_NhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien("00001",sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.println(nv);
    }
}
