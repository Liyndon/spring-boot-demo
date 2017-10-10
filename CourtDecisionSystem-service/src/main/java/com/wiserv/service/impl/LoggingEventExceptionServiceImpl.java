package com.wiserv.service.impl;

import java.util.List;

import com.wiserv.dao.LoggingEventExceptionDao;
import com.wiserv.bean.po.LoggingEventException;
import com.wiserv.common.Assist;
import com.wiserv.service.LoggingEventExceptionService;

public class LoggingEventExceptionServiceImpl implements LoggingEventExceptionService {
    private LoggingEventExceptionDao loggingEventExceptionDao;

    @Override
    public long getLoggingEventExceptionRowCount(Assist assist) {
        return loggingEventExceptionDao.getLoggingEventExceptionRowCount(assist);
    }

    @Override
    public List<LoggingEventException> selectLoggingEventException(Assist assist) {
        return loggingEventExceptionDao.selectLoggingEventException(assist);
    }

    @Override
    public LoggingEventException selectLoggingEventExceptionByObj(LoggingEventException obj) {
        return loggingEventExceptionDao.selectLoggingEventExceptionByObj(obj);
    }

    @Override
    public LoggingEventException selectLoggingEventExceptionById(Long id) {
        return loggingEventExceptionDao.selectLoggingEventExceptionById(id);
    }

    @Override
    public int insertLoggingEventException(LoggingEventException value) {
        return loggingEventExceptionDao.insertLoggingEventException(value);
    }

    @Override
    public int insertNonEmptyLoggingEventException(LoggingEventException value) {
        return loggingEventExceptionDao.insertNonEmptyLoggingEventException(value);
    }

    @Override
    public int deleteLoggingEventExceptionById(Long id) {
        return loggingEventExceptionDao.deleteLoggingEventExceptionById(id);
    }

    @Override
    public int deleteLoggingEventException(Assist assist) {
        return loggingEventExceptionDao.deleteLoggingEventException(assist);
    }

    @Override
    public int updateLoggingEventExceptionById(LoggingEventException enti) {
        return loggingEventExceptionDao.updateLoggingEventExceptionById(enti);
    }

    @Override
    public int updateLoggingEventException(LoggingEventException value, Assist assist) {
        return loggingEventExceptionDao.updateLoggingEventException(value, assist);
    }

    @Override
    public int updateNonEmptyLoggingEventExceptionById(LoggingEventException enti) {
        return loggingEventExceptionDao.updateNonEmptyLoggingEventExceptionById(enti);
    }

    @Override
    public int updateNonEmptyLoggingEventException(LoggingEventException value, Assist assist) {
        return loggingEventExceptionDao.updateNonEmptyLoggingEventException(value, assist);
    }

    public LoggingEventExceptionDao getLoggingEventExceptionDao() {
        return this.loggingEventExceptionDao;
    }

    public void setLoggingEventExceptionDao(LoggingEventExceptionDao loggingEventExceptionDao) {
        this.loggingEventExceptionDao = loggingEventExceptionDao;
    }

}