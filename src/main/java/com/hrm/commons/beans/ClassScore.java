package com.hrm.commons.beans;

public class ClassScore {
    private String classid;//
    private String sclass;
    private double scoreu;
    private double scoreuaverage;//平时成绩平均值
    private double scoret;
    private double scoretaverage;//期末试题成绩平均分
    private double scoregrade;//总成绩总分
    private double scoregradeaverage;//总成绩总分

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public double getScoreu() {
        return scoreu;
    }

    public void setScoreu(double scoreu) {
        this.scoreu = scoreu;
    }

    public double getScoreuaverage() {
        return scoreuaverage;
    }

    public void setScoreuaverage(double scoreuaverage) {
        this.scoreuaverage = scoreuaverage;
    }

    public double getScoret() {
        return scoret;
    }

    public void setScoret(double scoret) {
        this.scoret = scoret;
    }

    public double getScoretaverage() {
        return scoretaverage;
    }

    public void setScoretaverage(double scoretaverage) {
        this.scoretaverage = scoretaverage;
    }

    public double getScoregrade() {
        return scoregrade;
    }

    public void setScoregrade(double scoregrade) {
        this.scoregrade = scoregrade;
    }

    public double getScoregradeaverage() {
        return scoregradeaverage;
    }

    public void setScoregradeaverage(double scoregradeaverage) {
        this.scoregradeaverage = scoregradeaverage;
    }

    @Override
    public String toString() {
        return "ClassScore{" +
                "classid='" + classid + '\'' +
                ", sclass='" + sclass + '\'' +
                ", scoreu=" + scoreu +
                ", scoreuaverage=" + scoreuaverage +
                ", scoret=" + scoret +
                ", scoretaverage=" + scoretaverage +
                ", scoregrade=" + scoregrade +
                ", scoregradeaverage=" + scoregradeaverage +
                '}';
    }
}
