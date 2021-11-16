package nl.hu.consultant.skilltree;

import nl.hu.consultant.security.User;

import java.util.Date;
import java.util.List;

public class Student extends User {
    private Gender gender;
    private Date birthday;
    private String priorEducation;
    private int yearOfStudy;
    private String nationality;
    private String parentNationality;
    private String parentOccupation;
    private List<String> previousInternationalExperience;
    private List<String> languages;
    private Class classStudent;

    public Student(int id, String username, String password, String firstName, String lastName, Gender gender, Date birthday, String priorEducation, int yearOfStudy, String nationality, String parentNationality, String parentOccupation, List<String> previousInternationalExperience, List<String> languages, Class classStudent) {
        super(id, username, password, firstName, lastName);
        this.gender = gender;
        this.birthday = birthday;
        this.priorEducation = priorEducation;
        this.yearOfStudy = yearOfStudy;
        this.nationality = nationality;
        this.parentNationality = parentNationality;
        this.parentOccupation = parentOccupation;
        this.previousInternationalExperience = previousInternationalExperience;
        this.languages = languages;
        this.classStudent = classStudent;
    }

    public Student(int id, String username, String password, String firstName, String lastName) {
        super(id, username, password, firstName, lastName);
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

    public String getParentNationality() {
        return parentNationality;
    }

    public void setParentNationality(String parentNationality) {
        this.parentNationality = parentNationality;
    }

    public String getParentOccupation() {
        return parentOccupation;
    }

    public void setParentOccupation(String parentOccupation) {
        this.parentOccupation = parentOccupation;
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

    public Class getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(Class classStudent) {
        this.classStudent = classStudent;
    }
}
