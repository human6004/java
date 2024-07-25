package BaiThucHanh;

import java.util.Scanner;

public class sonhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0;
        if(a==2){
            b=0;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                b=1;
                break;
            }
        }
        if(b==1){
            System.out.println("n không là số nguyên tố");
        }
        else{
            System.out.println("n là số nguyên tố");
        }

        if (a == 0) {
            System.out.println("0");
        } else {
            StringBuilder binary = new StringBuilder();
            int number = a;
            while (a > 0) {
                binary.append(a % 2);
                a = a / 2;
            }
            System.out.println(binary.reverse().toString());
        }


    }
}
