package com.pigsy.model;

public class FileSystem {
    private String fileRead;
    private String fileWrite;
    private String fileDest;

    public String getFileRead() {
        return fileRead;
    }

    public void setFileRead(String fileRead) {
        this.fileRead = fileRead;
    }

    public String getFileWrite() {
        return fileWrite;
    }

    public void setFileWrite(String fileWrite) {
        this.fileWrite = fileWrite;
    }

    public String getFileDest() {
        return fileDest;
    }

    public void setFileDest(String fileDest) {
        this.fileDest = fileDest;
    }

    @Override
    public String toString() {
        return "FileSystem{" +
                "fileRead='" + fileRead + '\'' +
                ", fileWrite='" + fileWrite + '\'' +
                ", fileDest='" + fileDest + '\'' +
                '}';
    }
}
