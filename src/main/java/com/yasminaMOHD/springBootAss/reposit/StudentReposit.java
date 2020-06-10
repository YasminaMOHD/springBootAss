/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yasminaMOHD.springBootAss.reposit;

import com.yasminaMOHD.springBootAss.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lenovo
 */
public interface StudentReposit extends JpaRepository<Student,String>{
    
}
