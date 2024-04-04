package com.naveen.CollegeApp.dto;

import lombok.Data;

@Data
public class AddressRequest {
    private long addressId;
    private String line1;
    private String city;
    private String state;
    private String zipCode;
}
