package BaiThucHanh;

import java.util.Scanner;

public class mang1chieucoban {
    public static boolean linearSearch(int a[], int n, int x){
        for(int i = 0; i < n; i++){
            if (x == a[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean check = true;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    check = false;
                    break;
                }
            }
            if(check){
                int dem=1;
                for(int j=i+1;j<n;j++){
                    if(a[j]==a[i]){
                        dem++;
                    }
                }
                System.out.println(a[i] + " " + dem);
            }
        }
    }
}