//package com.starterapp.Dao;
//
//import com.starterapp.Entity.Student;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//@Repository
//@Qualifier("mongoDb")
//public class StudentDaoMongoDbImpl implements StudentDao {
//    @Override
//    public Collection<Student> getAllStudents() {
//        return new ArrayList<Student>(){
//            {
//                add(new Student(1,"psk","helloworld"));
//            }
//        };
//    }
//
//    @Override
//    public Student getStudentById(int id) {
//        return null;
//    }
//
//    @Override
//    public void deleteStudentById(int id) {
//
//    }
//
//    @Override
//    public void updateStudent(Student student) {
//
//    }
//
//    @Override
//    public void insertStudent(Student student) {
//
//    }
//}
