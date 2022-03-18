package by.academy.it.task03.entity;

import java.util.Objects;
import java.util.Random;

public class Student {
    private final String id;
    private StudentType studentType;
    private final double talantLevel;

    public Student(String id, StudentType studentType, double talantLevel) {
        this.id = id;
        this.studentType = studentType;
        this.talantLevel = talantLevel;
    }

    public Student(String id, StudentType studentType) {
        this.id = id;
        this.studentType = studentType;
        this.talantLevel = new Random().nextInt(10) / 10.0 + 0.1;
    }

    public String getId() {
        return id;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    public double getTalantLevel() {
        return talantLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.talantLevel, talantLevel) == 0 &&
                Objects.equals(id, student.id) &&
                studentType == student.studentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentType, talantLevel);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", studentType=" + studentType +
                ", talantLevel=" + talantLevel +
                '}';
    }
}
