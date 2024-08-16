import java.io.Serializable;
import java.util.Scanner;

public class BenhNhan extends Nguoi implements Serializable {
    private String maBN,diaChi;

    public void nhapBN(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nNhap ma benh nhan: ");
        maBN=sc.nextLine();
        System.out.print("\nNhap dia chi benh nhan: ");
        diaChi=sc.nextLine();
    }
    public void xuatBN(){
        super.xuat();
        System.out.printf("%-10s%-20s",maBN,diaChi);
    }
}
