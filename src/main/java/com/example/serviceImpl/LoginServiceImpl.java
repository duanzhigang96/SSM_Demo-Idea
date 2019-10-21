package com.example.serviceImpl;

import com.example.mapper.EnterpriseMapper;
import com.example.mapper.UserMapper;
import com.example.pojo.Enterprise;
import com.example.pojo.User;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    @Override
    public User login(String username,String password) {
        User user = userMapper.loginUser(username,password);
        return user;
    }

    @Override
    public List<Enterprise> findEnterprise(String enterpriseId) {
        System.out.println(enterpriseId+"**********************");
        List<Enterprise> list = enterpriseMapper.findEnterprise(enterpriseId);

       return list;
    }

}
