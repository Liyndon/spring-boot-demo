package com.wiserv.service;
import java.util.List;
import com.wiserv.bean.po.LoggingEvent;
import com.wiserv.common.Assist;
public interface LoggingEventService{
	/**
	 * 获得LoggingEvent数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getLoggingEventRowCount(Assist assist);
	/**
	 * 获得LoggingEvent数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<LoggingEvent> selectLoggingEvent(Assist assist);
	/**
	 * 获得一个LoggingEvent对象,以参数LoggingEvent对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    LoggingEvent selectLoggingEventByObj(LoggingEvent obj);
	/**
	 * 通过LoggingEvent的id获得LoggingEvent对象
	 * @param id
	 * @return
	 */
    LoggingEvent selectLoggingEventById(Long id);
	/**
	 * 插入LoggingEvent到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLoggingEvent(LoggingEvent value);
	/**
	 * 插入LoggingEvent中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyLoggingEvent(LoggingEvent value);
	/**
	 * 通过LoggingEvent的id删除LoggingEvent
	 * @param id
	 * @return
	 */
    int deleteLoggingEventById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除LoggingEvent
	 * @param assist
	 * @return
	 */
    int deleteLoggingEvent(Assist assist);
	/**
	 * 通过LoggingEvent的id更新LoggingEvent中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateLoggingEventById(LoggingEvent enti);
 	/**
	 * 通过辅助工具Assist的条件更新LoggingEvent中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateLoggingEvent(LoggingEvent value, Assist assist);
	/**
	 * 通过LoggingEvent的id更新LoggingEvent中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyLoggingEventById(LoggingEvent enti);
 	/**
	 * 通过辅助工具Assist的条件更新LoggingEvent中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyLoggingEvent(LoggingEvent value, Assist assist);
}