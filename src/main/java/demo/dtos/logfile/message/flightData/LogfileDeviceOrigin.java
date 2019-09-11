package demo.dtos.logfile.message.flightData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogfileDeviceOrigin {
    @JsonProperty("user_interface_idiom")
    private String userInterfaceIdiom;
    @JsonProperty("operating_system")
    private String operatingSystem;
    private String model;
    @JsonProperty("device_ssd")
    private String deviceSSD;

    public String getUserInterfaceIdiom() {
        return userInterfaceIdiom;
    }

    public void setUserInterfaceIdiom(String userInterfaceIdiom) {
        this.userInterfaceIdiom = userInterfaceIdiom;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDeviceSSD() {
        return deviceSSD;
    }

    public void setDeviceSSD(String deviceSSD) {
        this.deviceSSD = deviceSSD;
    }
}
