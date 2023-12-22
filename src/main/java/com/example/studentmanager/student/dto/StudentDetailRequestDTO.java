package com.example.studentmanager.student.dto;

import com.example.studentmanager.student.entity.Student;
import lombok.*;

import java.util.List;

@Getter@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDetailRequestDTO {
    private long num;
    private String name;
    private int age;
    private String gender;
    private String phoneNum;
    private String address;

    public Student toEntity(){
        return Student.builder()
                .num(num)
                .name(name)
                .age(age)
                .gender(gender)
                .phoneNum(phoneNum)
                .address(address)
                .build();
    }
}
