package OOP1.main;

import OOP1.classnew.LuongNhanVien;

import java.util.Scanner;

public class Main_LuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LuongNhanVien lnv = new LuongNhanVien("NV01", sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()), sc.nextLine());
        System.out.println(lnv.toString());
    }
}
