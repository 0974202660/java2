/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;



/**
 *
 * @author Fpoly
 */
public class SinhVien {

    private String masv, hoten;
    private double diem;

    public SinhVien() {
        this.masv = "PH99999";
        this.hoten = "Siêu Nhân Trượt";
        this.diem = 4.9;
    }

    public SinhVien(String masv, String hoten, double diem) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return this.masv+"\t"+this.hoten+"\t"+this.diem;
    }

    

}
