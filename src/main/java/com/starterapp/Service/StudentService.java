package com.starterapp.Service;

import com.starterapp.Dao.StudentDao;
import com.starterapp.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    @Qualifier("mysql")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){

        return this.studentDao.getAllStudents();
    }
    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public Collection<Student> deleteStudentById(int id) {

        this.studentDao.deleteStudentById(id);
        return this.studentDao.getAllStudents();
    }

    public Collection<Student> updateStudent(Student student){

        this.studentDao.updateStudent(student);
        return this.studentDao.getAllStudents();
    }

    public Collection<Student> insertStudent(Student student) {

        this.studentDao.insertStudent(student);
        return this.studentDao.getAllStudents();
    }
}
