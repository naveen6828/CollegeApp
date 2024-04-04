package com.naveen.CollegeApp.service;

import com.naveen.CollegeApp.dto.StudentRequest;
import com.naveen.CollegeApp.dto.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CollegeService {

    private final WebClient.Builder webClientBuilder;
    public StudentResponse getStudent(int id){
        StudentResponse studentResponse =  webClientBuilder.build()
                .get()
                .uri("http://localhost:8080/student/"+id)
                .retrieve()
                .bodyToMono(StudentResponse.class)
                .block();
        return studentResponse;
    }

    public List<StudentResponse> getAllStudents(){
        List<StudentResponse> studentResponses = webClientBuilder.build()
                .get()
                .uri("http://localhost:8080/student")
                .retrieve()
                .bodyToMono(List.class)
                .block();
        return studentResponses;
    }


    public Map<String, List<StudentResponse>> getAllStudentsSorted(){
        Map<String, List<StudentResponse>> studentResponse = webClientBuilder.build()
                .get()
                .uri("http://localhost:8080/student/sorted")
                .retrieve()
                .bodyToMono(Map.class)
                .block();
        return studentResponse;
    }

    public StudentResponse createStudent(StudentRequest studentRequest){
        StudentResponse studentResponse =  webClientBuilder.build()
                .post()
                .uri("http://localhost:8080/student")
                .bodyValue(studentRequest)
                .retrieve()
                .bodyToMono(StudentResponse.class)
                .block();
        return studentResponse;
    }

}
