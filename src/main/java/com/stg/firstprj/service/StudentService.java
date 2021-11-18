//package com.stg.firstprj.service;
//
//import com.stg.firstprj.entity.Student;
//import com.stg.firstprj.repository.StudentRepository;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    StudentRepository repo;
//
//    public  Student saveStudent(Student student) {
//        return repo.save(student);
//    }
//
//    public Student getById(Long studentId) {
//
//        return repo.findById(studentId).get();
//    }
//
//	public List<Student> liststudent() {
//		return repo.findAll();
//
//	}
//	public void delete(Long studentId) {
//		repo.deleteById(studentId);
//
//
//    }
//
//
//	public Student update(Student studs,Long studentId) {
//		Student student = repo.findById(studentId).get();
//		student.setStudentName(studs.getStudentName());
//		student.setStudentDepartment(studs.getStudentDepartment());
//		return repo.save(student);
//	}
//}
