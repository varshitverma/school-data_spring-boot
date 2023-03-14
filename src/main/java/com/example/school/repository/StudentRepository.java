// Write your code here
package com.example.school.repository;

import com.example.school.model.Student;

import java.util.*;

public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student addStudent(Student student);

    String addStudents(ArrayList<Student> students);

    Student getStudentById(int studentId);

    Student updateStudent(int studentId, Student student);
    
    void deleteStudent(int studentId);
}