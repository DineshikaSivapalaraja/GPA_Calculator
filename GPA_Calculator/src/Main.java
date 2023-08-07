import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to GPA Calculator!!!\n");
		
		Scanner scanner = new Scanner(System.in);
		Double totalPoints = 0.0;
		Integer totalCredits = 0;
		
		boolean furtherCourses = false;
		
		do {
		
			boolean validCredits = true;//false;
			Integer credits = 0;
			do {
				
				 validCredits = true;
				 
			     System.out.print("Enter number of credits: ");  //println-> credit will show in next line
			     String creditsString = scanner.nextLine();
			     
			     try {
				      credits = Integer.parseInt(creditsString);
			     }catch (NumberFormatException nfe) {
				       System.out.println("Enter Valid Integer\n");
				       validCredits = false;
				 }
			}
			while (!validCredits);//(validCredits == false);
			
			
			boolean validGrade = true;
	//		System.out.print("Enter grade            : ");
	//		String grade = scanner.nextLine();
			String grade = "";
			Double gradeValue = 0.0;
			
			do {
			  validGrade = true;
			  System.out.print("Enter grade: ");
	          grade = scanner.nextLine();
			  
			  if (grade.equalsIgnoreCase("A+") || (grade.equalsIgnoreCase("A"))) { //.equalsIgnoreCase-> for allow A,a without case sensitive
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
				System.out.println("Grade is not Valid\n");		
			    validGrade = false;
			  }
			}
			while(!validGrade);
			
			Double points = gradeValue * credits;//Double.parseDouble(credits);
		    
			totalPoints += points;
			totalCredits += credits;
			
			System.out.print("IF you like to enter another course? (Y/N)?");
			String furtherCoursesString = scanner.nextLine();
			
			furtherCourses = furtherCoursesString.equalsIgnoreCase("Y");
		}
		while(furtherCourses);
		
		Double gpa = totalPoints / totalCredits;
		String formGpa = String.format("%.2f", gpa);
		
		//Double points = gradeValue * credits;//Double.parseDouble(credits);
		//Double gpa = points / credits;//Double.parseDouble(credits);
		
		System.out.println("\n");
		System.out.println("Total number of Credits:" + totalCredits);//credits);//creditsString
		//System.out.println("Grade  :" + grade);
		System.out.println("Total number of Points :" + totalPoints); //points);
		
		System.out.println("Your GPA is   :" +formGpa);
		
		scanner.close();
				

	}

}
