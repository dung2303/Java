import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon implements Serializable {
    private String soHoaDon,ngayLap,nguoiLap;

    ArrayList<DichVu> lstDV ;
    public HoaDon(){
        lstDV =new ArrayList<>();
    }
    BacSi bs;
    BenhNhan bn;
    DichVu dv=new DichVu();
    public void nhapHD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.print("\nNhap so hoa don: ");
        soHoaDon=sc.nextLine();
        System.out.print("\nNhap ngay lap: ");
        ngayLap=sc.nextLine();
        System.out.print("\nNhap nguoi lap: ");
        nguoiLap=sc.nextLine();
        System.out.println("Nhap vao thong tin bac si: ");
        bs=new BacSi();
        bs.nhapBS();
        System.out.println("Nhap vao thong tin benh nhan: ");
        bn=new BenhNhan();
        bn.nhapBN();
        System.out.print("\nNhap so luong dich vu: ");
        int n=sc.nextInt();
        System.out.print("\n Nhap thong tin dich vu: ");
        for (int i=0;i<n;i++){
        dv.nhapDV();
        lstDV.add(dv);}
    }
    public void xuatHD(){
        System.out.print("\nSo hoa don: "+soHoaDon);
        System.out.print("\nNgay lap: "+ngayLap);
        System.out.print("\nNguoi lap: "+nguoiLap);
        System.out.print("\n Thong tin Bac si: ");
        System.out.printf("\n%-20s%-15s%-20s%-10s%-10s%-10s%-10s%-15s","Ho Ten","So DT","Email","Ngay Sinh","Ma BS","Vi Tri Lam","Cap Bac","Chuyen Khoa");
        bs.xuatBS();
        System.out.print("\n Thong tin Benh nhan: ");
        System.out.printf("\n%-20s%-15s%-20s%-10s%-10s%-20s","Ho Ten","So DT","Email","Ngay Sinh","Ma BN","Dia Chi");
        bn.xuatBN();
        System.out.print("\n Thong tin dich vu dang ky: ");
        System.out.printf("\n%-10s%-15s%-10s%-15s","Ma DV","Ten DV","So Luong","Don Gia");
        for(DichVu dv:lstDV)
        dv.xuatDV();
        System.out.print("\n--------------");
    }
    float tongTien() {
        int s = 0;
        for (DichVu dv : lstDV)
            s += s + dv.thanhTien();
        return s;
    }
    String getNgayLap(){
        return ngayLap;
    }
    public void them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong dich vu can them: ");
        int sl=sc.nextInt();
        for(int i=0;i<sl;i++){
            DichVu newDV=new DichVu();
            newDV.nhapDV();
            lstDV.add(newDV);
        }
    }
}
