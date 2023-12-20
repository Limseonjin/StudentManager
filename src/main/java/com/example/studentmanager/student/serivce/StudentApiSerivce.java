package com.example.studentmanager.student.serivce;

import com.example.studentmanager.student.Repository.StudentMapper;
import com.example.studentmanager.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentApiSerivce {
    @Autowired
    StudentMapper studentMapper;

    public Student getStu(long num){
        Student student1 = studentMapper.findOne(num);
        return student1;
    }
}
