package com.example.studentmanager.student.serivce;

import com.example.studentmanager.student.Repository.StudentMapper;
import com.example.studentmanager.student.dto.StudentDetailRequestDTO;
import com.example.studentmanager.student.dto.StudentDetailResponseDTO;
import com.example.studentmanager.student.dto.StudentListResponseDTO;
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
    public List<StudentListResponseDTO> getList(){
        List<StudentListResponseDTO> studentList = studentMapper.findAll()
                .stream()
                .map(StudentListResponseDTO::new)
                .collect(Collectors.toList());

        return studentList;

    }

    //개별 조회
    public Student getStu(long num){
        Student student1 = studentMapper.findOne(num);
        return student1;
    }
    // 삭제 요청
    public List<StudentListResponseDTO> delete(long num){
        studentMapper.delete(num);
        return getList();

    }

    //수정 요청
    public StudentDetailResponseDTO update(StudentDetailRequestDTO dto){
        studentMapper.update(dto.toEntity());
        return StudentDetailResponseDTO.builder()
                .stuList(studentMapper.findAll())
                .stu(dto.toEntity())
                .build();
    }
}
