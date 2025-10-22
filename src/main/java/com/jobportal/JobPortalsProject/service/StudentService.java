package com.jobportal.JobPortalsProject.service;

import com.jobportal.JobPortalsProject.model.Student;

public interface StudentService {
    Student checkStudentLogin(String email, String pwd);
}