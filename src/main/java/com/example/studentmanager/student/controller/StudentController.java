package com.example.studentmanager.student.controller;

import com.example.studentmanager.student.entity.Student;
import com.example.studentmanager.student.serivce.StudentSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentSerivce studentSerivce;
    // 1. 조회 GET
    // 2. 추가 POST
    // 3. 수정 POST
    // 4. 삭제 GET
    // 5. 상세조회 (성적조회) GET

    @GetMapping("/list")
    public String list(){
        System.out.println(" list GET! ");
        List<Student> all = studentSerivce.findAll();
        System.out.println("all = " + all);
        return "";
    }

}
