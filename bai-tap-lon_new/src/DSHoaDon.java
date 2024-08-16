import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DSHoaDon  implements Serializable{
    ArrayList<HoaDon> lstHD=new ArrayList<>();
    public void nhapDSHD(){
        Scanner sc =new Scanner(System.in);
        System.out.print("\nNhap vao so luong hoa don: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            HoaDon hd=new HoaDon();
            hd.nhapHD();
            lstHD.add(hd);
        }
    }
    public void xuatDSHD(){
        System.out.println(" Hien danh sach hoa don:");
        for(HoaDon hd:lstHD) {
            hd.xuatHD();
        }
    }
    public void tongHD(){
        float s=0;
        for(HoaDon hd: lstHD)
            s=s+hd.tongTien();
        System.out.println(" Tong tien hoa don: "+s);
    }
    public void sapxep(){
        System.out.println(" Danh sach sau khi sap xep: ");
        Collections.sort(lstHD,new SapXepHoaDon());
        for(HoaDon hd:lstHD)
            hd.xuatHD();
    }
    public void timKiem(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ngay lap hoa don can tim: ");
        String t=sc.nextLine();
        boolean check=false;
        for (HoaDon hd:lstHD)
            if(hd.getNgayLap().equals(t)){
                hd.xuatHD();
                check = true;
            }
        if(!check) System.out.println("Khong tim thay !");
    }
    public void minHD() {
        HoaDon minHD = new HoaDon();
        for (HoaDon hd : lstHD) {
            if (hd.tongTien() < minHD.tongTien() || minHD.tongTien() == 0) {
            minHD = hd;
            }
        }
        System.out.println("Hoa don co so tien nho nhat la: " );
        minHD.xuatHD();
    }

    public void maxHD() {
        HoaDon maxHD = new HoaDon();
        for (HoaDon hd : lstHD) {
            if (hd.tongTien() > maxHD.tongTien() || maxHD.tongTien() == 0) {
                maxHD = hd;
            }
        }
        System.out.println("Hoa don co so tien lon nhat la: ");
        maxHD.xuatHD();
    }
    public void themDV(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap vi tri hoa don can them dich vu: ");
        int t=sc.nextInt();
        lstHD.get(t-1).them();
    }
      public void ghiFile()throws IOException{
          FileOutputStream fout = new FileOutputStream("hoadon.dat");
          ObjectOutputStream out = new ObjectOutputStream(fout);
          out.writeObject(lstHD);
          fout.close();
          out.close();
      }
    public void docFile() throws IOException,ClassNotFoundException{
        FileInputStream fin=new FileInputStream("hoadon.dat");
        ObjectInputStream in=new ObjectInputStream(fin);
        lstHD = (ArrayList<HoaDon>) in.readObject();
        in.close();
        fin.close();
    }
}