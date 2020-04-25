/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Quynh
 */
public class SoSanhTheoTen implements ISoSanh <SinhVien>{
    @Override
    public int soSanh(SinhVien o1,SinhVien o2){
        int Ssanh=o1.gethoTen().compareTo(o2.gethoTen());
        if(Ssanh==1)
            return 1;
        else if(Ssanh==0)
            return 0;
        else
            return -1;
    }
    
}
