package com.wiserv.bean.po;
public class LoggingEventException {
    private Long eventId;
    private Integer i;
    private String traceLine;
    public LoggingEventException() {
        super();
    }
    public LoggingEventException(Long eventId,Integer i,String traceLine) {
        super();
        this.eventId = eventId;
        this.i = i;
        this.traceLine = traceLine;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Integer geti() {
        return this.i;
    }

    public void seti(Integer i) {
        this.i = i;
    }

    public String getTraceLine() {
        return this.traceLine;
    }

    public void setTraceLine(String traceLine) {
        this.traceLine = traceLine;
    }

}
