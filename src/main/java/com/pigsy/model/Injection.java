package com.pigsy.model;

public class Injection {
    private String testParameter;
    private String skip;
    private boolean skipStatic;
    private String paramExclude;
    private String paramFilter;
    private String dbms;
    private String dbmsCred;
    private String os;
    private boolean invalidBignum;
    private boolean invalidLogical;
    private boolean noCast;
    private boolean noEscape;
    private String prefix;
    private String suffix;
    private String tamper;

    public String getTestParameter() {
        return testParameter;
    }

    public void setTestParameter(String testParameter) {
        this.testParameter = testParameter;
    }

    public String getSkip() {
        return skip;
    }

    public void setSkip(String skip) {
        this.skip = skip;
    }

    public boolean isSkipStatic() {
        return skipStatic;
    }

    public void setSkipStatic(boolean skipStatic) {
        this.skipStatic = skipStatic;
    }

    public String getParamExclude() {
        return paramExclude;
    }

    public void setParamExclude(String paramExclude) {
        this.paramExclude = paramExclude;
    }

    public String getParamFilter() {
        return paramFilter;
    }

    public void setParamFilter(String paramFilter) {
        this.paramFilter = paramFilter;
    }

    public String getDbms() {
        return dbms;
    }

    public void setDbms(String dbms) {
        this.dbms = dbms;
    }

    public String getDbmsCred() {
        return dbmsCred;
    }

    public void setDbmsCred(String dbmsCred) {
        this.dbmsCred = dbmsCred;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public boolean isInvalidBignum() {
        return invalidBignum;
    }

    public void setInvalidBignum(boolean invalidBignum) {
        this.invalidBignum = invalidBignum;
    }

    public boolean isInvalidLogical() {
        return invalidLogical;
    }

    public void setInvalidLogical(boolean invalidLogical) {
        this.invalidLogical = invalidLogical;
    }

    public boolean isNoCast() {
        return noCast;
    }

    public void setNoCast(boolean noCast) {
        this.noCast = noCast;
    }

    public boolean isNoEscape() {
        return noEscape;
    }

    public void setNoEscape(boolean noEscape) {
        this.noEscape = noEscape;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getTamper() {
        return tamper;
    }

    public void setTamper(String tamper) {
        this.tamper = tamper;
    }

    @Override
    public String toString() {
        return "Injection{" +
                "testParameter='" + testParameter + '\'' +
                ", skip='" + skip + '\'' +
                ", skipStatic=" + skipStatic +
                ", paramExclude='" + paramExclude + '\'' +
                ", paramFilter='" + paramFilter + '\'' +
                ", dbms='" + dbms + '\'' +
                ", dbmsCred='" + dbmsCred + '\'' +
                ", os='" + os + '\'' +
                ", invalidBignum=" + invalidBignum +
                ", invalidLogical=" + invalidLogical +
                ", noCast=" + noCast +
                ", noEscape=" + noEscape +
                ", prefix='" + prefix + '\'' +
                ", suffix='" + suffix + '\'' +
                ", tamper='" + tamper + '\'' +
                '}';
    }
}
