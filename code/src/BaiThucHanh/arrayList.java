package BaiThucHanh;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            a.add(temp);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i) + " ");
        }
    }
}
