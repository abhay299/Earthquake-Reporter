package com.example.quakereport;

public class Earthquake {

    private String mUrl;
    /**
     * for magnitude of earthquake
     */
    private double eq_mag;

    /**
     * for place reported at
     */
    private String eq_place;

    /**
     * for time reported at
     */
    private long eq_time;

    public Earthquake(double magnitude, String location, long time, String url) {
        eq_mag = magnitude;
        eq_place = location;
        eq_time = time;
        mUrl = url;
    }

    public double getEq_mag() {
        return eq_mag;
    }

    public String getEq_place() {
        return eq_place;
    }

    public long getEq_time() {
        return eq_time;
    }

    public String getUrl(){ return  mUrl;}

}