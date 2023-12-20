package com.example.studentmanager.student.serivce;

import com.example.studentmanager.student.Repository.StudentMapper;
import com.example.studentmanager.student.dto.StudentListDTO;
import com.example.studentmanager.student.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentSerivce {
    private final StudentMapper studentRepository;

    //전체 조회
    public List<StudentListDTO> studentList(){

        return studentRepository.findAll()
                .stream()
                .map(StudentListDTO::new)
                .collect(Collectors.toList());
    }
   //개별 조회
    public Student findStu(long num){
        return studentRepository.findOne(num);
    }
    public boolean studentInsert(Student stu){
        return studentRepository.insert(stu);
    }
    public boolean studentDelete(int num){
        return studentRepository.delete(num);
    }
}
