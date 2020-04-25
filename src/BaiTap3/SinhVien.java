/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Date;

/**
 *
 * @author computer
 */
public class SinhVien {
    public String hoTen;
    public Date ngaySinh;
    public float diemTB;
    public SinhVien(){};
    public SinhVien(String hoTen, Date ngaySinh ,float diemTB){
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.diemTB=diemTB;
    }
    public void setHoTen(String hoTen)
    {
        this.hoTen=hoTen;
        
    }
    public void setngaySinh(Date ngaySinh){
        this.ngaySinh=ngaySinh;
    }
    public void setdiemTB(float diemTB){
        this.diemTB=diemTB;
    }
    public String gethoTen(){
        return this.hoTen;
    }
    public Date getNgaySinh(){
        return this.ngaySinh;
        
    }
    public float getdiemTB(){
        return this.diemTB;
        
    }
    public void inTTSV(){
        System.out.println("Ho ten SV:"+this.hoTen+"\nNgay sinh:"+this.ngaySinh
        +"\nDiem trung binh:"+this.diemTB);
    }
    
            
    
    
            
    
}
