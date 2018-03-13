package cn.bdqn.controller;

import cn.bdqn.server.TbroleServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="")
public class TbroleController {
    @Resource
    private TbroleServer tbroleMapper;
    @RequestMapping(value = "/")
    public String auth(){
        return "";
    }
}
