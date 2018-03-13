package cn.bdqn.dao;

import cn.bdqn.entity.Info;
import cn.bdqn.entity.Page;

import java.util.List;

public interface TbinfoMapper {
    List<Info> listPageInfo(Page page);
}
