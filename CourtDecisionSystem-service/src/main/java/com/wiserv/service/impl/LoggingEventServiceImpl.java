package com.wiserv.service.impl;
import java.util.List;
import com.wiserv.dao.LoggingEventDao;
import com.wiserv.bean.po.LoggingEvent;
import com.wiserv.common.Assist;
import com.wiserv.service.LoggingEventService;
public class LoggingEventServiceImpl implements LoggingEventService{
    private LoggingEventDao loggingEventDao;
    @Override
    public long getLoggingEventRowCount(Assist assist){
        return loggingEventDao.getLoggingEventRowCount(assist);
    }
    @Override
    public List<LoggingEvent> selectLoggingEvent(Assist assist){
        return loggingEventDao.selectLoggingEvent(assist);
    }
    @Override
    public LoggingEvent selectLoggingEventByObj(LoggingEvent obj){
        return loggingEventDao.selectLoggingEventByObj(obj);
    }
    @Override
    public LoggingEvent selectLoggingEventById(Long id){
        return loggingEventDao.selectLoggingEventById(id);
    }
    @Override
    public int insertLoggingEvent(LoggingEvent value){
        return loggingEventDao.insertLoggingEvent(value);
    }
    @Override
    public int insertNonEmptyLoggingEvent(LoggingEvent value){
        return loggingEventDao.insertNonEmptyLoggingEvent(value);
    }
    @Override
    public int deleteLoggingEventById(Long id){
        return loggingEventDao.deleteLoggingEventById(id);
    }
    @Override
    public int deleteLoggingEvent(Assist assist){
        return loggingEventDao.deleteLoggingEvent(assist);
    }
    @Override
    public int updateLoggingEventById(LoggingEvent enti){
        return loggingEventDao.updateLoggingEventById(enti);
    }
    @Override
    public int updateLoggingEvent(LoggingEvent value, Assist assist){
        return loggingEventDao.updateLoggingEvent(value,assist);
    }
    @Override
    public int updateNonEmptyLoggingEventById(LoggingEvent enti){
        return loggingEventDao.updateNonEmptyLoggingEventById(enti);
    }
    @Override
    public int updateNonEmptyLoggingEvent(LoggingEvent value, Assist assist){
        return loggingEventDao.updateNonEmptyLoggingEvent(value,assist);
    }

    public LoggingEventDao getLoggingEventDao() {
        return this.loggingEventDao;
    }

    public void setLoggingEventDao(LoggingEventDao loggingEventDao) {
        this.loggingEventDao = loggingEventDao;
    }

}