package by.academy.it.task03.logic;

import by.academy.it.task03.entity.Student;
import by.academy.it.task03.entity.TotalTime;

public interface Estimator {
    TotalTime doEstimate(Student student);
}
