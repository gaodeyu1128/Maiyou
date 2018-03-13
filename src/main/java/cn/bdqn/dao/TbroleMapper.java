package cn.bdqn.dao;

import cn.bdqn.entity.Role;

import java.util.List;

public interface TbroleMapper {
    List<Role> listAllRoles();//查询所有
    Role getRoleById(int roleId);//权限
    void insertRole(Role role);//新增
    void updateRoleBaseInfo(Role role);//修改
    void deleteRoleById(int roleId);//删除
    int getCountByName(Role role);
    void updateRoleRights(Role role);//修改rights
}
