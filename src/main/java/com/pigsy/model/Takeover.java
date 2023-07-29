package com.pigsy.model;

public class Takeover {
    private String osCmd;
    private boolean osShell;
    private boolean osPwn;
    private boolean osSmb;
    private boolean osBof;
    private boolean privEsc;
    private String msfPath;
    private String tmpPath;

    public String getOsCmd() {
        return osCmd;
    }

    public void setOsCmd(String osCmd) {
        this.osCmd = osCmd;
    }

    public boolean isOsShell() {
        return osShell;
    }

    public void setOsShell(boolean osShell) {
        this.osShell = osShell;
    }

    public boolean isOsPwn() {
        return osPwn;
    }

    public void setOsPwn(boolean osPwn) {
        this.osPwn = osPwn;
    }

    public boolean isOsSmb() {
        return osSmb;
    }

    public void setOsSmb(boolean osSmb) {
        this.osSmb = osSmb;
    }

    public boolean isOsBof() {
        return osBof;
    }

    public void setOsBof(boolean osBof) {
        this.osBof = osBof;
    }

    public boolean isPrivEsc() {
        return privEsc;
    }

    public void setPrivEsc(boolean privEsc) {
        this.privEsc = privEsc;
    }

    public String getMsfPath() {
        return msfPath;
    }

    public void setMsfPath(String msfPath) {
        this.msfPath = msfPath;
    }

    public String getTmpPath() {
        return tmpPath;
    }

    public void setTmpPath(String tmpPath) {
        this.tmpPath = tmpPath;
    }

    @Override
    public String toString() {
        return "Takeover{" +
                "osCmd='" + osCmd + '\'' +
                ", osShell=" + osShell +
                ", osPwn=" + osPwn +
                ", osSmb=" + osSmb +
                ", osBof=" + osBof +
                ", privEsc=" + privEsc +
                ", msfPath='" + msfPath + '\'' +
                ", tmpPath='" + tmpPath + '\'' +
                '}';
    }
}
