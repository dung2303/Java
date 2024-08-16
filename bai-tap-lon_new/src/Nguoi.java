import java.io.Serializable;
import java.util.Scanner;

public class Nguoi implements Serializable {
    private String hoTen,sdt,email,ngaySinh;

    public void nhap(){
        System.out.print("\nNhap ho ten: ");
        Scanner sc=new Scanner(System.in);
        hoTen = sc.nextLine();
        System.out.print("\nNhap so dien thoai: ");
        sdt=sc.nextLine();
        System.out.print("\nNhap email: ");
        email=sc.nextLine();
        System.out.print("\nNhap ngay sinh: ");
        ngaySinh=sc.nextLine();
    }
    public void xuat(){
        System.out.printf("\n%-20s%-15s%-20s%-10s",hoTen,sdt,email,ngaySinh);
    }
}
