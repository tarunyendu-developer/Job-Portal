package com.jobportal.JobPortalsProject.service;

import com.jobportal.JobPortalsProject.model.Admin;

public interface AdminService {
    Admin checkAdminLogin(String email, String pwd);
}