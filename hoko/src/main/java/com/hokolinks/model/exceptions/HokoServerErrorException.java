package com.hokolinks.model.exceptions;


public class HokoServerErrorException extends HokoException {
    public HokoServerErrorException(int code, String message) {
        super(code, "Error " + message);
    }
}