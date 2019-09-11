package demo.dtos.logfile.message.flightLogging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
    @JsonProperty("event_info")
    private String eventInfo;
    @JsonProperty("event_timestamp")
    private String eventTimestamp;
    @JsonProperty("event_type")
    private String eventType;

    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }

    public String getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(String eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
