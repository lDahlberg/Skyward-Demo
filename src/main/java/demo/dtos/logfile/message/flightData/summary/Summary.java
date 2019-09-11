package demo.dtos.logfile.message.flightData.summary;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Summary {
    @JsonProperty("home_location_lat")
    private String homeLocationLatitude;
    @JsonProperty("home_location_lon")
    private String homeLocationLongitude;
    @JsonProperty("aircraft_smart_gohome")
    private SmartGoHome smartGoHome;

    public String getHomeLocationLatitude() {
        return homeLocationLatitude;
    }

    public void setHomeLocationLatitude(String homeLocationLatitude) {
        this.homeLocationLatitude = homeLocationLatitude;
    }

    public String getHomeLocationLongitude() {
        return homeLocationLongitude;
    }

    public void setHomeLocationLongitude(String homeLocationLongitude) {
        this.homeLocationLongitude = homeLocationLongitude;
    }

    public SmartGoHome getSmartGoHome() {
        return smartGoHome;
    }

    public void setSmartGoHome(SmartGoHome smartGoHome) {
        this.smartGoHome = smartGoHome;
    }
}
