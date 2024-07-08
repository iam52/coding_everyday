import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalGradePoints = 0;
        double totalCredits = 0;
        
        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();
            
            if (!grade.equals("P")) {
                totalCredits += credit;
                totalGradePoints += credit * getGradePoint(grade);
            }
        }
        System.out.printf("%.6f", totalGradePoints / totalCredits);
    }
    
    private static double getGradePoint(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            default: return 0.0;
        }
    }
}