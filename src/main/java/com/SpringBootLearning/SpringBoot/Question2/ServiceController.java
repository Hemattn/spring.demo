package com.SpringBootLearning.SpringBoot.Question2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @Autowired
    private Service service;
    @GetMapping("/service")
    public Service retriveAllCourses(){
        return service;
    }


}
