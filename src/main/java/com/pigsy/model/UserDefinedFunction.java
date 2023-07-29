package com.pigsy.model;

public class UserDefinedFunction {
    private boolean udfInject;
    private String shLib;

    public boolean isUdfInject() {
        return udfInject;
    }

    public void setUdfInject(boolean udfInject) {
        this.udfInject = udfInject;
    }

    public String getShLib() {
        return shLib;
    }

    public void setShLib(String shLib) {
        this.shLib = shLib;
    }

    @Override
    public String toString() {
        return "UserDefinedFunction{" +
                "udfInject=" + udfInject +
                ", shLib='" + shLib + '\'' +
                '}';
    }
}
