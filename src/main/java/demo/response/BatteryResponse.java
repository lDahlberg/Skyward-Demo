package demo.response;

import demo.dtos.logfile.message.flightData.Battery;
import demo.errors.DemoException;

public class BatteryResponse {

    private Battery battery;
    private DemoException demoException;

    public BatteryResponse() {}

    public BatteryResponse(Battery battery, DemoException demoException) {
        this.battery = battery;
        this.demoException = demoException;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public DemoException getDemoException() {
        return demoException;
    }

    public void setDemoException(DemoException demoException) {
        this.demoException = demoException;
    }
}
