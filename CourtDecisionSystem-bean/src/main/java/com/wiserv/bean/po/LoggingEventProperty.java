package com.wiserv.bean.po;
public class LoggingEventProperty {
    private Long eventId;
    private String mappedKey;
    private String mappedValue;
    public LoggingEventProperty() {
        super();
    }
    public LoggingEventProperty(Long eventId,String mappedKey,String mappedValue) {
        super();
        this.eventId = eventId;
        this.mappedKey = mappedKey;
        this.mappedValue = mappedValue;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getMappedKey() {
        return this.mappedKey;
    }

    public void setMappedKey(String mappedKey) {
        this.mappedKey = mappedKey;
    }

    public String getMappedValue() {
        return this.mappedValue;
    }

    public void setMappedValue(String mappedValue) {
        this.mappedValue = mappedValue;
    }

}
