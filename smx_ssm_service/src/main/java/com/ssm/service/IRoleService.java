package com.ssm.service;

import com.ssm.domain.Permission;
import com.ssm.domain.Role;

import java.util.List;

public interface IRoleService {

    List<Role> findAll() throws Exception;

    void save(Role role);

    Role findById(int roleId) throws Exception;

    List<Permission> findOtherPermissions(int roleId) throws Exception;

    void addPermissionToRole(int[] permissionId, int roleId)throws Exception;
}
