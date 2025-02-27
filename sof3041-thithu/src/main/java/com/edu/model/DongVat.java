package com.edu.model;

public class DongVat {

    private String ma;
    private String ten;
    private int canNang;
    private String noiSong;

    public DongVat() {
        super();
    }

    public DongVat(String ma, String ten, int canNang, String noiSong) {
        super();
        this.ma = ma;
        this.ten = ten;
        this.canNang = canNang;
        this.noiSong = noiSong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

}
