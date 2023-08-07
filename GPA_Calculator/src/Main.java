import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to GPA Calculator!!!\n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of credits:");
		String credits = scanner.nextLine();
		
		System.out.println("Enter grade:");
		String grade = scanner.nextLine();
		
		Double gradeValue = 0.0;
		if (grade.equalsIgnoreCase("A+")) { //.equalsIgnoreCase-> for allow A,a without case sensitive
			gradeValue = 4.0;
		}else if (grade.equalsIgnoreCase("A")) {
			gradeValue = 4.0;
		}else if (grade.equalsIgnoreCase("A-")) {
			gradeValue = 3.7;
		}else if (grade.equalsIgnoreCase("B+")) {
			gradeValue = 3.3;
		}else if (grade.equalsIgnoreCase("B")) {
			gradeValue = 3.0;
		}else if (grade.equalsIgnoreCase("B-")) {
			gradeValue = 2.7;
		}else if (grade.equalsIgnoreCase("C+")) {
			gradeValue = 2.4;
		}else if (grade.equalsIgnoreCase("C")) {
			gradeValue = 2.0;
		}else if (grade.equalsIgnoreCase("C-")) {
			gradeValue = 1.7;
		}else if (grade.equalsIgnoreCase("D+")) {
			gradeValue = 1.3;
		}else if (grade.equalsIgnoreCase("D")) {
			gradeValue = 1.0;
		}else if (grade.equalsIgnoreCase("E")) {
			gradeValue = 0.0;
		}else {
			System.out.println("Grade is not Valid");		
		}
		
		Double points = gradeValue * Double.parseDouble(credits);
		Double gpa = points / Double.parseDouble(credits);
		
		System.out.println("\n");
		System.out.println("Credits:" + credits);
		System.out.println("Grade  :" + grade);
		System.out.println("Points :" + points);
		
		System.out.println("GPA    :" +gpa);
		
		scanner.close();
				

	}

}
