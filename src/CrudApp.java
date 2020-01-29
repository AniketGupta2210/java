import java.util.Scanner;


public class CrudApp {

	public static void main(String[] args) {
		
		
		while(true) {
		System.out.println("What do want to do : ");
		System.out.println("Press 1 to create an Employee");
		System.out.println("Press 2 to retrive data of an Employee");
		System.out.println("Press 3 to update data of an Employee");
		System.out.println("Press 4 to delte data of an Employee");
		
		
		Scanner sc = new Scanner(System.in);
		int key = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number of employees");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("You have " + empNo + " employees");
		
		CreateEmp[] employee= new CreateEmp[empNo];
		
		switch (key) {
		case 1:
			
			
			
			int i=0;
			
			
			for(i=0;i<empNo;i++) {
				
				employee[i]= new CreateEmp();
				
				System.out.println("Enter dept of employee");
				employee[i].setEmpDept(sc.nextLine());

				System.out.println("Enter ID of employee");
				employee[i].setEmpID(Integer.parseInt(sc.nextLine()));

				System.out.println("Enter name of employee");
				employee[i].setEmpName((sc.nextLine()));

				System.out.println("Enter Project of employee");
				employee[i].setEmpProject((sc.nextLine()));
				
				System.out.println(employee[i]);
			}

			break ;

		case 2:
			System.out.println("Enter empolyee ID to retrive");
			int reqID=Integer.parseInt(sc.nextLine());
			for(int j=0;j<empNo;j++) {
			if(reqID==employee[j].getEmpID()) {
				System.out.println("ID found");
				System.out.println(employee[j]);
			}
			else
				System.out.println("No such ID");
			}
			
		case 4:
			System.out.println("Enter empolyee ID to delete");
			int reqIDtwo=Integer.parseInt(sc.nextLine());
			for(int j=0;j<empNo;j++) {
			if(reqIDtwo==employee[j].getEmpID()) {
				System.out.println("ID found");
				System.out.println(employee[j]);
				
			}
			else
				System.out.println("No such ID");
			}
			
			
				}
		}

		
				
		}
	}





class CreateEmp {

	String empDept;
	int empID;
	String empName;
	String empProject;
	

	@Override
	public String toString() {
		return "CreateEmp [empDept=" + empDept + ", empID=" + empID + ", empName=" + empName + ", empProject="
				+ empProject + "]";
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpProject() {
		return empProject;
	}

	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}

}

