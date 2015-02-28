package com.reigncode.first.web;

import com.reigncode.first.model.Student;
import com.reigncode.first.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by johndoe on 28.02.2015.
 */
@Controller
public class StudentController {
    @Autowired //injectam obiectul de tip StudentRepository
    private StudentRepository studentRepository;
    /**
     *
     * @param student object to be saved in the repository
     * @return status of the operation
     */
    @RequestMapping(value = "/students/register", method = RequestMethod.POST)
    public ResponseEntity<Void> saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/students")
    public ResponseEntity<Page <Student>> finAll(Pageable pageable){
        Page<Student> students = studentRepository.findAll(pageable);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }


}
