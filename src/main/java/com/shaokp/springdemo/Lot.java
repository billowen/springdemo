package com.shaokp.springdemo;

import java.util.Date;

public class Lot {
    private String lotName = "";
    private Long testTime = (new Date()).getTime();
    private Integer dieNum = 0;
    private Integer passCnt = 0;
    private Double yield = 0.0;

    public Lot(String lotName, Integer dieNum, Integer passCnt, Double yield) {
        this.lotName = lotName;
        this.dieNum = dieNum;
        this.passCnt = passCnt;
        this.yield = yield;
    }

    public String getLotName() {
        return lotName;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public Long getTestTime() {
        return testTime;
    }

    public void setTestTime(Long testTime) {
        this.testTime = testTime;
    }

    public Integer getDieNum() {
        return dieNum;
    }

    public void setDieNum(Integer dieNum) {
        this.dieNum = dieNum;
    }

    public Integer getPassCnt() {
        return passCnt;
    }

    public void setPassCnt(Integer passCnt) {
        this.passCnt = passCnt;
    }

    public Double getYield() {
        return yield;
    }

    public void setYield(Double yield) {
        this.yield = yield;
    }
}
