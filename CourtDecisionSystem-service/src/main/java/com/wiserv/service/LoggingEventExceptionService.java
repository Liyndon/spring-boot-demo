package com.wiserv.service;
import java.util.List;
import com.wiserv.bean.po.LoggingEventException;
import com.wiserv.common.Assist;
public interface LoggingEventExceptionService{
	/**
	 * 获得LoggingEventException数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getLoggingEventExceptionRowCount(Assist assist);
	/**
	 * 获得LoggingEventException数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<LoggingEventException> selectLoggingEventException(Assist assist);
	/**
	 * 获得一个LoggingEventException对象,以参数LoggingEventException对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    LoggingEventException selectLoggingEventExceptionByObj(LoggingEventException obj);
	/**
	 * 通过LoggingEventException的id获得LoggingEventException对象
	 * @param id
	 * @return
	 */
    LoggingEventException selectLoggingEventExceptionById(Long id);
	/**
	 * 插入LoggingEventException到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLoggingEventException(LoggingEventException value);
	/**
	 * 插入LoggingEventException中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyLoggingEventException(LoggingEventException value);
	/**
	 * 通过LoggingEventException的id删除LoggingEventException
	 * @param id
	 * @return
	 */
    int deleteLoggingEventExceptionById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除LoggingEventException
	 * @param assist
	 * @return
	 */
    int deleteLoggingEventException(Assist assist);
	/**
	 * 通过LoggingEventException的id更新LoggingEventException中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateLoggingEventExceptionById(LoggingEventException enti);
 	/**
	 * 通过辅助工具Assist的条件更新LoggingEventException中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateLoggingEventException(LoggingEventException value, Assist assist);
	/**
	 * 通过LoggingEventException的id更新LoggingEventException中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyLoggingEventExceptionById(LoggingEventException enti);
 	/**
	 * 通过辅助工具Assist的条件更新LoggingEventException中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyLoggingEventException(LoggingEventException value, Assist assist);
}