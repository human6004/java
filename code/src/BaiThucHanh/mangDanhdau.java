package BaiThucHanh;

import java.util.Scanner;

public class mangDanhdau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int dem = 0;
        int[] count = new int[1001];
        for (int i = 0; i < n; i++) {
            count[a[i]] =1;
        }
        for (int i = 0; i < n; i++) {
            if(count[a[i]] == 1){
                dem++;
            }
        }
        System.out.println(dem);
    }
}
