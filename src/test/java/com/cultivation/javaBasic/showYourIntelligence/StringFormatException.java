package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@SuppressWarnings("unused")
public class StringFormatException extends Exception {
    String message;
    Throwable cause;
    public StringFormatException(String message) {
        // TODO: please modify the following code to pass the test
        // <--start
        this.message = message;
        //throw new NotImplementedException();
        // --end-->
    }
    public String getMessage(){
        return this.message;
    }

    public StringFormatException(String message, Throwable cause) {
        // TODO: please modify the following code to pass the test
        // <--start
        this.message = message;
        this.cause = cause;
       // throw new NotImplementedException();
        // --end-->
    }

    public Throwable getCause(){
        return this.cause;
    }
}
