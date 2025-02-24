package com.poly.student;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.poly.model.Student;
import com.poly.service.StudentService;

public class StudentTest {

    private+``````````````````````````` StudentService studentService;

    @BeforeAll
    public void setUp() {
        this.studentService = new StudentService();
    }

    // test addStudent
    @Test
    void addStudent() {
        studentService.addStudent(new Student("1", "A", 20));
        studentService.addStudent(new Student("2", "B", 21));
        studentService.addStudent(new Student("3", "C", 22));
        studentService.addStudent(new Student("4", "D", 23));
        studentService.addStudent(new Student("5", "E", 24));
    }
}
