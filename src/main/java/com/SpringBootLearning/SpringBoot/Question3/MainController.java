package com.SpringBootLearning.SpringBoot.Question3;

import com.SpringBootLearning.SpringBoot.Main;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {
    @GetMapping("/main")
    public List<Main> retrieveAllData(){
        return Arrays.asList(
            new Main( 1, "Hema" , "JVM"),
            new Main( 1, "Kritka" , "QA"),
            new Main( 1, "Jai" , "MSP"),
            new Main( 1, "Pankaj" , "JVM"),
            new Main( 1, "Jia" , "JVM"),
            new Main( 1, "Priya" , "JVM"),
            new Main( 1, "Supriya" , "JVM"),
            new Main( 1, "Anupriya" , "JVM"),
            new Main( 1, "Sumpriya" , "JVM")
        );
    }
}
