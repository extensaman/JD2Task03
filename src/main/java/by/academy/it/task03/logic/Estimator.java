package by.academy.it.task03.logic;

import by.academy.it.task03.entity.Student;
import by.academy.it.task03.entity.CalculatedTime;

public interface Estimator {
    CalculatedTime doEstimate(Student student, int baseTime);
}
