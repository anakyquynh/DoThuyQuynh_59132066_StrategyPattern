/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Quynh
 */
public class GioHang {
   public ArrayList<HangHoa> dsHH =new ArrayList<>();
   IThanhToan thanhToan;
   public void setHTThanhToan(IThanhToan thanhToan){
      this.thanhToan=thanhToan; 
   }
   //Them hang hoa 
   public void themHH(HangHoa hangHoa){
       dsHH.add(hangHoa);
   }
   public int tongTienHang(){
       int n=0;
       for(HangHoa hangHoa:dsHH)
           n+=hangHoa.getGia();
       return n;
   }
   public double tongTienPhaiTra(){
       return thanhToan.thanhToan(tongTienHang());
   }
   public void inDSHH(){
       for (int i=0;i<dsHH.size();i++){
           dsHH.get(i).thongtinHH();
       }
           
   }
   
}
