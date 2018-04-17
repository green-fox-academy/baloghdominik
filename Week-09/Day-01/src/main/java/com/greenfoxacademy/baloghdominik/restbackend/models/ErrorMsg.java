package com.greenfoxacademy.baloghdominik.restbackend.models;

public class ErrorMsg {
    private String error;

    public ErrorMsg(String msg){
        this.error = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
