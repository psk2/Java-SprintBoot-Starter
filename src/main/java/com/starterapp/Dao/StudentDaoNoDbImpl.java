//package com.starterapp.Dao;
//
//import com.starterapp.Entity.Student;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//@Repository
//@Qualifier("nodb")
//public class StudentDaoNoDbImpl implements StudentDao {
//    private static Map<Integer,Student> students;
//    static {
//        students = new HashMap<Integer, Student>(){
//            {
//                put(1, new Student(1, "Saikrishna", "computer science"));
//                put(2, new Student(2, "PSK", "Electronics"));
//                put(3, new Student(3, "someone else", "Civil"));
//            }
//        };
//    }
//
//    @Override
//    public Collection<Student> getAllStudents(){
//        return this.students.values();
//    }
//
//    @Override
//    public Student getStudentById(int id){
//        return this.students.get(id);
//    }
//
//    @Override
//    public void deleteStudentById(int id) {
//        this.students.remove(id);
//    }
//
//    @Override
//    public void updateStudent(Student student){
//        Student s = students.get(student.getId());
//        s.setCourse(student.getCourse());
//        s.setName(student.getName());
//        students.put(student.getId(),student);
//    }
//
//    @Override
//    public void insertStudent(Student student) {
//        this.students.put(student.getId(),student);
//    }
//}
