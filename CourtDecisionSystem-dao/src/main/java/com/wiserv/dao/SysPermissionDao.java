package com.wiserv.dao;
import com.wiserv.bean.po.SysPermission;
import java.util.List;
import com.wiserv.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface SysPermissionDao{
	/**
	 * 获得SysPermission数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSysPermissionRowCount(Assist assist);
	/**
	 * 获得SysPermission数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SysPermission> selectSysPermission(Assist assist);
	/**
	 * 获得一个SysPermission对象,以参数SysPermission对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysPermission selectSysPermissionByObj(SysPermission obj);
	/**
	 * 通过SysPermission的id获得SysPermission对象
	 * @param id
	 * @return
	 */
    SysPermission selectSysPermissionById(Integer id);
	/**
	 * 插入SysPermission到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysPermission(SysPermission value);
	/**
	 * 插入SysPermission中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysPermission(SysPermission value);
	/**
	 * 通过SysPermission的id删除SysPermission
	 * @param id
	 * @return
	 */
    int deleteSysPermissionById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除SysPermission
	 * @param assist
	 * @return
	 */
    int deleteSysPermission(Assist assist);
	/**
	 * 通过SysPermission的id更新SysPermission中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysPermissionById(SysPermission enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysPermission中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSysPermission(@Param("enti") SysPermission value, @Param("assist") Assist assist);
	/**
	 * 通过SysPermission的id更新SysPermission中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysPermissionById(SysPermission enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysPermission中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySysPermission(@Param("enti") SysPermission value, @Param("assist") Assist assist);
}