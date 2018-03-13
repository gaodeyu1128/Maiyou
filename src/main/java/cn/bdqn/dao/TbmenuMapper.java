package cn.bdqn.dao;

import cn.bdqn.entity.Menu;

import java.util.List;

public interface TbmenuMapper {
    List<Menu> listAllParentMenu();//查询所有tb_menu
    List<Menu> listSubMenuByParentId(Integer parentId);//模糊
    Menu getMenuById(Integer menuId);//通过id查询
    void insertMenu(Menu menu);//新增
    void updateMenu(Menu menu);//修改
    void deleteMenuById(Integer menuId);//删除
    List<Menu> listAllSubMenu();//查询所有tb_menu和parent_id
}
