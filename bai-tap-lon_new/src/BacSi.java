import java.io.Serializable;
import java.util.Scanner;

public class BacSi extends Nguoi implements Serializable {
    private String maBS,viTriLam,capBac,chuyenKhoa;

    public void nhapBS(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nNhap ma bac si: ");
        maBS= sc.nextLine();
        System.out.print("\nNhap vi tri lam: ");
        viTriLam=sc.nextLine();
        System.out.print("\nNhap cap bac: ");
        capBac=sc.nextLine();
        System.out.print("\nNhap chuyen khoa: ");
        chuyenKhoa=sc.nextLine();
    }
    public void xuatBS(){
        super.xuat();
        System.out.printf("%-10s%-10s%-10s%-15s",maBS,viTriLam,capBac,chuyenKhoa);
    }
}
