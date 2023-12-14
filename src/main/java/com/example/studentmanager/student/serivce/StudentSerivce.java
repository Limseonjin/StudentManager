package com.example.studentmanager.student.serivce;

import com.example.studentmanager.student.Repository.StudentMapper;
import com.example.studentmanager.student.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentSerivce {
    private final StudentMapper studentRepository;

    public List<Student> studentList(){
        return studentRepository.findAll();
    }
    public boolean studentInsert(Student stu){
        return studentRepository.insert(stu);
    }
    public boolean studentDelete(int num){
        return studentRepository.delete(num);
    }
}
