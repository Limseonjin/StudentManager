package com.example.studentmanager.api;

import com.example.studentmanager.student.dto.StudentDetailRequestDTO;
import com.example.studentmanager.student.dto.StudentDetailResponseDTO;
import com.example.studentmanager.student.dto.StudentListResponseDTO;
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

    //전체 학생 조회 요청
    @GetMapping
    public ResponseEntity<?> students(){
        List<StudentListResponseDTO> studentList = studentApiSerivce.getList();
        return ResponseEntity.ok().body(studentList);
    }

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
        List<StudentListResponseDTO> delStu = studentApiSerivce.delete(num);

        return ResponseEntity.ok().body(delStu);
    }

    //특정 학생 수정 요청
    @PutMapping
    public ResponseEntity<?> update(
            @RequestBody StudentDetailRequestDTO dto
            ){
        log.info("/api/v1/stuDetail : PUT!");
        StudentDetailResponseDTO updateStu = studentApiSerivce.update(dto);

        return ResponseEntity.ok().body(updateStu);
    }
}
