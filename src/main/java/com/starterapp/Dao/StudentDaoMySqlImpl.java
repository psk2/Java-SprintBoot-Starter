package com.starterapp.Dao;

import com.starterapp.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Repository("mysql")
public class StudentDaoMySqlImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class StudentsRowMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setCourse(resultSet.getString("course"));
            student.setName(resultSet.getString("name"));

            return student;
        }
    }



    @Override
    public Collection<Student> getAllStudents() {
        final String sql = "Select * from students";

        List<Student> students = jdbcTemplate.query(sql, new StudentsRowMapper()) ;
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        final String sql = "Select * from students where id = ?";

        Student students = jdbcTemplate.queryForObject(sql, new StudentsRowMapper(),id);
        return students;
    }

    @Override
    public Collection<Student> deleteStudentById(int id) {
        final String sql = "Delete from students where id = ?";
        jdbcTemplate.update(sql,id);
        return this.getAllStudents();
    }

    @Override
    public Collection<Student> updateStudent(Student student) {
        final String sql = "update students set name= ?, course= ? where id=?";
        final int id = student.getId();
        final String name = student.getName();
        final String course = student.getCourse();
        jdbcTemplate.update(sql,new Object[] {name,course,id});
//        List<Student> students = jdbcTemplate.query(sql, new StudentsRowMapper()) ;
        return this.getAllStudents();
    }

    @Override
    public Collection<Student> insertStudent(Student student) {
        final String sql = " INSERT INTO students (id,name, course) VALUES (?,?,?)";
        final int id = student.getId();
        final String name = student.getName();
        final String course = student.getCourse();
        jdbcTemplate.update(sql,new Object[] {id,name,course});
        return this.getAllStudents();
    }
}
