package com.pigsy.model;

public class BruteForce {
    private boolean commonTables;
    private boolean commonColumns;
    private boolean commonFiles;

    public boolean isCommonTables() {
        return commonTables;
    }

    public void setCommonTables(boolean commonTables) {
        this.commonTables = commonTables;
    }

    public boolean isCommonColumns() {
        return commonColumns;
    }

    public void setCommonColumns(boolean commonColumns) {
        this.commonColumns = commonColumns;
    }

    public boolean isCommonFiles() {
        return commonFiles;
    }

    public void setCommonFiles(boolean commonFiles) {
        this.commonFiles = commonFiles;
    }

    @Override
    public String toString() {
        return "BruteForce{" +
                "commonTables=" + commonTables +
                ", commonColumns=" + commonColumns +
                ", commonFiles=" + commonFiles +
                '}';
    }
}
