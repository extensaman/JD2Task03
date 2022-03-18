package by.academy.it.task03.entity;

import java.util.Objects;

public class TotalTime {
    private final double practiceTime;
    private final double studyTime;
    private final double searchTime;

    public TotalTime(double practiceTime, double studyTime, double searchTime) {
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
        TotalTime totalTime = (TotalTime) o;
        return Double.compare(totalTime.practiceTime, practiceTime) == 0 &&
                Double.compare(totalTime.studyTime, studyTime) == 0 &&
                Double.compare(totalTime.searchTime, searchTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(practiceTime, studyTime, searchTime);
    }

    @Override
    public String toString() {
        return "TotalTime{" +
                "practiceTime=" + practiceTime +
                ", studyTime=" + studyTime +
                ", searchTime=" + searchTime +
                '}';
    }
}
