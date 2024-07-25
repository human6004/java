package BaiThucHanh;

import java.util.ArrayList;
import java.util.Scanner;

public class binarySearch {
    public static  boolean binarySrearch (ArrayList<Integer> a, int n, int x){
        int l=0,r=n-1;
        while (l<=r){
            int mid = (l+r)/2;
            if (a.get(mid) ==x){
                return true;
            }
            else if(a.get(mid) < x){
                l=mid +1;
            }
            else {
                r=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            a.add(temp);
        }
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        for(int z : a){
            System.out.print(z + " ");
        }
        boolean res = binarySrearch(a, n, x);
        System.out.println(res);
    }
}
