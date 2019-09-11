package demo.dtos.logfile.message.flightData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Battery {
    @JsonProperty("serial_number")
    private String serialNumber;
    @JsonProperty("remaining_life")
    private String remainingLife;
    private String discharges;
    @JsonProperty("full_charge_volume")
    private String fullChargeVolume;
    @JsonProperty("cell_number")
    private String cellNumber;
    @JsonProperty("firmware_version")
    private String firmwareVersion;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getRemainingLife() {
        return remainingLife;
    }

    public void setRemainingLife(String remainingLife) {
        this.remainingLife = remainingLife;
    }

    public String getDischarges() {
        return discharges;
    }

    public void setDischarges(String discharges) {
        this.discharges = discharges;
    }

    public String getFullChargeVolume() {
        return fullChargeVolume;
    }

    public void setFullChargeVolume(String fullChargeVolume) {
        this.fullChargeVolume = fullChargeVolume;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }
}
