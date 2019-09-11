package demo.dtos.logfile.message.flightData;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo.dtos.logfile.message.flightData.payload.Payload;
import demo.dtos.logfile.message.flightData.summary.Summary;

public class FlightData {
    private Payload payload;
    @JsonProperty("remote_controller")
    private RemoteController remoteController;
    private Aircraft aircraft;
    private Summary summary;
    private GCS gcs;
    @JsonProperty("flight_session_end")
    private String flightSessionEnd;
    @JsonProperty("flight_controller")
    private FlightController flightController;
    private Battery battery;
    @JsonProperty("flight_session_start")
    private String flightSessionStart;
    @JsonProperty("logfile_device_origin")
    private LogfileDeviceOrigin logfileDeviceOrigin;

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public RemoteController getRemoteController() {
        return remoteController;
    }

    public void setRemoteController(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public GCS getGcs() {
        return gcs;
    }

    public void setGcs(GCS gcs) {
        this.gcs = gcs;
    }

    public String getFlightSessionEnd() {
        return flightSessionEnd;
    }

    public void setFlightSessionEnd(String flightSessionEnd) {
        this.flightSessionEnd = flightSessionEnd;
    }

    public FlightController getFlightController() {
        return flightController;
    }

    public void setFlightController(FlightController flightController) {
        this.flightController = flightController;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public String getFlightSessionStart() {
        return flightSessionStart;
    }

    public void setFlightSessionStart(String flightSessionStart) {
        this.flightSessionStart = flightSessionStart;
    }

    public LogfileDeviceOrigin getLogfileDeviceOrigin() {
        return logfileDeviceOrigin;
    }

    public void setLogfileDeviceOrigin(LogfileDeviceOrigin logfileDeviceOrigin) {
        this.logfileDeviceOrigin = logfileDeviceOrigin;
    }
}
