package demo.dtos.logfile.message.flightData.summary;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmartGoHome {
    @JsonProperty("flight_return_time")
    private String flightReturnTime;
    @JsonProperty("landing_power")
    private String landingPower;
    @JsonProperty("landing_radius")
    private String landingRadius;
    @JsonProperty("landing_time")
    private String landingTime;
    @JsonProperty("return_power")
    private String returnPower;

    public String getFlightReturnTime() {
        return flightReturnTime;
    }

    public void setFlightReturnTime(String flightReturnTime) {
        this.flightReturnTime = flightReturnTime;
    }

    public String getLandingPower() {
        return landingPower;
    }

    public void setLandingPower(String landingPower) {
        this.landingPower = landingPower;
    }

    public String getLandingRadius() {
        return landingRadius;
    }

    public void setLandingRadius(String landingRadius) {
        this.landingRadius = landingRadius;
    }

    public String getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(String landingTime) {
        this.landingTime = landingTime;
    }

    public String getReturnPower() {
        return returnPower;
    }

    public void setReturnPower(String returnPower) {
        this.returnPower = returnPower;
    }
}
