package BaiThucHanh;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map =new HashMap<>();
        int n = sc.nextInt( );
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(map.containsKey(arr[i])){
                int tansuat=map.get(arr[i]);
                ++tansuat;
                map.put(arr[i],tansuat);
            }
            else{
                map.put(arr[i],1);
            }
        }
//            Arrays.sort(arr);
        for(int j=0;j<n;j++){
            if(map.containsKey(arr[j])){
                System.out.println(arr[j] + " " + map.get(arr[j]));
                map.remove(arr[j]);
            }
        }
        //duyet map
        Set<Map.Entry<Integer,Integer>> entrySet =map.entrySet();
        for(Map.Entry<Integer,Integer> entry:entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());;
        }
    }
}
