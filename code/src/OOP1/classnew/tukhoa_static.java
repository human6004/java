package OOP1.classnew;

public class tukhoa_static {
    //attribute
    private String id;
    private String name;
    public static  int soluong=0;
    public tukhoa_static(){
        this.soluong ++;
    }
    //method
    public tukhoa_static(String id, String name){
        this.id = id;
        this.name = name;
        this.soluong++;
    }
    //getter
    public String getName() {
        return name;
    }
    public static int getSoLuong(){// tu khoa static no la 1 class, ko phai la 1 doi tuong nao do
        // nen khi dung ham nay ta goi thang getSoLuong ko can thong qua 1 doi tuong nao het
        return soluong;
    }
}
