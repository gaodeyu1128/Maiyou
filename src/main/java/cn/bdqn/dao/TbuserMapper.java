package cn.bdqn.dao;

import cn.bdqn.entity.User;

import java.util.List;

public interface TbuserMapper {
    List<User> listAllUser();//查询所有

    User getUserById(Integer userId);//单条查询

    void insertUser(User user);//新增

    void updateUser(User user);//修改

    User getUserInfo(User user);

    void updateUserBaseInfo(User user);//动态修改

    void updateUserRights(User user);//修改

    int getCountByName(String loginname);//根据用户名查询

    void deleteUser(int userId);//删除

    int getCount(User user);

    List<User> listPageUser(User user);

    User getUserAndRoleById(Integer userId);//id查询

    void updateLastLogin(User user);//修改
}
