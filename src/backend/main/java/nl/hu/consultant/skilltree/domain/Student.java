package nl.hu.consultant.skilltree.domain;

import nl.hu.consultant.security.domain.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Date birthday;
    private String priorEducation;
    private int yearOfStudy;
    private String nationality;
    private String parentOneNationality;
    private String parentTwoNationality;
    private String parentOneOccupation;
    private String parentTwoOccupation;

    @ElementCollection
    private List<String> previousInternationalExperience;

    @ElementCollection
    private List<String> languages;

    @OneToOne
    private Group groupStudent;

    @Transient
    private User user;

    public Student(int id, Gender gender, Date birthday, String priorEducation, int yearOfStudy, String nationality,
                   String parentOneNationality, String parentTwoNationality, String parentOneOccupation, String parentTwoOccupation, List<String> previousInternationalExperience, List<String> languages, Group groupStudent, User user) {
        this.id = id;
        this.gender = gender;
        this.birthday = birthday;
        this.priorEducation = priorEducation;
        this.yearOfStudy = yearOfStudy;
        this.nationality = nationality;
        this.parentOneNationality = parentOneNationality;
        this.parentTwoNationality = parentTwoNationality;
        this.parentOneOccupation = parentOneOccupation;
        this.parentTwoOccupation = parentTwoOccupation;
        this.previousInternationalExperience = previousInternationalExperience;
        this.languages = languages;
        this.groupStudent = groupStudent;
        this.user = user;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPriorEducation() {
        return priorEducation;
    }

    public void setPriorEducation(String priorEducation) {
        this.priorEducation = priorEducation;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getParentOneNationality() {
        return parentOneNationality;
    }

    public void setParentOneNationality(String parentOneNationality) {
        this.parentOneNationality = parentOneNationality;
    }

    public String getParentTwoNationality() {
        return parentTwoNationality;
    }

    public void setParentTwoNationality(String parentTwoNationality) {
        this.parentTwoNationality = parentTwoNationality;
    }

    public String getParentOneOccupation() {
        return parentOneOccupation;
    }

    public void setParentOneOccupation(String parentOneOccupation) {
        this.parentOneOccupation = parentOneOccupation;
    }

    public String getParentTwoOccupation() {
        return parentTwoOccupation;
    }

    public void setParentTwoOccupation(String parentTwoOccupation) {
        this.parentTwoOccupation = parentTwoOccupation;
    }

    public List<String> getPreviousInternationalExperience() {
        return previousInternationalExperience;
    }

    public void setPreviousInternationalExperience(List<String> previousInternationalExperience) {
        this.previousInternationalExperience = previousInternationalExperience;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Group getGroupStudent() {
        return groupStudent;
    }

    public void setGroupStudent(Group groupStudent) {
        this.groupStudent = groupStudent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}