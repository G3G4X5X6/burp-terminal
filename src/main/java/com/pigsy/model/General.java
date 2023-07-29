package com.pigsy.model;

public class General {
    private String sessionFile;
    private String trafficFile;
    private boolean abortOnEmpty;
    private String answers;
    private String base64Parameter;
    private boolean base64Safe;
    private boolean batch;
    private String binaryFields;
    private boolean checkInternet;
    private boolean cleanup;
    private int crawlDepth;
    private String crawlExclude;
    private String csvDel;
    private String dumpFile;
    private String dumpFormat;
    private String encoding;
    private boolean eta;
    private boolean flushSession;
    private boolean forms;
    private boolean freshQueries;
    private int googlePage;
    private boolean hexConvert;
    private String outputDir;
    private boolean parseErrors;
    private String preprocess;
    private String postprocess;
    private boolean repair;
    private String scope;
    private boolean skipHeuristics;
    private boolean skipWaf;
    private String tablePrefix;
    private String testFilter;
    private String testSkip;
    private String webRoot;

    public String getSessionFile() {
        return sessionFile;
    }

    public void setSessionFile(String sessionFile) {
        this.sessionFile = sessionFile;
    }

    public String getTrafficFile() {
        return trafficFile;
    }

    public void setTrafficFile(String trafficFile) {
        this.trafficFile = trafficFile;
    }

    public boolean isAbortOnEmpty() {
        return abortOnEmpty;
    }

    public void setAbortOnEmpty(boolean abortOnEmpty) {
        this.abortOnEmpty = abortOnEmpty;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getBase64Parameter() {
        return base64Parameter;
    }

    public void setBase64Parameter(String base64Parameter) {
        this.base64Parameter = base64Parameter;
    }

    public boolean isBase64Safe() {
        return base64Safe;
    }

    public void setBase64Safe(boolean base64Safe) {
        this.base64Safe = base64Safe;
    }

    public boolean isBatch() {
        return batch;
    }

    public void setBatch(boolean batch) {
        this.batch = batch;
    }

    public String getBinaryFields() {
        return binaryFields;
    }

    public void setBinaryFields(String binaryFields) {
        this.binaryFields = binaryFields;
    }

    public boolean isCheckInternet() {
        return checkInternet;
    }

    public void setCheckInternet(boolean checkInternet) {
        this.checkInternet = checkInternet;
    }

    public boolean isCleanup() {
        return cleanup;
    }

    public void setCleanup(boolean cleanup) {
        this.cleanup = cleanup;
    }

    public int getCrawlDepth() {
        return crawlDepth;
    }

    public void setCrawlDepth(int crawlDepth) {
        this.crawlDepth = crawlDepth;
    }

    public String getCrawlExclude() {
        return crawlExclude;
    }

    public void setCrawlExclude(String crawlExclude) {
        this.crawlExclude = crawlExclude;
    }

    public String getCsvDel() {
        return csvDel;
    }

    public void setCsvDel(String csvDel) {
        this.csvDel = csvDel;
    }

    public String getDumpFile() {
        return dumpFile;
    }

    public void setDumpFile(String dumpFile) {
        this.dumpFile = dumpFile;
    }

    public String getDumpFormat() {
        return dumpFormat;
    }

    public void setDumpFormat(String dumpFormat) {
        this.dumpFormat = dumpFormat;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public boolean isEta() {
        return eta;
    }

    public void setEta(boolean eta) {
        this.eta = eta;
    }

    public boolean isFlushSession() {
        return flushSession;
    }

    public void setFlushSession(boolean flushSession) {
        this.flushSession = flushSession;
    }

    public boolean isForms() {
        return forms;
    }

    public void setForms(boolean forms) {
        this.forms = forms;
    }

    public boolean isFreshQueries() {
        return freshQueries;
    }

    public void setFreshQueries(boolean freshQueries) {
        this.freshQueries = freshQueries;
    }

    public int getGooglePage() {
        return googlePage;
    }

    public void setGooglePage(int googlePage) {
        this.googlePage = googlePage;
    }

    public boolean isHexConvert() {
        return hexConvert;
    }

    public void setHexConvert(boolean hexConvert) {
        this.hexConvert = hexConvert;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public boolean isParseErrors() {
        return parseErrors;
    }

    public void setParseErrors(boolean parseErrors) {
        this.parseErrors = parseErrors;
    }

    public String getPreprocess() {
        return preprocess;
    }

    public void setPreprocess(String preprocess) {
        this.preprocess = preprocess;
    }

    public String getPostprocess() {
        return postprocess;
    }

    public void setPostprocess(String postprocess) {
        this.postprocess = postprocess;
    }

    public boolean isRepair() {
        return repair;
    }

    public void setRepair(boolean repair) {
        this.repair = repair;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean isSkipHeuristics() {
        return skipHeuristics;
    }

    public void setSkipHeuristics(boolean skipHeuristics) {
        this.skipHeuristics = skipHeuristics;
    }

    public boolean isSkipWaf() {
        return skipWaf;
    }

    public void setSkipWaf(boolean skipWaf) {
        this.skipWaf = skipWaf;
    }

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public String getTestFilter() {
        return testFilter;
    }

    public void setTestFilter(String testFilter) {
        this.testFilter = testFilter;
    }

    public String getTestSkip() {
        return testSkip;
    }

    public void setTestSkip(String testSkip) {
        this.testSkip = testSkip;
    }

    public String getWebRoot() {
        return webRoot;
    }

    public void setWebRoot(String webRoot) {
        this.webRoot = webRoot;
    }

    @Override
    public String toString() {
        return "General{" +
                "sessionFile='" + sessionFile + '\'' +
                ", trafficFile='" + trafficFile + '\'' +
                ", abortOnEmpty=" + abortOnEmpty +
                ", answers='" + answers + '\'' +
                ", base64Parameter='" + base64Parameter + '\'' +
                ", base64Safe=" + base64Safe +
                ", batch=" + batch +
                ", binaryFields='" + binaryFields + '\'' +
                ", checkInternet=" + checkInternet +
                ", cleanup=" + cleanup +
                ", crawlDepth=" + crawlDepth +
                ", crawlExclude='" + crawlExclude + '\'' +
                ", csvDel='" + csvDel + '\'' +
                ", dumpFile='" + dumpFile + '\'' +
                ", dumpFormat='" + dumpFormat + '\'' +
                ", encoding='" + encoding + '\'' +
                ", eta=" + eta +
                ", flushSession=" + flushSession +
                ", forms=" + forms +
                ", freshQueries=" + freshQueries +
                ", googlePage=" + googlePage +
                ", hexConvert=" + hexConvert +
                ", outputDir='" + outputDir + '\'' +
                ", parseErrors=" + parseErrors +
                ", preprocess='" + preprocess + '\'' +
                ", postprocess='" + postprocess + '\'' +
                ", repair=" + repair +
                ", scope='" + scope + '\'' +
                ", skipHeuristics=" + skipHeuristics +
                ", skipWaf=" + skipWaf +
                ", tablePrefix='" + tablePrefix + '\'' +
                ", testFilter='" + testFilter + '\'' +
                ", testSkip='" + testSkip + '\'' +
                ", webRoot='" + webRoot + '\'' +
                '}';
    }
}
