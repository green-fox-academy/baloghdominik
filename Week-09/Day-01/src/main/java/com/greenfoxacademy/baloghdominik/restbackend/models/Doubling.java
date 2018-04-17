package com.greenfoxacademy.baloghdominik.restbackend.models;

public class Doubling {
    private Long received;
    private Long result;

    public Doubling() {
    }

    public Doubling(Long input){
        this.received = input;
        this.result = input * 2;
    }


    public Long getReceived() {
        return received;
    }

    public void setReceived(Long received) {
        this.received = received;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }
}
