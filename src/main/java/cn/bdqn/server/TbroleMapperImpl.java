package cn.bdqn.server;

import cn.bdqn.entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbroleMapperImpl implements TbroleMapper {
    @Resource
    private TbroleMapper tbroleMapper;
    public Role getRoleById(int roleId) {
        return tbroleMapper.getRoleById(roleId);
    }
}
