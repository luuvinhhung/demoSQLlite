package com.example.admin.sinhvien;

public class SV {
    private Integer ma;
    private String ten;

    public SV() {
    }

    public SV(Integer ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public SV(SV sv){
        this.ma=sv.ma;
        this.ten=sv.ten;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
