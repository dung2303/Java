import java.io.Serializable;
import java.util.Scanner;

public class QuanLyPhieuKhamBenh implements Serializable {
    public static void main(String []args) throws Exception {
        DSHoaDon lstDSHD=new DSHoaDon();
        int chon;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("\n******Benh Vien BACH MAI******");
            System.out.print("\n=========MENU=========");
            System.out.print("\n1.Nhap danh sach hoa don.");
            System.out.print("\n2.In danh sach hoa don.");
            System.out.print("\n3.Tinh tong tien hoa don.");
            System.out.print("\n4.Sap xep hoa don tang dan theo so tien.");
            System.out.print("\n5.Tim kiem hoa don theo ngay lap.");
            System.out.print("\n6.Tim hoa don co so tien lon nhat.");
            System.out.print("\n7.Tim hoa don co so tien nho nhat.");
            System.out.print("\n8.Them dich vu.");
            System.out.print("\n9.Luu danh sach vua nhap vao file hoadon.dat.");
            System.out.print("\n10.Doc file hoadon.dat.");
            System.out.print("\n0.Thoat.");
            System.out.print("\n Moi ban nhap lua chon: ");
            chon=sc.nextInt();
            switch(chon){
                case 1:lstDSHD.nhapDSHD(); break;
                case 2:lstDSHD.xuatDSHD(); break;
                case 3:lstDSHD.tongHD(); break;
                case 4:lstDSHD.sapxep(); break;
                case 5:lstDSHD.timKiem(); break;
                case 6:lstDSHD.maxHD(); break;
                case 7:lstDSHD.minHD(); break;
                case 8:lstDSHD.themDV(); break;
                case 9:lstDSHD.ghiFile(); break;
                case 10:lstDSHD.docFile(); break;
                case 0:System.exit(0);
                default: break;
            }
        }while (chon!=0);
    }
}
