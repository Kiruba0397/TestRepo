package com.stg.firstprj.controller;

import com.stg.firstprj.entity.Student;
import com.stg.firstprj.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:56158")  
public class StudentController {

    @Autowired
    StudentService service;
    
    
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        Student savedStudent = service.saveStudent(student);
        return savedStudent;
    }
    @PostMapping("/saveall")
    public Student saveStudent123(@RequestBody Student student){
        Student savedStudent = service.saveStudent(student);
        return savedStudent;
    }
    @PostMapping("/saveall")
    public Student saveStudent1234(@RequestBody Student student){
        Student savedStudent = service.saveStudent(student);
        return savedStudent;
    }

    @GetMapping("/get/{studentId}")
    public Student getById(@PathVariable Long studentId){
        Student savedStudent = service.getById(studentId);
        return savedStudent;
    }
  
    @GetMapping("/liststudent")
    public List<Student> getAllEmployees() {
    	List<Student> savedStudent = service.liststudent();
    	return savedStudent;
        
    }
    @DeleteMapping("/delete/{studentId}")
    public void deletestudent(@PathVariable Long studentId) {
    	service.delete(studentId);
    }
    @PutMapping("/update/{studentId}")
    public Student updatestudent(@RequestBody Student student,@PathVariable Long studentId){
    	Student savedStudent =service.update(student,studentId);
    	return savedStudent;
    
}
   
    	@GetMapping("/sample")
    	public String test() {
    		return "Welcome Kiruba wincy";
    	}
}
