package com.jobportal.JobPortalsProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jobportal.JobPortalsProject.model.Student;
import com.jobportal.JobPortalsProject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student checkStudentLogin(String email, String pwd) {
        return studentRepository.checkStudentLogin(email, pwd);
    }
}