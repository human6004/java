package OOP1.main;

import OOP1.classnew.DanhSachSinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_DanhSachSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DanhSachSinhVien> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            DanhSachSinhVien sv = new DanhSachSinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            sv.chuaHoaTen();
            sv.chuanhoangaysinh();
            arr.add(sv);
        }
        for( DanhSachSinhVien x :  arr){
            System.out.println(x);
        }
    }
}
