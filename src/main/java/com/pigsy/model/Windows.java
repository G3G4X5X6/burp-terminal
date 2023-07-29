package com.pigsy.model;

public class Windows {
    private boolean regRead;
    private boolean regAdd;
    private boolean regDel;
    private String regKey;
    private String regVal;
    private String regData;
    private String regType;

    public boolean isRegRead() {
        return regRead;
    }

    public void setRegRead(boolean regRead) {
        this.regRead = regRead;
    }

    public boolean isRegAdd() {
        return regAdd;
    }

    public void setRegAdd(boolean regAdd) {
        this.regAdd = regAdd;
    }

    public boolean isRegDel() {
        return regDel;
    }

    public void setRegDel(boolean regDel) {
        this.regDel = regDel;
    }

    public String getRegKey() {
        return regKey;
    }

    public void setRegKey(String regKey) {
        this.regKey = regKey;
    }

    public String getRegVal() {
        return regVal;
    }

    public void setRegVal(String regVal) {
        this.regVal = regVal;
    }

    public String getRegData() {
        return regData;
    }

    public void setRegData(String regData) {
        this.regData = regData;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "regRead=" + regRead +
                ", regAdd=" + regAdd +
                ", regDel=" + regDel +
                ", regKey='" + regKey + '\'' +
                ", regVal='" + regVal + '\'' +
                ", regData='" + regData + '\'' +
                ", regType='" + regType + '\'' +
                '}';
    }
}
