package demo.dtos.logfile.message.flightData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightController {
    @JsonProperty("serial_number")
    private String serialNumber;
    @JsonProperty("firmware_version")
    private String firmwareVersion;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
}
