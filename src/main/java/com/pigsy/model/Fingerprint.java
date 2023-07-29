package com.pigsy.model;

public class Fingerprint {
    private boolean extensiveFp;

    public boolean isExtensiveFp() {
        return extensiveFp;
    }

    public void setExtensiveFp(boolean extensiveFp) {
        this.extensiveFp = extensiveFp;
    }

    @Override
    public String toString() {
        return "Fingerprint{" +
                "extensiveFp=" + extensiveFp +
                '}';
    }
}
