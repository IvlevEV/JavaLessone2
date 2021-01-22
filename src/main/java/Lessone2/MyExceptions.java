package Lessone2;

import java.util.Calendar;
import java.util.Date;


class MyExceptions extends RuntimeException {
    private String message;


    MyExceptions(String message) {
        super(message);
        this.message = message;

    }

    @Override
    public String toString() {
        return " MyExceptions." + this.message;
    }
}