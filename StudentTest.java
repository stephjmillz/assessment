package ASSESSMENT;

import java.util.Arrays;

public class StudentTest {

    public static void main(String[] args) {

        Double[]scores = new Double[]{69.0, 78.0, 88.0};

        Student student1 = new Student("Mike", "Jones", scores);

        System.out.println(student1.toString());


        System.out.println("Mike's scores are: " + Arrays.toString(scores));
        System.out.println("Mike's total score is: " + student1.totalScores(scores));
        System.out.println("Mike's average score is: " + student1.calculateAverageGrade(scores));



    }
}
