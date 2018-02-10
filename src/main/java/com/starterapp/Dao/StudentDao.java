package com.starterapp.Dao;

import com.starterapp.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    Collection<Student> deleteStudentById(int id);

    Collection<Student> updateStudent(Student student);

    Collection<Student> insertStudent(Student student);
}
