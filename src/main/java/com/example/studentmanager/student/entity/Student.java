package com.example.studentmanager.student.entity;

import lombok.*;

@Setter @Getter
@ToString @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int num;
    private String name;
    private int age;
    private Gender gender;
    private String phoneNum;
    private String address;
}
