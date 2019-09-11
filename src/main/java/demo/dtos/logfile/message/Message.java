package demo.dtos.logfile.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo.dtos.logfile.message.flightData.FlightData;
import demo.dtos.logfile.message.flightLogging.FlightLogging;

public class Message {
    private File file;
    @JsonProperty("message_type")
    private String messageType;
    @JsonProperty("flight_logging")
    private FlightLogging flightLogging;
    @JsonProperty("flight_data")
    private FlightData flightData;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public FlightLogging getFlightLogging() {
        return flightLogging;
    }

    public void setFlightLogging(FlightLogging flightLogging) {
        this.flightLogging = flightLogging;
    }

    public FlightData getFlightData() {
        return flightData;
    }

    public void setFlightData(FlightData flightData) {
        this.flightData = flightData;
    }
}
