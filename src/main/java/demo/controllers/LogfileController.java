package demo.controllers;

import demo.dtos.logfile.Logfile;
import demo.errors.DemoException;
import demo.repository.LogfileRepository;
import demo.response.LogfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logfile")
public class LogfileController {

    @Autowired
    private LogfileRepository logfileRepository;

    @PostMapping
    @ResponseStatus
    public Logfile add(@RequestBody Logfile logFile) {
        return logfileRepository.save(logFile);
    }

    @GetMapping(value="/{id}")
    @ResponseStatus
    public LogfileResponse get(@PathVariable String id) throws Exception {
        // Null here should follow Null Object Design Pattern in future
        Logfile logfile = logfileRepository.findById(id).orElse(null);
        if (logfile != null ) {
            return new LogfileResponse(logfile, null);
        } else {
            return new LogfileResponse(null, new DemoException(HttpStatus.NOT_FOUND, "Logfile Not Found"));
        }
    }
}
