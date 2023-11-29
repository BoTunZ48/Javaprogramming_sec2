import java.util.*;
public class PensionContributionCalulator {

	public static void main(String[] args) {
				
		
		final int SALARY_CEILING = 6000;
		
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		
		final double EMPLOYEE_RATE_65_TO_ABOVE = 0.05;
		
		final double EMPLOYER_RATE_65_TO_ABOVE = 0.075;
		
		int salary, age;
		int contributtableSalary;
		double employeeContribution, employerContribution, totalContribution;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the mouthly salary : ");
		salary = scan.nextInt();
		System.out.print("Enter the age : ");
		age = scan.nextInt();
		
		contributtableSalary = Math.min(salary, SALARY_CEILING);
		
		if (age <= 55) 
		{
			employeeContribution = contributtableSalary *EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = contributtableSalary *EMPLOYER_RATE_55_AND_BELOW;
		}
		else if(age <= 60) 
		{
			employeeContribution = contributtableSalary *EMPLOYEE_RATE_55_TO_60;
			employerContribution = contributtableSalary *EMPLOYER_RATE_55_TO_60;
		}
		else if(age <= 65) 
		{
			employeeContribution = contributtableSalary *EMPLOYEE_RATE_60_TO_65;
			employerContribution = contributtableSalary *EMPLOYER_RATE_60_TO_65;
		}
		else 
		{
			employeeContribution = contributtableSalary *EMPLOYEE_RATE_65_TO_ABOVE;
			employerContribution = contributtableSalary *EMPLOYER_RATE_65_TO_ABOVE;
		}
		totalContribution = employerContribution+employeeContribution;
		System.out.printf("The employee's contribution is: %.2f\n",employeeContribution);
		System.out.printf("The employer's contribution is: %.2f\n",employerContribution);
		System.out.printf("The total contribution is: %.2f\n",totalContribution);
		
				

	}

}
