package com.deere.scs.demo;

import com.deere.scs.demo.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/healthz")
    public String healthz() {
        log.info("DemoApplication:start");
        return String.format("i am healthy");

    }
    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        log.info("DemoApplication:start");
        return student;
    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents() {
        log.info("DemoApplication:start");
        return new ResponseEntity<List<Student>>(Arrays.asList(new Student(111,"venkat"),new Student(112,"reddy")), HttpStatus.OK);

    }

}
