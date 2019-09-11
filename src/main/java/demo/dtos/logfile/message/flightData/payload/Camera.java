package demo.dtos.logfile.message.flightData.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Camera {
    @JsonProperty("serial_number")
    private String serialNumber;
    private String model;
    @JsonProperty("firmware_version")
    private String firmwareVersion;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
}
