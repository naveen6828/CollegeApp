package com.naveen.CollegeApp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    private int studentId;
    private String name;
    private String department;
    private String marks;
    private String className;
    private AddressRequest address;
}