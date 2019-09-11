package demo.dtos.logfile.message.flightLogging;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FlightLogging {
    private List<Event> event;
    @JsonProperty("altitude_system")
    private String altitudeSystem;
    @JsonProperty("logging_start_dtg")
    private String loggingStart;
    @JsonProperty("flight_logging_items")
    private List<List<Object>> flightLoggingItems;
    @JsonProperty("flight_logging_keys")
    private List<String> flightLoggingKeys;

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    public String getAltitudeSystem() {
        return altitudeSystem;
    }

    public void setAltitudeSystem(String altitudeSystem) {
        this.altitudeSystem = altitudeSystem;
    }

    public String getLoggingStart() {
        return loggingStart;
    }

    public void setLoggingStart(String loggingStart) {
        this.loggingStart = loggingStart;
    }

    public List<List<Object>> getFlightLoggingItems() {
        return flightLoggingItems;
    }

    public void setFlightLoggingItems(List<List<Object>> flightLoggingItems) {
        this.flightLoggingItems = flightLoggingItems;
    }

    public List<String> getFlightLoggingKeys() {
        return flightLoggingKeys;
    }

    public void setFlightLoggingKeys(List<String> flightLoggingKeys) {
        this.flightLoggingKeys = flightLoggingKeys;
    }
}
