package com.ssm.service;

import com.ssm.domain.Role;
import com.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll() throws Exception;

    void save(UserInfo userInfo)throws Exception;

    UserInfo findById(String id) throws  Exception;

    List<Role> findUserByIdAndAllRole(UserInfo userInfo)throws  Exception;

    void addRoleToUser(int userId, int[] roleIds)throws  Exception;
}
