package com.nibm.lms.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import com.nibm.lms.model.Student;

@ResController
public class StudentController {

    @PostMapping (value ="/login",consumes= MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE )
    void StudentLogin(Student Student){

    }
    
}
