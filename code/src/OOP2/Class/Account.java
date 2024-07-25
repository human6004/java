package OOP2.Class;

public class Account {
    private  String id, customerId, username, password;
    public Account(String id, String customerId, String username, String password) {
        this.id = id;
        this.customerId = customerId;
        this.username = username;
    }
    public  boolean checkLogin(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            return true;
        }
        else{
            return false;
        }
    }
}
