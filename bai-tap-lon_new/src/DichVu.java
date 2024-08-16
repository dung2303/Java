import java.io.Serializable;
import java.util.Scanner;

public class DichVu implements Serializable {
    private String maDV,tenDV;
    private int soLuong;
    private float donGia;

    public void nhapDV(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nNhap ma dich vu: ");
        maDV=sc.nextLine();
        System.out.print("\nNhap ten dich vu: ");
        tenDV=sc.nextLine();
        System.out.print("\nNhap so luong dich vu: ");
        soLuong=sc.nextInt();
        System.out.print("\nNhap don gia: ");
        donGia=sc.nextFloat();
        }
    public void xuatDV(){
        System.out.printf("\n%-10s%-15s%-10d%-15.2f",maDV,tenDV,soLuong,donGia);
    }
    float thanhTien(){
        return donGia*soLuong;
    }
}
