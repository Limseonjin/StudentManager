package com.example.studentmanager.api;

import com.example.studentmanager.student.entity.Student;
import com.example.studentmanager.student.serivce.StudentApiSerivce;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("api/v1/stuDetail")
public class StudentApiController {
    private final StudentApiSerivce studentApiSerivce;

    //특정 학생 조회 요청
    //URL : api/v1/stuDetail/{num}

    @GetMapping("/{num}")
    public ResponseEntity<?> std(
            @PathVariable long num
    ){
        log.info("/api/v1/stuDetail/{} : GET!",num);
        Student stu = studentApiSerivce.getStu(num);
        return ResponseEntity.ok().body(stu);
    }
}
