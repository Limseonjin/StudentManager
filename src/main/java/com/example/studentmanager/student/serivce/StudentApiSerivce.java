package com.example.studentmanager.student.serivce;

import com.example.studentmanager.student.Repository.StudentMapper;
import com.example.studentmanager.student.dto.StudentListDTO;
import com.example.studentmanager.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentApiSerivce {
    @Autowired
    StudentMapper studentMapper;

    //전체 조회
    public List<StudentListDTO> getList(){
        List<StudentListDTO> studentList = studentMapper.findAll()
                .stream()
                .map(StudentListDTO::new)
                .collect(Collectors.toList());

        return studentList;

    }

    //개별 조회
    public Student getStu(long num){
        Student student1 = studentMapper.findOne(num);
        return student1;
    }
    // 삭제 요청
    public List<Student> delete(long num){
        studentMapper.delete(num);
        return studentMapper.findAll();
    }

    //수정 요청
    public List<Student> update(long num){
        studentMapper.update(studentMapper.findOne(num));
        return studentMapper.findAll();
    }
}
