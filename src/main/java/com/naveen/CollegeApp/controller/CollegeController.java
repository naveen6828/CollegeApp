package com.naveen.CollegeApp.controller;

import com.naveen.CollegeApp.dto.StudentRequest;
import com.naveen.CollegeApp.dto.StudentResponse;
import com.naveen.CollegeApp.service.CollegeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/college")
@RequiredArgsConstructor
public class CollegeController {

    private final CollegeService collegeService;

    @GetMapping
    public List<StudentResponse> getAllStudent(){
        return collegeService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentResponse getStudent(@PathVariable int id){
        return collegeService.getStudent(id);
    }

    @GetMapping("/sorted")
    public Map<String, List<StudentResponse>> getAllStudentsSorted(){
        return collegeService.getAllStudentsSorted();
    }
    @PostMapping()
    public StudentResponse createStudent(@RequestBody StudentRequest studentRequest){
        return collegeService.createStudent(studentRequest);
    }
}
