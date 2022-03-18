package by.academy.it.task03.logic;

import by.academy.it.task03.entity.Student;
import by.academy.it.task03.entity.StudentType;
import by.academy.it.task03.entity.TotalTime;

import static by.academy.it.task03.App.BASE_TIME;

public class EstimatorCreator {
    // need Singleton

    public static Estimator create (StudentType studentType) {
        switch (studentType) {
            case TYPE01:
                return new Type01StudentEstimator();
            case TYPE02:
                return new Type02StudentEstimator();
            case TYPE03:
                return new Type03StudentEstimator();
            default:
                throw new IllegalArgumentException();
        }
    }

    private static class Type01StudentEstimator implements Estimator{
        @Override
        public TotalTime doEstimate(Student student) {
            double talantLevel = student.getTalantLevel();
            double practiceTime = BASE_TIME / 3.0 / talantLevel;
            double studyTime = BASE_TIME / 3.0 / talantLevel;
            double searchTime = BASE_TIME / 3.0 / talantLevel;
            return new TotalTime(practiceTime, studyTime, searchTime);
        }
    }

    private static class Type02StudentEstimator implements Estimator{
        @Override
        public TotalTime doEstimate(Student student) {
            double talantLevel = student.getTalantLevel();
            double practiceTime = BASE_TIME / talantLevel;
            double studyTime = BASE_TIME / talantLevel;
            double searchTime = .0;
            return new TotalTime(practiceTime, studyTime, searchTime);
        }
    }

    private static class Type03StudentEstimator implements Estimator{
        @Override
        public TotalTime doEstimate(Student student) {
            double talantLevel = student.getTalantLevel();
            double practiceTime = BASE_TIME * 3.0 / talantLevel;
            double studyTime = .0;
            double searchTime = .0;
            return new TotalTime(practiceTime, studyTime, searchTime);
        }
    }
}
