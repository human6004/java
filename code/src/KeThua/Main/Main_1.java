package KeThua.Main;

import KeThua.Class.Cylider;

import java.util.*;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Cylider> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String color = sc.next();
            double banKinh = sc.nextDouble();
            double chieuCao = sc.nextDouble();
            arr.add(new Cylider(chieuCao, banKinh, color));
        }
        Collections.sort(arr, new  Comparator<Cylider>() {
            @Override
            public int compare(Cylider o1, Cylider o2) {
                if(o1.getVolume() != o2.getVolume()){
                    if(o1.getVolume() > o2.getVolume()){
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
                return o1.getColor().compareTo(o2.getColor());
            }

        });
        for(Cylider x : arr){
            System.out.println(x);
        }
    }
}
