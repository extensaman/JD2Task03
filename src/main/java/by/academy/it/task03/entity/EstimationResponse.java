package by.academy.it.task03.entity;

import java.io.Serializable;

public class EstimationResponse implements Serializable {
    private final Student student;
    private final StudentType studentType;
    private final CalculatedTime calculatedTime;
    private final double fullTume;

    public EstimationResponse(Student student, StudentType studentType, CalculatedTime calculatedTime, double fullTume) {
        this.student = student;
        this.studentType = studentType;
        this.calculatedTime = calculatedTime;
        this.fullTume = fullTume;
    }

    public Student getStudent() {
        return student;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public CalculatedTime getCalculatedTime() {
        return calculatedTime;
    }

    public double getFullTume() {
        return fullTume;
    }
}
