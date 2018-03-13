package cn.bdqn.dao;

import cn.bdqn.entity.Role;

import java.util.List;

public interface TbroleMapper {
    List<Role> listAllRoles();
    Role getRoleById(int roleId);
    void insertRole(Role role);
    void updateRoleBaseInfo(Role role);
    void deleteRoleById(int roleId);
    int getCountByName(Role role);
    void updateRoleRights(Role role);
}
