/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author computer
 */
public class MainBT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws ParseException{
        // TODO code application logic here
        SimpleDateFormat formaterDate=new SimpleDateFormat("đs/MM/yyyy");
       QLSV qlSV =new QLSV();
       SinhVien SV1= new SinhVien("Duong Ngoc Thai",formaterDate.parse("20/07/1998"),8.7f);
       SinhVien SV2= new SinhVien("Nguyen Van An",formaterDate.parse("12/10/1998"),7.7f);
       qlSV.themSV(SV1);
       qlSV.themSV(SV2);
       System.out.println("Danh sach SV khi chua sap xep\n");
       qlSV.inDSSV();
       System.out.println("\nDanh sach Sv khi da sap xepp theo diem\n");
       qlSV.setSoSanh((ISoSanh) new SoSanhTheoDiem());
       qlSV.SxepSV();
       qlSV.inDSSV();
       System.out.println("\nDanh sach SV sap xep theo ten\n");
       qlSV.setSoSanh((ISoSanh) new SoSanhTheoTen());
       qlSV.SxepSV();
       qlSV.inDSSV();
    }  
}
