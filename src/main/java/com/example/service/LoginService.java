package com.example.service;

import com.example.pojo.Enterprise;
import com.example.pojo.User;

import java.util.List;

public interface LoginService {
    //login
    User login(String username,String password);
    List <Enterprise> findEnterprise (String enterpriseId);
}
