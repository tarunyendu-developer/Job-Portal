package com.jobportal.JobPortalsProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jobportal.JobPortalsProject.model.Recruiter;
import com.jobportal.JobPortalsProject.repository.RecruiterRepository;

@Service
public class RecruiterServiceImpl implements RecruiterService {
    @Autowired
    private RecruiterRepository recruiterRepository;

    @Override
    public Recruiter checkRecruiterLogin(String email, String pwd) {
        return recruiterRepository.checkRecruiterLogin(email, pwd);
    }
}