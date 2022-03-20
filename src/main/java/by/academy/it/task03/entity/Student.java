package by.academy.it.task03.entity;

import org.apache.commons.math3.util.Precision;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

public class Student implements Serializable {
    private final String id;
    private final double talantLevel;

    public Student(String id, double talantLevel) {
        this.id = id;
        this.talantLevel = talantLevel;
    }

    public Student() {
        this.id = "00";
        this.talantLevel = 0.0;

    }

    public Student(String id) {
        this.id = id;
        this.talantLevel = Precision.round(new Random().nextInt(10) / 10.0 + 0.1, 2);
    }

    public String getId() {
        return id;
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
                Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, talantLevel);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", talantLevel=" + talantLevel +
                '}';
    }
}
