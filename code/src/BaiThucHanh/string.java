package BaiThucHanh;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();//doc phim enter du khi o tren la nhap 1 so
        String a = sc.nextLine();
        String s = "hello world";
        String t = " hihihi";
        System.out.println(n);
        System.out.println(a);
//        System.out.println(s);
//        System.out.println(s.length());
        for (int i = 0; i < s.length() ; i++) {
            System.out.print(s.charAt(i));
        }
        for(char x : s.toCharArray()){
            System.out.print(x);
        }
        s= s.concat(t);
        System.out.println();
        for( char x : s.toCharArray()){
            System.out.print(x);
        }
    }
}
