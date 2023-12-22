package com.example.studentmanager.student.dto;

import com.example.studentmanager.student.entity.Student;
import lombok.*;

import java.util.List;
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDetailResponseDTO {

    private List<Student> stuList;
    private Student stu;
}
