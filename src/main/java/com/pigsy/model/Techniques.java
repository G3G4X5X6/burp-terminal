package com.pigsy.model;

public class Techniques {
    private String technique;
    private int timeSec;
    private int uCols;
    private String uChar;
    private String uFrom;
    private String dnsDomain;
    private String secondUrl;
    private String secondReq;

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public int getTimeSec() {
        return timeSec;
    }

    public void setTimeSec(int timeSec) {
        this.timeSec = timeSec;
    }

    public int getuCols() {
        return uCols;
    }

    public void setuCols(int uCols) {
        this.uCols = uCols;
    }

    public String getuChar() {
        return uChar;
    }

    public void setuChar(String uChar) {
        this.uChar = uChar;
    }

    public String getuFrom() {
        return uFrom;
    }

    public void setuFrom(String uFrom) {
        this.uFrom = uFrom;
    }

    public String getDnsDomain() {
        return dnsDomain;
    }

    public void setDnsDomain(String dnsDomain) {
        this.dnsDomain = dnsDomain;
    }

    public String getSecondUrl() {
        return secondUrl;
    }

    public void setSecondUrl(String secondUrl) {
        this.secondUrl = secondUrl;
    }

    public String getSecondReq() {
        return secondReq;
    }

    public void setSecondReq(String secondReq) {
        this.secondReq = secondReq;
    }

    @Override
    public String toString() {
        return "Techniques{" +
                "technique='" + technique + '\'' +
                ", timeSec=" + timeSec +
                ", uCols=" + uCols +
                ", uChar='" + uChar + '\'' +
                ", uFrom='" + uFrom + '\'' +
                ", dnsDomain='" + dnsDomain + '\'' +
                ", secondUrl='" + secondUrl + '\'' +
                ", secondReq='" + secondReq + '\'' +
                '}';
    }
}
