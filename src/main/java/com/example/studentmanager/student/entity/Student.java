package com.example.studentmanager.student.entity;

import lombok.*;

@Setter @Getter
@ToString @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private long num;
    private String name;
    private int age;
    private String gender;
    private String phoneNum;
    private String address;
}
