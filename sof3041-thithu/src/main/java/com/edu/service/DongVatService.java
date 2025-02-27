package com.edu.service;

import com.edu.model.DongVat;

public class DongVatService {

    public DongVat create(String ma, String ten, int canNang, String noiSong) {
        if (ma == null || ma.isEmpty()) {
            return null;
        }

        if (ten == null || ten.isEmpty()) {
            return null;
        }

        if (canNang <= 0) {
            return null;
        }

        if (noiSong == null || noiSong.isEmpty()) {
            return null;
        }

        return new DongVat(ma, ten, canNang, noiSong);
    }

}
