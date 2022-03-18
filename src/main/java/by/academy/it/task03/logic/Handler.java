package by.academy.it.task03.logic;

import by.academy.it.task03.entity.Student;
import by.academy.it.task03.entity.TotalTime;

import java.util.ArrayList;
import java.util.List;

public class Handler {
    //Need Singleton

    public List<String> handle(List<Student> studentList) {
        List<String> result = new ArrayList<>();

        for (Student student : studentList) {
            StringBuilder stringBuilder = new StringBuilder();
            Estimator estimator = EstimatorCreator.create(student.getStudentType());
            TotalTime totalTime = estimator.doEstimate(student);
            double practiceTime = totalTime.getPracticeTime();
            double studyTime = totalTime.getStudyTime();
            double searchTime = totalTime.getSearchTime();
            stringBuilder.append(student.getId()).append(' ')
                    .append(student.getStudentType()).append(' ')
                    .append(student.getTalantLevel()).append(' ')
                    .append(practiceTime).append(' ')
                    .append(studyTime).append(' ')
                    .append(searchTime).append(' ')
                    .append(practiceTime + studyTime + searchTime);
            result.add(stringBuilder.toString());
        }
        return result;
    }

}
