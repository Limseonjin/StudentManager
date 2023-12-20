package com.example.studentmanager.student.controller;

import com.example.studentmanager.student.dto.StudentListDTO;
import com.example.studentmanager.student.entity.Student;
import com.example.studentmanager.student.serivce.StudentSerivce;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
@Slf4j
public class StudentController {
    private final StudentSerivce studentSerivce;
    // 1. 조회 GET
    // 2. 추가 POST
    // 3. 수정 POST
    // 4. 삭제 GET
    // 5. 상세조회 (성적조회) GET

    @GetMapping("/list")
    public String list(Model model){
        log.info(" list GET! ");
        List<StudentListDTO> all = studentSerivce.studentList();
        model.addAttribute("sList",all);
        return "mainView/list";
    }
    @PostMapping("/insert")
    public String add(){
        System.out.println(" insert POST! ");
        return "mainView/list";
    }
    @GetMapping("/delete")
    public String delete(){
        System.out.println(" delete GET! ");
        return "mainView/list";
    }

}
