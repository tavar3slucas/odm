package com.lucastavares.odm.service.exceptions;

public class DataIntegrityExcepction extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public DataIntegrityExcepction(String msg){
        super(msg);
    }

    public DataIntegrityExcepction(String msg, Throwable cause) {
        super(msg);
    }
}
