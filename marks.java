package Task2;

//STUDENT GRADE CALCULATOR....

import java.util.Scanner;
public class marks {
    public static void main(String[] args) {

        // Create a Scanner object to read user input.
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of subjects.
        System.out.println("Enter the number of subjects to be asked by the user: ");
        int numberOfSubjects = sc.nextInt();

        // Create an array to store the marks obtained in each subject by student
        int[] marks = new int[numberOfSubjects];

        // ASK the user to enter the marks obtained in each subject

        for (int i = 0; i < numberOfSubjects; i++) {


            System.out.println("Enter the marks obtained out of 100 in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }


        // Calculate the total marks obtained
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        // Calculate the average percentage
        float averagePercentage = (float) totalMarks / numberOfSubjects;

        // Assign a grade based on the average percentage of marks
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results of obtained marks
        System.out.println("Total marks obtained: " + totalMarks+"/"+(numberOfSubjects*100));
        System.out.println("Average percentage obtained: " + averagePercentage);
        System.out.println("Grade obtained: " + grade);
        sc.close();
    }
}


