package com.hrm.commons.beans;

public class StudentScore {
    private String sid;
    private String sname;
    private String sex;
    private String sclass;
    private String scorecname;
    private String scoreu;
    private String scoret;
    private String scoregrade;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getScorecname() {
        return scorecname;
    }

    public void setScorecname(String scorecname) {
        this.scorecname = scorecname;
    }

    public String getScoreu() {
        return scoreu;
    }

    public void setScoreu(String scoreu) {
        this.scoreu = scoreu;
    }

    public String getScoret() {
        return scoret;
    }

    public void setScoret(String scoret) {
        this.scoret = scoret;
    }

    public String getScoregrade() {
        return scoregrade;
    }

    public void setScoregrade(String scoregrade) {
        this.scoregrade = scoregrade;
    }

    @Override
    public String toString() {
        return "StudentScore{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", sclass='" + sclass + '\'' +
                ", scorecname='" + scorecname + '\'' +
                ", scoreu='" + scoreu + '\'' +
                ", scoret='" + scoret + '\'' +
                ", scoregrade='" + scoregrade + '\'' +
                '}';
    }
}
