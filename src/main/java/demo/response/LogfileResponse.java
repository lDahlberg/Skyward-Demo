package demo.response;

import demo.dtos.logfile.Logfile;
import demo.errors.DemoException;

public class LogfileResponse {

    private Logfile logfile;
    private DemoException demoException;

    public LogfileResponse() {}

    public LogfileResponse(Logfile logfile, DemoException demoException) {
        this.logfile = logfile;
        this.demoException = demoException;
    }

    public Logfile getLogfile() {
        return logfile;
    }

    public void setLogfile(Logfile logfile) {
        this.logfile = logfile;
    }

    public DemoException getDemoException() {
        return demoException;
    }

    public void setDemoException(DemoException demoException) {
        this.demoException = demoException;
    }
}
