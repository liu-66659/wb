package com.hrm.commons.beans;

public class CourseScore {
    private String scoreid;
    private String scoresname;
    private String scorecname;
    private String scoreu;
    private String scoret;
    private String scoregrade;

    public String getScoreid() {
        return scoreid;
    }

    public void setScoreid(String scoreid) {
        this.scoreid = scoreid;
    }

    public String getScoresname() {
        return scoresname;
    }

    public void setScoresname(String scoresname) {
        this.scoresname = scoresname;
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
        return "CourseScore{" +
                "scoreid='" + scoreid + '\'' +
                ", scoresname='" + scoresname + '\'' +
                ", scorecname='" + scorecname + '\'' +
                ", scoreu='" + scoreu + '\'' +
                ", scoret='" + scoret + '\'' +
                ", scoregrade='" + scoregrade + '\'' +
                '}';
    }
}
