package com.hrm.commons.beans;

public class StudentMessage {
    private String sid;
    private String sname;
    private String sex;
    private String school;
    private  String sclass;
    private  String phone;
    private  String  scorecname;
    private double scoreu;
    private double scoret;
    private  double scoregrade;

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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getScorecname() {
        return scorecname;
    }

    public void setScorecname(String scorecname) {
        this.scorecname = scorecname;
    }

    public double getScoreu() {
        return scoreu;
    }

    public void setScoreu(double scoreu) {
        this.scoreu = scoreu;
    }

    public double getScoret() {
        return scoret;
    }

    public void setScoret(double scoret) {
        this.scoret = scoret;
    }

    public double getScoregrade() {
        return scoregrade;
    }

    public void setScoregrade(double scoregrade) {
        this.scoregrade = scoregrade;
    }

    @Override
    public String toString() {
        return "StudentMessage{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", school='" + school + '\'' +
                ", sclass='" + sclass + '\'' +
                ", phone='" + phone + '\'' +
                ", scorecname='" + scorecname + '\'' +
                ", scoreu=" + scoreu +
                ", scoret=" + scoret +
                ", scoregrade=" + scoregrade +
                '}';
    }
}
