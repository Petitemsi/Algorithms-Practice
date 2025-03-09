import java.io.File;
import java.util.*;

public class ReadStaffData {

	public static void main(String[] args) throws Exception{
		//parsing and reading the CSV file data into the film (object) array
		// provide the path here...
        File directory = new File("./");
  		String name = directory.getAbsolutePath() + "//Staff.csv";
		Scanner sc = new Scanner(new File(name));
		Staff[] staffs = new Staff[10000];

		// this will just print the header in CSV file
		sc.nextLine();

		int i = 0; String st = "";
		while (sc.hasNextLine())  //returns a boolean value
		{
			st = sc.nextLine();
			String[] data = st.split(",");
			staffs[i++] = new Staff(Integer.parseInt(data[0]), data[1], data[2], data[3], Float.parseFloat(data[4]), Float.parseFloat(data[5]));
		}
		sc.close();  //closes the scanner

		// We can print film details due to overridden toString method in film class
		System.out.println(staffs[0]);
		System.out.println(staffs[1]);

		// we can compare films based on their ID due to overridden CompareTo method in film class
		System.out.println(staffs[0]==staffs[0]);
		System.out.println(staffs[0]==staffs[1]);
	}

}


class Staff implements Comparable<Object>{

	private int empNo;
	private String fName;
	private String sName;
	private String department;
	private float wage;
	private float projectCompletionRate;


	// constructor
	public Staff(int empNo, String fName, String sName, String department, float wage, float projectCompletionRate) {
		super();
		this.empNo = empNo;
		this.fName= fName;
		this.sName= sName;
		this.department= department;
		this.wage = wage;
		this.projectCompletionRate = projectCompletionRate;
	}

	// setters and getters
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getFName() {
		return fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String sName) {
		this.sName = sName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getProjectCompletionRate() {
		return projectCompletionRate;
	}

	public void setProjectCompletionRate(float projectCompletionRate) {
		this.projectCompletionRate = projectCompletionRate;
	}

	public float getWage(){
		return wage;
	}

	public void setWage(float wage){
		this.wage = wage;
	}

		// so the film objects can be compared when sorting/searching
	// NOTE: this will only allow comparisons based on the title of the film
	@Override
	public int compareTo(Object obj) {

		/*
		Edit this section so it compares the appropriate
		column you wish to sort by
		*/

		Staff sff = (Staff)obj;
		return empNo - (sff.getEmpNo());
	}

	@Override
	public String toString() {
		return "Staff [EmpNo=" + empNo + ", first name=" + fName+ ", last Name=" + sName+ ", department="
				+ department+  ", wage=" + wage+ ", project completion rate="
				+ projectCompletionRate+ "]";
	}



}