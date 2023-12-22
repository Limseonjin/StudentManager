package com.example.studentmanager.student.serivce;

import com.example.studentmanager.student.Repository.StudentMapper;
import com.example.studentmanager.student.dto.StudentListResponseDTO;
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
    public List<StudentListResponseDTO> studentList(){

        return studentRepository.findAll()
                .stream()
                .map(StudentListResponseDTO::new)
                .collect(Collectors.toList());
    }
}
