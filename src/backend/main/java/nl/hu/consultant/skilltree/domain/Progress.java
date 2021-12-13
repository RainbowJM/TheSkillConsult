package nl.hu.consultant.skilltree.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Progress {
    @Id
    @GeneratedValue
    private int id;
    private int totalPoints;
    private int point;
    private int student_id;

/*
    @OneToOne
    @JoinColumn
    private User id ;

 */

    public Progress(int id, int totalPoints, int point, int student_id) {
        this.id = id;
        this.totalPoints = totalPoints;
        this.point = point;
        this.student_id = student_id;
    }

    public Progress() {
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

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

}
