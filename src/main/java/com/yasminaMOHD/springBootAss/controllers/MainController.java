/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yasminaMOHD.springBootAss.controllers;

import com.yasminaMOHD.springBootAss.models.Student;
import com.yasminaMOHD.springBootAss.reposit.CourseReposit;
import com.yasminaMOHD.springBootAss.reposit.RegistrationReposit;
import com.yasminaMOHD.springBootAss.reposit.StudentReposit;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lenovo
 */
@RestController
public class MainController {
    
    @Autowired
    StudentReposit studentReposit;
    
    @Autowired
    CourseReposit courseReposit;
    
     @Autowired
    RegistrationReposit registrationReposit;
    
    @RequestMapping("/")
    public String index(){
        return String.format("%s", "jpa using spring boot");
    }
    
    @RequestMapping("/showall")
    public String showAll(){
        List<Student> std=studentReposit.findAll();
        String s="";
        for(Student student :std)
            s+=student+"<br>";
        return String.format("%s", s);
    }
}
