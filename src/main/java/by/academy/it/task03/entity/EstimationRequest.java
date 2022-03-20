package by.academy.it.task03.entity;

import java.io.Serializable;
import java.util.Objects;

public class EstimationRequest implements Serializable {

    private final Student student;
    private final StudentType studentType;

    public EstimationRequest(Student student, StudentType studentType) {
        this.student = student;
        this.studentType = studentType;
    }

    public EstimationRequest(){
        this.student = new Student();
        this.studentType = null;
    }
    public Student getStudent() {
        return student;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstimationRequest that = (EstimationRequest) o;
        return Objects.equals(student, that.student) &&
                studentType == that.studentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, studentType);
    }
}
