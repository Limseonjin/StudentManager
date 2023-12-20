package com.example.studentmanager.student.dto;

import com.example.studentmanager.student.entity.Student;
import lombok.*;
@Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentListDTO {
    private long num;
    private String name;
    private String gender;
    private int age;

    public StudentListDTO(Student stu) {
        this.num = stu.getNum();
        this.name = stu.getName();
        this.gender = stu.getGender();
        this.age = stu.getAge();
    }
}
