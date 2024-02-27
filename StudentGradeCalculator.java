import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];
        double totalScore = 0;

        // Input scores
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            totalScore += scores[i];
        }

        // Calculate average grade
        double averageGrade = totalScore / numStudents;

        System.out.println("Average grade: " + averageGrade);

        // Determine grade based on average
        char grade;
        if (averageGrade >= 90) {
            grade = 'A';
        } else if (averageGrade >= 80) {
            grade = 'B';
        } else if (averageGrade >= 70) {
            grade = 'C';
        } else if (averageGrade >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
