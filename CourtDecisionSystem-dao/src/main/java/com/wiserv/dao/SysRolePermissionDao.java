package com.wiserv.dao;
import com.wiserv.bean.po.SysRolePermission;
import java.util.List;
import com.wiserv.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface SysRolePermissionDao{
	/**
	 * 获得SysRolePermission数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSysRolePermissionRowCount(Assist assist);
	/**
	 * 获得SysRolePermission数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SysRolePermission> selectSysRolePermission(Assist assist);
	/**
	 * 获得一个SysRolePermission对象,以参数SysRolePermission对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysRolePermission selectSysRolePermissionByObj(SysRolePermission obj);
	/**
	 * 通过SysRolePermission的id获得SysRolePermission对象
	 * @param id
	 * @return
	 */
    SysRolePermission selectSysRolePermissionById(Integer id);
	/**
	 * 插入SysRolePermission到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysRolePermission(SysRolePermission value);
	/**
	 * 插入SysRolePermission中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysRolePermission(SysRolePermission value);
	/**
	 * 通过SysRolePermission的id删除SysRolePermission
	 * @param id
	 * @return
	 */
    int deleteSysRolePermissionById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除SysRolePermission
	 * @param assist
	 * @return
	 */
    int deleteSysRolePermission(Assist assist);
	/**
	 * 通过SysRolePermission的id更新SysRolePermission中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysRolePermissionById(SysRolePermission enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysRolePermission中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSysRolePermission(@Param("enti") SysRolePermission value, @Param("assist") Assist assist);
	/**
	 * 通过SysRolePermission的id更新SysRolePermission中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysRolePermissionById(SysRolePermission enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysRolePermission中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySysRolePermission(@Param("enti") SysRolePermission value, @Param("assist") Assist assist);
}