package com.edu.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.edu.model.DongVat;

public class DongVatServiceTest {

    DongVatService dongVatService;

    @BeforeAll
    static void beforeClass() {

    }

    @BeforeEach
    void setUp() {
        this.dongVatService = new DongVatService();

    }

    @AfterEach
    void tearDown() {

    }

    @AfterAll
    static void afterClass() {

    }

    // Kiểm tra với các trường hợp lệ
    @Test
    void testAllValidField() {
        DongVat dongVat = dongVatService.create("dv1", "lu", 15, "nhà");
        assertNotNull(dongVat);
    }

    // Kiểm tra với trường hợp tất cả các trường là null
    @Test
    void testAllNullField() {
        DongVat dongVat = dongVatService.create(null, null, 0, null);
        assertNull(dongVat);
    }

    // Kiểm tra với trường hợp mã là null
    @Test
    void testMaIsNull() {
        DongVat dongVat = dongVatService.create(null, "lu", 15, "nhà");
        assertNull(dongVat);
    }

    // Kiểm tra với trường hợp tên là null
    @Test
    void testTenIsNull() {
        DongVat dongVat = dongVatService.create("dv1", null, 15, "nhà");
        assertNull(dongVat);
    }

    // Kiểm tra với trường hợp nơi sống là null
    @Test
    void testNoiSongIsNull() {
        DongVat dongVat = dongVatService.create("dv1", "lu", 15, null);
        assertNull(dongVat);
    }

    // Kiểm tra với trường hợp số cân nặng là số âm
    @Test
    void testCanNangIsNegative() {
        DongVat dongVat = dongVatService.create("dv1", "lu", -15, "nhà");
        assertNull(dongVat);
    }

    // Kiểm tra với trường hợp cân năng là số 0
    @Test
    void testCanNangIsZero() {
        DongVat dongVat = dongVatService.create("dv1", "lu", 0, "nhà");
        assertNull(dongVat);
    }

    // Kiêm tra với trường hợp mã là rỗng
    @Test
    void testMaIsEmpty() {
        DongVat dongVat = dongVatService.create("", "lu", 15, "nhà");
        assertNull(dongVat);
    }

    // Kiểm tra với trường hợp tên là rỗng
    @Test
    void testTenIsEmpty() {
        DongVat dongVat = dongVatService.create("dv1", "", 15, "nhà");
        assertNull(dongVat);
    }

    // Kiểm tra với trường hợp nơi sống là rỗng
    @Test
    void testNoiSongIsEmpty() {
        DongVat dongVat = dongVatService.create("dv1", "lu", 15, "");
        assertNull(dongVat);
    }

}
