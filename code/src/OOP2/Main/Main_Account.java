package OOP2.Main;

import OOP2.Class.Account;

import java.util.Scanner;

public class Main_Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Account[] accountList = new Account[n];
        int q=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String username = sc.nextLine();
            String password = sc.nextLine();
            boolean check = false;
            for (int j = 0; j < n; j++) {
                if(accountList[j].checkLogin(username,password)){
                    check = true;
                    break;
                }
            }
            if(check){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Login Failed");
            }
        }
    }
}
