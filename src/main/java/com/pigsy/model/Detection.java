package com.pigsy.model;

public class Detection {
    private int level;
    private int risk;
    private String string;
    private String notString;
    private String regexp;
    private boolean smart;
    private boolean textOnly;
    private boolean titles;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getNotString() {
        return notString;
    }

    public void setNotString(String notString) {
        this.notString = notString;
    }

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public boolean isTextOnly() {
        return textOnly;
    }

    public void setTextOnly(boolean textOnly) {
        this.textOnly = textOnly;
    }

    public boolean isTitles() {
        return titles;
    }

    public void setTitles(boolean titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "Detection{" +
                "level=" + level +
                ", risk=" + risk +
                ", string='" + string + '\'' +
                ", notString='" + notString + '\'' +
                ", regexp='" + regexp + '\'' +
                ", smart=" + smart +
                ", textOnly=" + textOnly +
                ", titles=" + titles +
                '}';
    }
}
