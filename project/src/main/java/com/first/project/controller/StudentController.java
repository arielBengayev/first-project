package com.first.project.controller;

import com.first.project.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {
//    @Autowired
//    StudentService studentService;
//
//    @RequestMapping(value = "/all", method = RequestMethod.GET)
//    public ResponseEntity<?> getAllStudents() {
//        return new ResponseEntity<>(studentService.all(), HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
//    public ResponseEntity<?> getOneStudent(@PathVariable Long id) {
//        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/insert", method = RequestMethod.POST)
//    public ResponseEntity<?> insertStudent(@RequestBody StudentIn studentIn) {
//        Student student = studentIn.toStudent(studentIn);
//        student = studentService.save(student);
//        return new ResponseEntity<>(student, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<?> updateStudent(@PathVariable Long id, @RequestBody StudentIn student) {
//        Optional<Student> dbStudent = studentService.findById(id);
//        student.updateStudent(dbStudent.get());
//        Student updatedStudent = studentService.save(dbStudent.get());
//        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
//        Optional<Student> dbStudent = studentService.findById(id);
//        studentService.delete(dbStudent.get());
//        return new ResponseEntity<>("DELETED", HttpStatus.OK);
//    }
}
