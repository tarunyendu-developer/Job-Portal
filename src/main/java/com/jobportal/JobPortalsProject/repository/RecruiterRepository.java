package com.jobportal.JobPortalsProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.jobportal.JobPortalsProject.model.Recruiter;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
    @Query("select r from Recruiter r where r.email=?1 and r.password=?2")
    Recruiter checkRecruiterLogin(String email, String pwd);
}