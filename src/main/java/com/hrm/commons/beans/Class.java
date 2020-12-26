package com.hrm.commons.beans;

public class Class {
    private  String  classid;
    private String classclass;

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getClassclass() {
        return classclass;
    }

    public void setClassclass(String classclass) {
        this.classclass = classclass;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classid='" + classid + '\'' +
                ", classclass='" + classclass + '\'' +
                '}';
    }
}
