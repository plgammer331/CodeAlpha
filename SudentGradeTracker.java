import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");

        int NumOfStduents = scanner.nextInt();
        while (NumOfStduents == 0) {
            System.out.println("Invalid: Enter Number of Students: ");
            NumOfStduents = scanner.nextInt();
        }
        double[] students = new double[NumOfStduents];
        double maxGrade = Double.MIN_VALUE;
        double minGrade = Double.MAX_VALUE;
        double sum = 0;
        System.out.println("Enter their grades");
        for (int i = 0; i < NumOfStduents; i++) {
            System.out.print("Student[" + (i + 1) + "]:");
            students[i] = scanner.nextDouble();
            sum += students[i];
            if (students[i] > maxGrade) {
                maxGrade = students[i];
            } else if (students[i] < minGrade) {
                minGrade = students[i];
            }

        }

        double avg = sum / NumOfStduents;
        System.out.println("Average Grade: " + avg);
        System.out.println("Highest Grade: " + maxGrade);
        System.out.println("Lowest Grade: " + minGrade);
    }
}