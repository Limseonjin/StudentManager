package com.example.studentmanager.student.Repository;

import com.example.studentmanager.student.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> findAll();
    boolean insert(Student stu);
    boolean update(Student stu);
    boolean delete(int stuNum);

    Student findOne(long num);

}
