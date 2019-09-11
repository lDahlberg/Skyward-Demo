package demo.dtos.logfile.message;

import com.fasterxml.jackson.annotation.JsonProperty;

public class File {
    @JsonProperty("creation_dtg")
    private String creationDate;
    @JsonProperty("logging_type")
    private String loggingType;
    @JsonProperty
    private String fileName;

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLoggingType() {
        return loggingType;
    }

    public void setLoggingType(String loggingType) {
        this.loggingType = loggingType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
