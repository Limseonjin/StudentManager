package com.example.studentmanager.student.Repository;

import com.example.studentmanager.student.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    //학생 전체 조회
    List<Student> findAll();

    //학생 정보 추가
    boolean insert(Student stu);

    //학생 정보 수정
    boolean update(Student stu);

    //학생 정보 삭제
    boolean delete(long stuNum);

    //학생 개별 조회
    Student findOne(long num);

}
