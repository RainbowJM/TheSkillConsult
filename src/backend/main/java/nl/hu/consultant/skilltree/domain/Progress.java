package nl.hu.consultant.skilltree.domain;

import java.util.List;

public class Progress {
    private int id;
    private int totalPoints;
    private int point;
    private List<Skill> skills;

    public Progress(int id, int totalPoints, int point, List<Skill> skills) {
        this.id = id;
        this.totalPoints = totalPoints;
        this.point = point;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}