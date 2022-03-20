package by.academy.it.task03.entity;

import java.io.Serializable;
import java.util.Objects;

public class CalculatedTime implements Serializable {
    private final double practiceTime;
    private final double studyTime;
    private final double searchTime;

    public CalculatedTime(double practiceTime, double studyTime, double searchTime) {
        this.practiceTime = practiceTime;
        this.studyTime = studyTime;
        this.searchTime = searchTime;
    }

    public double getPracticeTime() {
        return practiceTime;
    }

    public double getStudyTime() {
        return studyTime;
    }

    public double getSearchTime() {
        return searchTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatedTime calculatedTime = (CalculatedTime) o;
        return Double.compare(calculatedTime.practiceTime, practiceTime) == 0 &&
                Double.compare(calculatedTime.studyTime, studyTime) == 0 &&
                Double.compare(calculatedTime.searchTime, searchTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(practiceTime, studyTime, searchTime);
    }

    @Override
    public String toString() {
        return "CalculatedTime{" +
                "practiceTime=" + practiceTime +
                ", studyTime=" + studyTime +
                ", searchTime=" + searchTime +
                '}';
    }
}
