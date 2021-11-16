package nl.hu.consultant.skilltree;

import java.util.List;

public class Class {
    private int id;
    private String className;
    private List<Student> students;
    private Teacher teacher;

    public Class(int id, String className, List<Student> students, Teacher teacher) {
        this.id = id;
        this.className = className;
        this.students = students;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
