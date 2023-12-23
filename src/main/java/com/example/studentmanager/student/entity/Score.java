package com.example.studentmanager.student.entity;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    private int num;
    private float kor;
    private float eng;
    private float math;
    private float total;
}
