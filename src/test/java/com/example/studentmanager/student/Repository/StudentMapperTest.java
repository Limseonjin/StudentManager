package com.example.studentmanager.student.Repository;

import com.example.studentmanager.student.entity.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Rollback @Transactional
class StudentMapperTest {
    @Autowired
    StudentMapper studentMapper;
    @Test
    @DisplayName("전체조회를 하면 사이즈가 3이다.")
    void selectAll() {
        //given

        //when
        List<Student> studentList = studentMapper.findAll();

        //then
        assertEquals(3,studentList.size());
    }

    @Test
    @DisplayName("학번이 3인 학생을 조회하면 이름이 선딩이여야한다")
    void selectOne() {
        //given
        int num = 3;
        //when
        Student one = studentMapper.findOne(num);
        //then
        assertEquals("선딩",one.getName());
    }
    @Test
    @DisplayName("insert하면 전체사이즈가 4가 되어야 한다.")
    void insertTest() {
        //given
        Student student = new Student(4, "하이", 25, "여", "0102305235", "서울");
        //when
        boolean insert = studentMapper.insert(student);
        List<Student> studentList = studentMapper.findAll();

        //then
        assertTrue(insert);
        assertEquals(4,studentList.size());
    }

    @Test
    @DisplayName("학번이 1인 학생을 지우면 전체길이는 2가 된다.")
    void deleteTest() {
        //given
        int num = 1;
        //when
        boolean delete = studentMapper.delete(num);
        List<Student> studentList = studentMapper.findAll();

        //then
        assertEquals(2,studentList.size());
        assertTrue(delete);
    }
}