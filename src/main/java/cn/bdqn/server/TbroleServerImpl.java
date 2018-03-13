package cn.bdqn.server;

import cn.bdqn.dao.TbroleMapper;
import cn.bdqn.entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbroleServerImpl implements TbroleServer {
    @Resource
    private TbroleMapper tbroleMapper;
    public Role getRoleById(int roleId) {
        return tbroleMapper.getRoleById(roleId);
    }
}
