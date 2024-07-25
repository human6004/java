package OOP1.main;

import OOP1.classnew.tukhoa_static;

import java.util.Scanner;

public class Main_tukhoa_static {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tukhoa_static a = new tukhoa_static();
        tukhoa_static b = new tukhoa_static();
        System.out.println(a.getSoLuong());
        System.out.println(b.getSoLuong());
        tukhoa_static c = new tukhoa_static("123","teo");
        System.out.println(a.getSoLuong());
        System.out.println(b.getSoLuong());
        System.out.println(c.getSoLuong());
        System.out.println(tukhoa_static.getSoLuong());// goi thang getSoLuong ko can thong 1 doi tuong naoz
    }
}
