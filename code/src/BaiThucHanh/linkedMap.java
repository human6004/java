package BaiThucHanh;

import java.util.*;

public class linkedMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,Integer> map =new LinkedHashMap<>();// co thu tu
      //  TreeMap<Integer,Integer> treeMap =new TreeMap<>(); sap xep theo thu tu tang dan
        map.put(1,2);
        map.put(3,4);
        map.put(2,3);
        map.put(5,6);
        map.put(4,5);
        //duyet map
        Set<Map.Entry<Integer,Integer>> entrySet =map.entrySet();
        for(Map.Entry<Integer,Integer> entry:entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());;
        }
        System.out.println();
        //su dung arrylist de duyet map
        ArrayList<Map.Entry<Integer,Integer>> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            arr.add(entry);
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
        }
    }
}
