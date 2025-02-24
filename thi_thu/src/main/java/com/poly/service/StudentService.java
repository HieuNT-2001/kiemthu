package com.poly.service;

import java.util.ArrayList;
import java.util.List;

import com.poly.model.Student;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean updateStudent(String id, String newName, int newAge) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.set(students.indexOf(student), new Student(id, newName, newAge));
                return true;
            }
        }
        return false;
    }

    public boolean deleteStudent(String id) {
        return students.removeIf(student -> student.getId().equals(id));
    }

}
