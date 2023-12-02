package com.example.studentmanager.student.serivce;

import com.example.studentmanager.student.Repository.StudentRepository;
import com.example.studentmanager.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSerivce {
    StudentRepository studentRepository;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }
}
