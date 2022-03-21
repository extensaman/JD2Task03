package by.academy.it.task03.logic;

import by.academy.it.task03.entity.CalculatedTime;
import by.academy.it.task03.entity.Student;
import by.academy.it.task03.entity.StudentType;
import org.apache.commons.math3.util.Precision;

public class EstimatorCreator {

    private static final int PRECISION = 2;
    public static final double MAGIC_NUMBER = 3.0;

    private static class SingletonHolder {
        private static final EstimatorCreator INSTANCE = new EstimatorCreator();
    }

    public static EstimatorCreator getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Estimator create(StudentType studentType) {
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

    private class Type01StudentEstimator implements Estimator {

        @Override
        public CalculatedTime doEstimate(Student student, int baseTime) {
            double talantLevel = student.getTalantLevel();
            double practiceTime = Precision.round(baseTime / MAGIC_NUMBER / talantLevel, PRECISION);
            double studyTime = Precision.round(baseTime / MAGIC_NUMBER / talantLevel, PRECISION);
            double searchTime = Precision.round(baseTime / MAGIC_NUMBER / talantLevel, PRECISION);
            return new CalculatedTime(practiceTime, studyTime, searchTime);
        }
    }

    private class Type02StudentEstimator implements Estimator {
        @Override
        public CalculatedTime doEstimate(Student student, int baseTime) {
            double talantLevel = student.getTalantLevel();
            double practiceTime = Precision.round(baseTime / talantLevel, PRECISION);
            double studyTime = Precision.round(baseTime / talantLevel, PRECISION);
            double searchTime = .0;
            return new CalculatedTime(practiceTime, studyTime, searchTime);
        }
    }

    private class Type03StudentEstimator implements Estimator {
        @Override
        public CalculatedTime doEstimate(Student student, int baseTime) {
            double talantLevel = student.getTalantLevel();
            double practiceTime = Precision.round(baseTime * MAGIC_NUMBER / talantLevel, PRECISION);
            double studyTime = .0;
            double searchTime = .0;
            return new CalculatedTime(practiceTime, studyTime, searchTime);
        }
    }
}
