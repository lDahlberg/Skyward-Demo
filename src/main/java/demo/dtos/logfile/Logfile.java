package demo.dtos.logfile;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo.dtos.logfile.message.Message;
import org.springframework.data.annotation.Id;

public class Logfile {

    @Id
    private String _id;
    @JsonProperty(value="exchange_type")
    private String exchangeType;

    private String exchanger;
    private String uploadingOrgUuid;
    private String uploadingPilotUuid;
    @JsonProperty("flight_session_id")
    private String flightSessionId;
    private Message message;

    public String get_id() {
        return this._id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public String getExchanger() {
        return exchanger;
    }

    public void setExchanger(String exchanger) {
        this.exchanger = exchanger;
    }

    public String getUploadingOrgUuid() {
        return uploadingOrgUuid;
    }

    public void setUploadingOrgUuid(String uploadingOrgUuid) {
        this.uploadingOrgUuid = uploadingOrgUuid;
    }

    public String getUploadingPilotUuid() {
        return uploadingPilotUuid;
    }

    public void setUploadingPilotUuid(String uploadingPilotUuid) {
        this.uploadingPilotUuid = uploadingPilotUuid;
    }

    public String getFlightSessionId() {
        return flightSessionId;
    }

    public void setFlightSessionId(String flightSessionId) {
        this.flightSessionId = flightSessionId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
