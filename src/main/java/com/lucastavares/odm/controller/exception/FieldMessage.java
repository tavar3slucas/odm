package com.lucastavares.odm.controller.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable {

    private static final long serialVersionUID = 1l;

    private String fieldName;
    private String message;

    public FieldMessage() {}

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FieldMessage(String fildName, String message) {
        super();
        this.fieldName = fildName;
        this.message = message;
    }
}
