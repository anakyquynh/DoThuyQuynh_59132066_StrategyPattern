/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Quynh
 */
public class MainBT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hinh thuc buon ban online
        GioHang Gh1 =new GioHang();
        HangHoa Hh1=new HangHoa("Pessi",350000,"Danh cho moi do tuoi");
        HangHoa Hh2=new HangHoa("Sua Milo",210000,"Danh cho do tuoi");
        Gh1.themHH(Hh1);
        Gh1.themHH(Hh2);
        Gh1.setHTThanhToan(new ThanhToanOnline());
        System.out.println("Tong tien hang:"+ Gh1.tongTienHang());
        System.out.println("Tong tien phai tra:"+ Gh1.tongTienPhaiTra());
        //Thanh toan COD
        GioHang Gh2= new GioHang();
        HangHoa Hh3= new HangHoa();
        Hh3.setTenHH("Khau trang y te");
        Hh3.setGia(120000);
        Hh3.setMoTa("Danh cho moi do tuoi");
        HangHoa Hh4= new HangHoa();
        Hh4.setTenHH("Banh Snack");
        Hh4.setGia(200000);
        Hh4.setMoTa("Danh cho moi do tuoi");
        Gh2.themHH(Hh3);
        Gh2.themHH(Hh4);
        Gh2.setHTThanhToan(new ThanhToanCOD());
        System.out.println("\nThanh Toan COD\n");
        Gh2.inDSHH();
        System.out.println("Tong tien hang:"+Gh2.tongTienHang());
        System.out.println("Tong tien phai tra:"+ Gh2.tongTienPhaiTra());
                
                
    }
    
}
