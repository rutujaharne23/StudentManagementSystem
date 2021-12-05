package com.studentmanagementsystem.studentmanagementsystem.service;

import com.studentmanagementsystem.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(long id);

    Student updateStudent(Student student);

    void deleteStudentById(long id);
}
