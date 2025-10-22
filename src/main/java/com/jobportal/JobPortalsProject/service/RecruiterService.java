package com.jobportal.JobPortalsProject.service;

import com.jobportal.JobPortalsProject.model.Recruiter;

public interface RecruiterService {
    Recruiter checkRecruiterLogin(String email, String pwd);
}