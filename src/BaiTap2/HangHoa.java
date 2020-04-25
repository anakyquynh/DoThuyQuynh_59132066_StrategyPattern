/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author computer
 */
public class HangHoa {
    public String tenHH;
    public int gia;
    public String moTa;
    public HangHoa(){};
    public HangHoa(String tenHH,int gia,String moTa){
        this.tenHH=tenHH;
        this.gia=gia;
        this.moTa=moTa;
    }    
    public void setTenHH(String tenHH){
        this.tenHH=tenHH;
    }
    public void setGia(int gia){
        this.gia=gia;
        
    }
    public void setMoTa(String moTa){
        this.moTa=moTa;
    }
    public String getTenHH(){
        return this.tenHH;
    }
    public int getGia(){
        return this.gia;
    }
    public String getMoTa(){
        return this.moTa;
    }
    public void thongtinHH()
    {
        System.out.println("Ten HH:"+ this.tenHH+ "\nGia:"+this.gia
                +"\nMo ta:"+this.moTa);
    }
}
