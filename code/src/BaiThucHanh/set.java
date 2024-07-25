package BaiThucHanh;

import java.util.HashSet;
import java.util.Scanner;

public class set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> set1 = new HashSet <>();
//        LinkedHashSet<Integer> set2 = new LinkedHashSet <>(); cac phan tu them vo duoc co dinh
//        TreeSet<Integer> set3 = new TreeSet <>(); duoc sap xep theo thu tu tang dan
        int n=sc.nextInt();
        for(int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            set1.add(tmp);
        }
        System.out.println(set1);
        for(int x : set1){
            System.out.print(x + " ");
        }
    }
}
