package com.pigsy.model;

public class Request {
    private String method;
    private String data;
    private String paramDel;
    private String cookie;
    private String cookieDel;
    private String liveCookies;
    private String loadCoolies;
    private boolean dropSetCookie;
    private String agent;
    private boolean mobile;
    private boolean randomAgent;
    private String host;
    private String referer;
    private String headers;
    private String authType;
    private String authCred;
    private String authFile;
    private String abortCode;
    private String ignoreCode;
    private boolean ignoreProxy;
    private boolean ignoreRedirects;
    private boolean ignoreTimeouts;
    private String proxy;
    private String proxyCred;
    private String proxyFile;
    private boolean tor;
    private String torType;
    private boolean checkTor;
    private float delay;
    private float timeout;
    private int retries;
    private String retryOn;
    private String rParam;
    private String safeUrl;
    private String safePost;
    private String safeReqFile;
    private int safeFreq;
    private boolean skipUrlEncode;
    private String csrfToken;
    private String csrfUrl;
    private String csrfMethod;
    private String csrfData;
    private String csrfRetries;
    private boolean forceSSL;
    private boolean chunked;
    private boolean hpp;
    private String evalCode;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getParamDel() {
        return paramDel;
    }

    public void setParamDel(String paramDel) {
        this.paramDel = paramDel;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getCookieDel() {
        return cookieDel;
    }

    public void setCookieDel(String cookieDel) {
        this.cookieDel = cookieDel;
    }

    public String getLiveCookies() {
        return liveCookies;
    }

    public void setLiveCookies(String liveCookies) {
        this.liveCookies = liveCookies;
    }

    public String getLoadCoolies() {
        return loadCoolies;
    }

    public void setLoadCoolies(String loadCoolies) {
        this.loadCoolies = loadCoolies;
    }

    public boolean isDropSetCookie() {
        return dropSetCookie;
    }

    public void setDropSetCookie(boolean dropSetCookie) {
        this.dropSetCookie = dropSetCookie;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public boolean isRandomAgent() {
        return randomAgent;
    }

    public void setRandomAgent(boolean randomAgent) {
        this.randomAgent = randomAgent;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthCred() {
        return authCred;
    }

    public void setAuthCred(String authCred) {
        this.authCred = authCred;
    }

    public String getAuthFile() {
        return authFile;
    }

    public void setAuthFile(String authFile) {
        this.authFile = authFile;
    }

    public String getAbortCode() {
        return abortCode;
    }

    public void setAbortCode(String abortCode) {
        this.abortCode = abortCode;
    }

    public String getIgnoreCode() {
        return ignoreCode;
    }

    public void setIgnoreCode(String ignoreCode) {
        this.ignoreCode = ignoreCode;
    }

    public boolean isIgnoreProxy() {
        return ignoreProxy;
    }

    public void setIgnoreProxy(boolean ignoreProxy) {
        this.ignoreProxy = ignoreProxy;
    }

    public boolean isIgnoreRedirects() {
        return ignoreRedirects;
    }

    public void setIgnoreRedirects(boolean ignoreRedirects) {
        this.ignoreRedirects = ignoreRedirects;
    }

    public boolean isIgnoreTimeouts() {
        return ignoreTimeouts;
    }

    public void setIgnoreTimeouts(boolean ignoreTimeouts) {
        this.ignoreTimeouts = ignoreTimeouts;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getProxyCred() {
        return proxyCred;
    }

    public void setProxyCred(String proxyCred) {
        this.proxyCred = proxyCred;
    }

    public String getProxyFile() {
        return proxyFile;
    }

    public void setProxyFile(String proxyFile) {
        this.proxyFile = proxyFile;
    }

    public boolean isTor() {
        return tor;
    }

    public void setTor(boolean tor) {
        this.tor = tor;
    }

    public String getTorType() {
        return torType;
    }

    public void setTorType(String torType) {
        this.torType = torType;
    }

    public boolean isCheckTor() {
        return checkTor;
    }

    public void setCheckTor(boolean checkTor) {
        this.checkTor = checkTor;
    }

    public float getDelay() {
        return delay;
    }

    public void setDelay(float delay) {
        this.delay = delay;
    }

    public float getTimeout() {
        return timeout;
    }

    public void setTimeout(float timeout) {
        this.timeout = timeout;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public String getRetryOn() {
        return retryOn;
    }

    public void setRetryOn(String retryOn) {
        this.retryOn = retryOn;
    }

    public String getrParam() {
        return rParam;
    }

    public void setrParam(String rParam) {
        this.rParam = rParam;
    }

    public String getSafeUrl() {
        return safeUrl;
    }

    public void setSafeUrl(String safeUrl) {
        this.safeUrl = safeUrl;
    }

    public String getSafePost() {
        return safePost;
    }

    public void setSafePost(String safePost) {
        this.safePost = safePost;
    }

    public String getSafeReqFile() {
        return safeReqFile;
    }

    public void setSafeReqFile(String safeReqFile) {
        this.safeReqFile = safeReqFile;
    }

    public int getSafeFreq() {
        return safeFreq;
    }

    public void setSafeFreq(int safeFreq) {
        this.safeFreq = safeFreq;
    }

    public boolean isSkipUrlEncode() {
        return skipUrlEncode;
    }

    public void setSkipUrlEncode(boolean skipUrlEncode) {
        this.skipUrlEncode = skipUrlEncode;
    }

    public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

    public String getCsrfUrl() {
        return csrfUrl;
    }

    public void setCsrfUrl(String csrfUrl) {
        this.csrfUrl = csrfUrl;
    }

    public String getCsrfMethod() {
        return csrfMethod;
    }

    public void setCsrfMethod(String csrfMethod) {
        this.csrfMethod = csrfMethod;
    }

    public String getCsrfData() {
        return csrfData;
    }

    public void setCsrfData(String csrfData) {
        this.csrfData = csrfData;
    }

    public String getCsrfRetries() {
        return csrfRetries;
    }

    public void setCsrfRetries(String csrfRetries) {
        this.csrfRetries = csrfRetries;
    }

    public boolean isForceSSL() {
        return forceSSL;
    }

    public void setForceSSL(boolean forceSSL) {
        this.forceSSL = forceSSL;
    }

    public boolean isChunked() {
        return chunked;
    }

    public void setChunked(boolean chunked) {
        this.chunked = chunked;
    }

    public boolean isHpp() {
        return hpp;
    }

    public void setHpp(boolean hpp) {
        this.hpp = hpp;
    }

    public String getEvalCode() {
        return evalCode;
    }

    public void setEvalCode(String evalCode) {
        this.evalCode = evalCode;
    }

    @Override
    public String toString() {
        return "Request{" +
                "method='" + method + '\'' +
                ", data='" + data + '\'' +
                ", paramDel='" + paramDel + '\'' +
                ", cookie='" + cookie + '\'' +
                ", cookieDel='" + cookieDel + '\'' +
                ", liveCookies='" + liveCookies + '\'' +
                ", loadCoolies='" + loadCoolies + '\'' +
                ", dropSetCookie=" + dropSetCookie +
                ", agent='" + agent + '\'' +
                ", mobile=" + mobile +
                ", randomAgent=" + randomAgent +
                ", host='" + host + '\'' +
                ", referer='" + referer + '\'' +
                ", headers='" + headers + '\'' +
                ", authType='" + authType + '\'' +
                ", authCred='" + authCred + '\'' +
                ", authFile='" + authFile + '\'' +
                ", abortCode='" + abortCode + '\'' +
                ", ignoreCode='" + ignoreCode + '\'' +
                ", ignoreProxy=" + ignoreProxy +
                ", ignoreRedirects=" + ignoreRedirects +
                ", ignoreTimeouts=" + ignoreTimeouts +
                ", proxy='" + proxy + '\'' +
                ", proxyCred='" + proxyCred + '\'' +
                ", proxyFile='" + proxyFile + '\'' +
                ", tor=" + tor +
                ", torType='" + torType + '\'' +
                ", checkTor=" + checkTor +
                ", delay=" + delay +
                ", timeout=" + timeout +
                ", retries=" + retries +
                ", retryOn='" + retryOn + '\'' +
                ", rParam='" + rParam + '\'' +
                ", safeUrl='" + safeUrl + '\'' +
                ", safePost='" + safePost + '\'' +
                ", safeReqFile='" + safeReqFile + '\'' +
                ", safeFreq=" + safeFreq +
                ", skipUrlEncode=" + skipUrlEncode +
                ", csrfToken='" + csrfToken + '\'' +
                ", csrfUrl='" + csrfUrl + '\'' +
                ", csrfMethod='" + csrfMethod + '\'' +
                ", csrfData='" + csrfData + '\'' +
                ", csrfRetries='" + csrfRetries + '\'' +
                ", forceSSL=" + forceSSL +
                ", chunked=" + chunked +
                ", hpp=" + hpp +
                ", evalCode='" + evalCode + '\'' +
                '}';
    }
}
