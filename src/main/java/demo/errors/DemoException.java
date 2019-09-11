package demo.errors;

import org.springframework.http.HttpStatus;

public class DemoException extends Exception {

    private HttpStatus errorCode;
    private String message;

    public DemoException(HttpStatus errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public HttpStatus getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(HttpStatus errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
