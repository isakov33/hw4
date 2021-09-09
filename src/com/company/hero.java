package com.company;

public class hero {
    private int live;
    private int uron;
    private String supersila;

    public hero() {
    }
    public hero(int live, int uron, String supersila) {
        this.live = live;
        this.uron = uron;
        this.supersila = supersila;

    }
    public hero(int live, int uron) {
        this.live = live;
        this.uron = uron;
    }
    public int getLive() {
        return live;
    }
    public int getUron() {
        return uron;
    }
    public String getSupersila() {
        return supersila;
    }
}
