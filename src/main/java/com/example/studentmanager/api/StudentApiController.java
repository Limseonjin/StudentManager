package com.example.studentmanager.api;

import com.example.studentmanager.student.dto.StudentListDTO;
import com.example.studentmanager.student.entity.Student;
import com.example.studentmanager.student.serivce.StudentApiSerivce;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("api/v1/stuDetail")
public class StudentApiController {
    private final StudentApiSerivce studentApiSerivce;

    //특정 학생 조회 요청
    //URL : api/v1/stuDetail/{num}

    @GetMapping("/{num}")
    @ResponseBody
    public ResponseEntity<?> std(
            @PathVariable long num
    ){
        log.info("/api/v1/stuDetail/{} : GET!",num);
        Student stu = studentApiSerivce.getStu(num);
        log.debug("stu : {}",stu);
        return ResponseEntity.ok().body(stu);
    }

    //특정 학생 삭제 요청
    @DeleteMapping("/{num}")
    public ResponseEntity<?> del(
            @PathVariable long num){
        log.info("/api/v1/stuDetail : DELETE!");
        List<Student> delStu = studentApiSerivce.delete(num);

        return ResponseEntity.ok().body(delStu);
    }
}
