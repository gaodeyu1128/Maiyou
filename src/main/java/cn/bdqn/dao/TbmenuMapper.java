package cn.bdqn.dao;

import cn.bdqn.entity.Menu;

import java.util.List;

public interface TbmenuMapper {
    List<Menu> listAllParentMenu();
    List<Menu> listSubMenuByParentId(Integer parentId);
    Menu getMenuById(Integer menuId);
    void insertMenu(Menu menu);
    void updateMenu(Menu menu);
    void deleteMenuById(Integer menuId);
    List<Menu> listAllSubMenu();
}
