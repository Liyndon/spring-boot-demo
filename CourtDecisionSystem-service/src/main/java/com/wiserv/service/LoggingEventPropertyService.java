package com.wiserv.service;
import java.util.List;
import com.wiserv.bean.po.LoggingEventProperty;
import com.wiserv.common.Assist;
public interface LoggingEventPropertyService{
	/**
	 * 获得LoggingEventProperty数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getLoggingEventPropertyRowCount(Assist assist);
	/**
	 * 获得LoggingEventProperty数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<LoggingEventProperty> selectLoggingEventProperty(Assist assist);
	/**
	 * 获得一个LoggingEventProperty对象,以参数LoggingEventProperty对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    LoggingEventProperty selectLoggingEventPropertyByObj(LoggingEventProperty obj);
	/**
	 * 通过LoggingEventProperty的id获得LoggingEventProperty对象
	 * @param id
	 * @return
	 */
    LoggingEventProperty selectLoggingEventPropertyById(Long id);
	/**
	 * 插入LoggingEventProperty到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLoggingEventProperty(LoggingEventProperty value);
	/**
	 * 插入LoggingEventProperty中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyLoggingEventProperty(LoggingEventProperty value);
	/**
	 * 通过LoggingEventProperty的id删除LoggingEventProperty
	 * @param id
	 * @return
	 */
    int deleteLoggingEventPropertyById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除LoggingEventProperty
	 * @param assist
	 * @return
	 */
    int deleteLoggingEventProperty(Assist assist);
	/**
	 * 通过LoggingEventProperty的id更新LoggingEventProperty中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateLoggingEventPropertyById(LoggingEventProperty enti);
 	/**
	 * 通过辅助工具Assist的条件更新LoggingEventProperty中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateLoggingEventProperty(LoggingEventProperty value, Assist assist);
	/**
	 * 通过LoggingEventProperty的id更新LoggingEventProperty中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyLoggingEventPropertyById(LoggingEventProperty enti);
 	/**
	 * 通过辅助工具Assist的条件更新LoggingEventProperty中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyLoggingEventProperty(LoggingEventProperty value, Assist assist);
}