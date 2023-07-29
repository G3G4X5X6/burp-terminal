package com.pigsy.model;

public class Target {
    private String url;
    private String direct;
    private String logFile;
    private String bulkFile;
    private String requestFile;
    private String googleDork;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getLogFile() {
        return logFile;
    }

    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    public String getBulkFile() {
        return bulkFile;
    }

    public void setBulkFile(String bulkFile) {
        this.bulkFile = bulkFile;
    }

    public String getRequestFile() {
        return requestFile;
    }

    public void setRequestFile(String requestFile) {
        this.requestFile = requestFile;
    }

    public String getGoogleDork() {
        return googleDork;
    }

    public void setGoogleDork(String googleDork) {
        this.googleDork = googleDork;
    }

    @Override
    public String toString() {
        return "Target{" +
                "url='" + url + '\'' +
                ", direct='" + direct + '\'' +
                ", logFile='" + logFile + '\'' +
                ", bulkFile='" + bulkFile + '\'' +
                ", requestFile='" + requestFile + '\'' +
                ", googleDork='" + googleDork + '\'' +
                '}';
    }
}
