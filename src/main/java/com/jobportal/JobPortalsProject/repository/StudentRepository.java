package com.jobportal.JobPortalsProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.jobportal.JobPortalsProject.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select s from Student s where s.email=?1 and s.password=?2")
    Student checkStudentLogin(String email, String pwd);
}