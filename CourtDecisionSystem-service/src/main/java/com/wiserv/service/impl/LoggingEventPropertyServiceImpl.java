package com.wiserv.service.impl;
import java.util.List;
import com.wiserv.dao.LoggingEventPropertyDao;
import com.wiserv.bean.po.LoggingEventProperty;
import com.wiserv.common.Assist;
import com.wiserv.service.LoggingEventPropertyService;
public class LoggingEventPropertyServiceImpl implements LoggingEventPropertyService{
    private LoggingEventPropertyDao loggingEventPropertyDao;
    @Override
    public long getLoggingEventPropertyRowCount(Assist assist){
        return loggingEventPropertyDao.getLoggingEventPropertyRowCount(assist);
    }
    @Override
    public List<LoggingEventProperty> selectLoggingEventProperty(Assist assist){
        return loggingEventPropertyDao.selectLoggingEventProperty(assist);
    }
    @Override
    public LoggingEventProperty selectLoggingEventPropertyByObj(LoggingEventProperty obj){
        return loggingEventPropertyDao.selectLoggingEventPropertyByObj(obj);
    }
    @Override
    public LoggingEventProperty selectLoggingEventPropertyById(Long id){
        return loggingEventPropertyDao.selectLoggingEventPropertyById(id);
    }
    @Override
    public int insertLoggingEventProperty(LoggingEventProperty value){
        return loggingEventPropertyDao.insertLoggingEventProperty(value);
    }
    @Override
    public int insertNonEmptyLoggingEventProperty(LoggingEventProperty value){
        return loggingEventPropertyDao.insertNonEmptyLoggingEventProperty(value);
    }
    @Override
    public int deleteLoggingEventPropertyById(Long id){
        return loggingEventPropertyDao.deleteLoggingEventPropertyById(id);
    }
    @Override
    public int deleteLoggingEventProperty(Assist assist){
        return loggingEventPropertyDao.deleteLoggingEventProperty(assist);
    }
    @Override
    public int updateLoggingEventPropertyById(LoggingEventProperty enti){
        return loggingEventPropertyDao.updateLoggingEventPropertyById(enti);
    }
    @Override
    public int updateLoggingEventProperty(LoggingEventProperty value, Assist assist){
        return loggingEventPropertyDao.updateLoggingEventProperty(value,assist);
    }
    @Override
    public int updateNonEmptyLoggingEventPropertyById(LoggingEventProperty enti){
        return loggingEventPropertyDao.updateNonEmptyLoggingEventPropertyById(enti);
    }
    @Override
    public int updateNonEmptyLoggingEventProperty(LoggingEventProperty value, Assist assist){
        return loggingEventPropertyDao.updateNonEmptyLoggingEventProperty(value,assist);
    }

    public LoggingEventPropertyDao getLoggingEventPropertyDao() {
        return this.loggingEventPropertyDao;
    }

    public void setLoggingEventPropertyDao(LoggingEventPropertyDao loggingEventPropertyDao) {
        this.loggingEventPropertyDao = loggingEventPropertyDao;
    }

}