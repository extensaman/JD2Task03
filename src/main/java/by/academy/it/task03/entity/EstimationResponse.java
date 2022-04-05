package by.academy.it.task03.entity;

import java.io.Serializable;
import java.util.Objects;

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

    public EstimationResponse() {
        this.student = new Student("00");
        this.studentType = null;
        this.calculatedTime = null;
        this.fullTume = 0.0;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstimationResponse that = (EstimationResponse) o;
        return Double.compare(that.fullTume, fullTume) == 0 &&
                Objects.equals(student, that.student) &&
                studentType == that.studentType &&
                Objects.equals(calculatedTime, that.calculatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, studentType, calculatedTime, fullTume);
    }

    @Override
    public String toString() {
        return "EstimationResponse{" +
                "student=" + student +
                ", studentType=" + studentType +
                ", calculatedTime=" + calculatedTime +
                ", fullTume=" + fullTume +
                '}';
    }
}
