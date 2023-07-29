package com.pigsy.model;

public class Enumeration {
    private boolean getAll;
    private boolean getBanner;
    private boolean getCurrentUser;
    private boolean getCurrentDb;
    private boolean getHostname;
    private boolean isDba;
    private boolean getUsers;
    private boolean getPasswordHashes;
    private boolean getPrivileges;
    private boolean getRoles;
    private boolean getDbs;
    private boolean getTables;
    private boolean getColumns;
    private boolean getSchema;
    private boolean getCount;
    private boolean dumpTable;
    private boolean dumpAll;
    private boolean search;
    private boolean getComments;
    private boolean getStatements;
    private String db;
    private String tbl;
    private String col;
    private String exclude;
    private String pivotColumn;
    private String dumpWhere;
    private String user;
    private boolean excludeSysDbs;
    private int limitStart;
    private int limitStop;
    private int firstChar;
    private int lastChar;
    private String sqlQuery;
    private boolean sqlShell;
    private String sqlFile;

    public boolean isGetAll() {
        return getAll;
    }

    public void setGetAll(boolean getAll) {
        this.getAll = getAll;
    }

    public boolean isGetBanner() {
        return getBanner;
    }

    public void setGetBanner(boolean getBanner) {
        this.getBanner = getBanner;
    }

    public boolean isGetCurrentUser() {
        return getCurrentUser;
    }

    public void setGetCurrentUser(boolean getCurrentUser) {
        this.getCurrentUser = getCurrentUser;
    }

    public boolean isGetCurrentDb() {
        return getCurrentDb;
    }

    public void setGetCurrentDb(boolean getCurrentDb) {
        this.getCurrentDb = getCurrentDb;
    }

    public boolean isGetHostname() {
        return getHostname;
    }

    public void setGetHostname(boolean getHostname) {
        this.getHostname = getHostname;
    }

    public boolean isDba() {
        return isDba;
    }

    public void setDba(boolean dba) {
        isDba = dba;
    }

    public boolean isGetUsers() {
        return getUsers;
    }

    public void setGetUsers(boolean getUsers) {
        this.getUsers = getUsers;
    }

    public boolean isGetPasswordHashes() {
        return getPasswordHashes;
    }

    public void setGetPasswordHashes(boolean getPasswordHashes) {
        this.getPasswordHashes = getPasswordHashes;
    }

    public boolean isGetPrivileges() {
        return getPrivileges;
    }

    public void setGetPrivileges(boolean getPrivileges) {
        this.getPrivileges = getPrivileges;
    }

    public boolean isGetRoles() {
        return getRoles;
    }

    public void setGetRoles(boolean getRoles) {
        this.getRoles = getRoles;
    }

    public boolean isGetDbs() {
        return getDbs;
    }

    public void setGetDbs(boolean getDbs) {
        this.getDbs = getDbs;
    }

    public boolean isGetTables() {
        return getTables;
    }

    public void setGetTables(boolean getTables) {
        this.getTables = getTables;
    }

    public boolean isGetColumns() {
        return getColumns;
    }

    public void setGetColumns(boolean getColumns) {
        this.getColumns = getColumns;
    }

    public boolean isGetSchema() {
        return getSchema;
    }

    public void setGetSchema(boolean getSchema) {
        this.getSchema = getSchema;
    }

    public boolean isGetCount() {
        return getCount;
    }

    public void setGetCount(boolean getCount) {
        this.getCount = getCount;
    }

    public boolean isDumpTable() {
        return dumpTable;
    }

    public void setDumpTable(boolean dumpTable) {
        this.dumpTable = dumpTable;
    }

    public boolean isDumpAll() {
        return dumpAll;
    }

    public void setDumpAll(boolean dumpAll) {
        this.dumpAll = dumpAll;
    }

    public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }

    public boolean isGetComments() {
        return getComments;
    }

    public void setGetComments(boolean getComments) {
        this.getComments = getComments;
    }

    public boolean isGetStatements() {
        return getStatements;
    }

    public void setGetStatements(boolean getStatements) {
        this.getStatements = getStatements;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getTbl() {
        return tbl;
    }

    public void setTbl(String tbl) {
        this.tbl = tbl;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getExclude() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude = exclude;
    }

    public String getPivotColumn() {
        return pivotColumn;
    }

    public void setPivotColumn(String pivotColumn) {
        this.pivotColumn = pivotColumn;
    }

    public String getDumpWhere() {
        return dumpWhere;
    }

    public void setDumpWhere(String dumpWhere) {
        this.dumpWhere = dumpWhere;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isExcludeSysDbs() {
        return excludeSysDbs;
    }

    public void setExcludeSysDbs(boolean excludeSysDbs) {
        this.excludeSysDbs = excludeSysDbs;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart = limitStart;
    }

    public int getLimitStop() {
        return limitStop;
    }

    public void setLimitStop(int limitStop) {
        this.limitStop = limitStop;
    }

    public int getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(int firstChar) {
        this.firstChar = firstChar;
    }

    public int getLastChar() {
        return lastChar;
    }

    public void setLastChar(int lastChar) {
        this.lastChar = lastChar;
    }

    public String getSqlQuery() {
        return sqlQuery;
    }

    public void setSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    public boolean isSqlShell() {
        return sqlShell;
    }

    public void setSqlShell(boolean sqlShell) {
        this.sqlShell = sqlShell;
    }

    public String getSqlFile() {
        return sqlFile;
    }

    public void setSqlFile(String sqlFile) {
        this.sqlFile = sqlFile;
    }

    @Override
    public String toString() {
        return "Enumeration{" +
                "getAll=" + getAll +
                ", getBanner=" + getBanner +
                ", getCurrentUser=" + getCurrentUser +
                ", getCurrentDb=" + getCurrentDb +
                ", getHostname=" + getHostname +
                ", isDba=" + isDba +
                ", getUsers=" + getUsers +
                ", getPasswordHashes=" + getPasswordHashes +
                ", getPrivileges=" + getPrivileges +
                ", getRoles=" + getRoles +
                ", getDbs=" + getDbs +
                ", getTables=" + getTables +
                ", getColumns=" + getColumns +
                ", getSchema=" + getSchema +
                ", getCount=" + getCount +
                ", dumpTable=" + dumpTable +
                ", dumpAll=" + dumpAll +
                ", search=" + search +
                ", getComments=" + getComments +
                ", getStatements=" + getStatements +
                ", db='" + db + '\'' +
                ", tbl='" + tbl + '\'' +
                ", col='" + col + '\'' +
                ", exclude='" + exclude + '\'' +
                ", pivotColumn='" + pivotColumn + '\'' +
                ", dumpWhere='" + dumpWhere + '\'' +
                ", user='" + user + '\'' +
                ", excludeSysDbs=" + excludeSysDbs +
                ", limitStart=" + limitStart +
                ", limitStop=" + limitStop +
                ", firstChar=" + firstChar +
                ", lastChar=" + lastChar +
                ", sqlQuery='" + sqlQuery + '\'' +
                ", sqlShell=" + sqlShell +
                ", sqlFile='" + sqlFile + '\'' +
                '}';
    }
}
