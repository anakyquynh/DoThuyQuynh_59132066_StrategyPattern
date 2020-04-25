/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Quynh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context ct =new Context();
        ct.setTinhToan(new Cong());
        System.out.println("Phep cong 75+1= "+ ct.tinh(75,12));
        Context ct1 =new Context();
        ct1.setTinhToan(new Tru());
        System.out.println("Phep tru 54-78=" + ct1.tinh(54,78));
        
    }
    
}
