package ASSESSMENT;

import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private Double[] scores;

    public Student(){}

    public Student(String firstName, String lastName, Double[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;

    }

    public String toString(){
        return "{firstName= " + firstName + " lastName= " + lastName + " scores= " + Arrays.toString(scores);
    }

    public double totalScores(Double[] scores) {
        int sum = 0;
        for (int x = 0; x < scores.length; x++) {
            sum += scores[x];
        }
        return sum;
    }

    public double calculateAverageGrade(Double[] scores) {
        //calculate sum of all array elements
        int sum = 0;
        for(int x=0; x<scores.length; x++)
            sum += scores[x];
        return (double) sum / (double) scores.length;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double[] getScores() {
        return scores;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
