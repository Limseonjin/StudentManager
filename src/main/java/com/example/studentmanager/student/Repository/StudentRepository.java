package com.example.studentmanager.student.Repository;

import com.example.studentmanager.student.entity.Student;

import java.util.List;

public interface StudentRepository {
    // 1. 조회 GET
    // 2. 추가 POST
    // 3. 수정 POST
    // 4. 삭제 GET
    // 5. 상세조회 (성적조회) GET

    List<Student> findAll();
    boolean insert(Student stu);
    boolean update(Student stu);
    boolean delete(int stuNum);

}
