package com.greenfoxacademy.baloghdominik.groot.models;

public class Yondu {
    private Float distance;
    private Float time;
    private Float speed;

    public Yondu(){

    }

    public Yondu(String distance, String time){
        this.distance = Float.parseFloat(distance);
        this.time = Float.parseFloat(time);
        this.speed = this.distance / this.time;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }
}
