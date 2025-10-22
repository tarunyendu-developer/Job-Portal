package com.jobportal.JobPortalsProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jobportal.JobPortalsProject.model.Admin;
import com.jobportal.JobPortalsProject.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin checkAdminLogin(String email, String pwd) {
        return adminRepository.checkAdminLogin(email, pwd);
    }
}