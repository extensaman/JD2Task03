package by.academy.it.task03.logic;

import by.academy.it.task03.entity.CalculatedTime;
import by.academy.it.task03.entity.Student;
import org.junit.Assert;
import org.junit.Test;

import static by.academy.it.task03.entity.StudentType.TYPE01;

public class EstimatorCreatorTest extends Assert {

    @Test
    public void testEstimation() {
        Student student = new Student("00", 1.0);
        Estimator estimatorType01 = EstimatorCreator.getInstance().create(TYPE01);
        CalculatedTime calculatedTime = estimatorType01.doEstimate(student, 198);
        assertEquals("calculatedTime.getPracticeTime()", 66.0, calculatedTime.getPracticeTime(),0);
        assertEquals("calculatedTime.getSearchTime()", 66.0, calculatedTime.getSearchTime(),0);
        assertEquals("calculatedTime.getStudyTime()", 66.0, calculatedTime.getStudyTime(),0);
    }

}