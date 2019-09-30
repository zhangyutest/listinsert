package com.winterchen.model;


import lombok.Data;

@Data
public class Pm {
    private int id;
    private String page;
    private String curTime;
    private String pssTotal;
    private String privateDirty;
    private String privateClean;
    private String swapPssDirty;
    private String heapSize;
    private String heapAlloc;
    private String heapFree;
    private String viewNo;
    private String activityNo;
    private String curPid;
    private String logPath;
    private String hprofPath;
    private int isPass;
    private String machineName;
    private String checkDate;
    private String checkTime;



}
