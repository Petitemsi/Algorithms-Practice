import java.lang.*;
public class LabTwoSolutionsApp
{
	public static void main(String args[])
	{
		LabTwoSolutions t2s = new LabTwoSolutions();

		

		// System.out.println("Concatenated digits solution");
		// System.out.println("***********************************************************");
		// String concatWord = t2s.concatDigits(2);
		// System.out.println(concatWord);


		System.out.println("Registration Plate solution");
		System.out.println("***********************************************************");
		String plateNumbers = t2s.plateNumber();
		System.out.println(plateNumbers);

		// System.out.println("Team-winner solution");
		// System.out.println("***********************************************************");
		// System.out.println (" the winner is: "  + t2s.eliminateHalf(100));
	}
}