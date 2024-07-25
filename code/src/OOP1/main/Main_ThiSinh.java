package OOP1.main;

import OOP1.classnew.ThiSinh;

import java.util.Scanner;

public class Main_ThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(thiSinh);
    }
}
