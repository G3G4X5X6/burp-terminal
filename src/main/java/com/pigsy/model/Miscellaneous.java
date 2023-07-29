package com.pigsy.model;

public class Miscellaneous {
    private String alert;
    private boolean beep;
    private boolean checkPayload;
    private boolean dependencies;
    private boolean disableColoring;
    private boolean noLogging;
    private boolean offline;
    private String resultsFile;
    private String tmpDir;
    private boolean unstable;
    private boolean updateAll;
    private boolean wizard;
    private int verbose;

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public boolean isBeep() {
        return beep;
    }

    public void setBeep(boolean beep) {
        this.beep = beep;
    }

    public boolean isCheckPayload() {
        return checkPayload;
    }

    public void setCheckPayload(boolean checkPayload) {
        this.checkPayload = checkPayload;
    }

    public boolean isDependencies() {
        return dependencies;
    }

    public void setDependencies(boolean dependencies) {
        this.dependencies = dependencies;
    }

    public boolean isDisableColoring() {
        return disableColoring;
    }

    public void setDisableColoring(boolean disableColoring) {
        this.disableColoring = disableColoring;
    }

    public boolean isNoLogging() {
        return noLogging;
    }

    public void setNoLogging(boolean noLogging) {
        this.noLogging = noLogging;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    public String getResultsFile() {
        return resultsFile;
    }

    public void setResultsFile(String resultsFile) {
        this.resultsFile = resultsFile;
    }

    public String getTmpDir() {
        return tmpDir;
    }

    public void setTmpDir(String tmpDir) {
        this.tmpDir = tmpDir;
    }

    public boolean isUnstable() {
        return unstable;
    }

    public void setUnstable(boolean unstable) {
        this.unstable = unstable;
    }

    public boolean isUpdateAll() {
        return updateAll;
    }

    public void setUpdateAll(boolean updateAll) {
        this.updateAll = updateAll;
    }

    public boolean isWizard() {
        return wizard;
    }

    public void setWizard(boolean wizard) {
        this.wizard = wizard;
    }

    public int getVerbose() {
        return verbose;
    }

    public void setVerbose(int verbose) {
        this.verbose = verbose;
    }

    @Override
    public String toString() {
        return "Miscellaneous{" +
                "alert='" + alert + '\'' +
                ", beep=" + beep +
                ", checkPayload=" + checkPayload +
                ", dependencies=" + dependencies +
                ", disableColoring=" + disableColoring +
                ", noLogging=" + noLogging +
                ", offline=" + offline +
                ", resultsFile='" + resultsFile + '\'' +
                ", tmpDir='" + tmpDir + '\'' +
                ", unstable=" + unstable +
                ", updateAll=" + updateAll +
                ", wizard=" + wizard +
                ", verbose=" + verbose +
                '}';
    }
}
