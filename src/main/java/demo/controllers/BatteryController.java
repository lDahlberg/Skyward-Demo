package demo.controllers;

import demo.dtos.logfile.message.flightData.Battery;
import demo.dtos.logfile.Logfile;
import demo.errors.DemoException;
import demo.repository.LogfileRepository;
import demo.response.BatteryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/battery")
public class BatteryController {

    @Autowired
    private LogfileRepository logfileRepository;

    @GetMapping(value="/{id}")
    @ResponseStatus
    public BatteryResponse get(@PathVariable String id) throws Exception {
        Logfile logfile = logfileRepository.findById(id).orElseThrow( () -> new DemoException(HttpStatus.NOT_FOUND, "File Not Found"));

        if(logfile.getMessage() != null &&
                logfile.getMessage().getFlightData() != null &&
                logfile.getMessage().getFlightData().getBattery() != null) {
            return new BatteryResponse(logfile.getMessage().getFlightData().getBattery(), null);
        } else {
            return new BatteryResponse(null, new DemoException(HttpStatus.NOT_FOUND, "Battery not found"));
        }
    }
}
