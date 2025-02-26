package com.edu.service;

import com.edu.model.DongVat;

public class DongVatService {

    public DongVat create() {
        return new DongVat();
    }

    public DongVat create(String ma, String ten, int canNang, String noiSong) {
        return new DongVat(ma, ten, canNang, noiSong);
    }

}
