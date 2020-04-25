/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author computer
 */
public class QLSV { 
    public ArrayList<SinhVien > dsSV=new ArrayList< >();
    ISoSanh Ssanh;
    public void setSoSanh(ISoSanh Ssanh){
        this.Ssanh=Ssanh;
    }
    //Them SV vao danh sach
    public void themSV (SinhVien sinhVien){
        dsSV.add(sinhVien);
    }
    //Sap xep 
    public void SxepSV(){
        for(int i=0;i<dsSV.size()-1;i++){
            for(int j=i+1;j<dsSV.size();j++){
                if(Ssanh.soSanh(dsSV.get(i),dsSV.get(j))==1){
                    SinhVien A=dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, A);
                }
                    
            }
        }
            
    }
       public void inDSSV(){
           for(int i=0; i<dsSV.size();i++){
               dsSV.get(i).inTTSV();
           }
       }
               
    
}
