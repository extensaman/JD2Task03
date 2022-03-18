package by.academy.it.task03;

/**
 * Make a maven project.
 * Write unit tests for classes.
 * Compile, build jar.
 * Run jar from a command line.
 *
 * Push your project to git in a separate branch.
 * Make a pull request.
 *
 * Given:
 * There are three types of students:
 * Type 1 - they do analyzes, the practical part and are in the flow;
 * Type 2 - do only the practical part and analyzes;
 * Type 3 - do only the practical part.
 *
 * Students have a talent: a value from 0.1 to 1. Talent affects the speed of mastering the skill.
 * For example, if it takes 22 hours to master a driving skill, then
 * a student with talent 1 will spend 22 hours
 * a student with a talent of 0.1 will spend 22/0.1 = 220 hours,
 * a student with a talent of 0.5 will spend 22/0.5 = 44 hours,
 * a student with a talent of 0.8 will spend 22/0.8 = 27.5 hours.
 *
 * It is believed that type 1 students master the material in the time that needs to be spent on mastering.
 * Type 2 students master the material twice as long.
 * Type 3 students master the material three times longer.
 * For example, if it takes 22 hours to master a driving skill, then
 * Type 1 student will spend 22 hours (22/3 = 7.3; 7.3 hours for analysis, 7.3 hours for practice, 7.3 hours for being in the flow).
 * Type 2 student spend 22 x 2 = 44 hours (44/2 = 22; 22 hours for practice, 22 hours for analysis).
 * Type 3 student will spend 22 x 3 = 66 hours (66 hours for practice).
 *
 * Task:
 * A type 1 student with talent 1 needs to spend 66 hours on acquiring a practical skill in java core
 * (Total 198 hours for the full java course).
 * It is necessary to calculate for each student the time spent on learning java in the class
 * (display the type of student, his talent, the time required for analysis, practice,
 * being in the flow and the total time to master the skill).
 * There are 9 students in the class (3 students of each type).
 * The talent is given randomly.
 * Use a pattern strategy.
 *
 *  @author Yusikau Aliaksandr
 *  @version 1.0
 */

public class App 
{
    public static final int BASE_TIME = 198;

    public static void main(String[] args )
    {
        System.out.println("Привет!");
    }
}
