package ArrayDemos;

public class ArrayOfEmployee {
	int empid;
	String empname;
	double salary;
	static String companyname;
	
	static{
		companyname="TCS private limited";
	}
	
	ArrayOfEmployee(){
		empid=101;
		empname="Rajesh dere";
		salary=25000.0;
	}
	
	ArrayOfEmployee(int eid,String enm,double sal){
		this.empid=eid;
		this.empname=enm;
		this.salary=sal;
	}
	
	public static void show() {
		System.out.println("Company Name: "+companyname);
	}
	
	public void display() {
		System.out.println("Details Of Company Employees :- "+"\n"+"Employee Id: "+empid+"\n"+"Employee Name: "+empname+"\n"+"Employee salary: "+salary);
	}
	
	
	

	public static void main(String[] args) {
		ArrayOfEmployee arr1[];
		arr1=new ArrayOfEmployee[10]; 
		
		arr1[0]=new ArrayOfEmployee();//default constructor called
		arr1[0].display();
		ArrayOfEmployee.show();
		System.out.println("\n");
		
		arr1[1]=new ArrayOfEmployee(102,"vedant lad",45000.0);
		arr1[1].display();
		ArrayOfEmployee.show();
		System.out.println("\n");
		
		arr1[2]=new ArrayOfEmployee(103,"Anmesh lad",15000.0);
		arr1[2].display();
		ArrayOfEmployee.show();
		System.out.println("\n");
		
		arr1[3]=new ArrayOfEmployee(104,"Shlok lad",35000.0);
		arr1[3].display();
		ArrayOfEmployee.show();
		System.out.println("\n");
		
		arr1[4]=new ArrayOfEmployee(105,"Sam bhise",19800.0);
		arr1[4].display();
		ArrayOfEmployee.show();
		System.out.println("\n");
		
		arr1[5]=new ArrayOfEmployee(106,"Shriraj shinde",21000.0);
		arr1[5].display();
		ArrayOfEmployee.show();
		System.out.println("\n");
		
		arr1[6]=new ArrayOfEmployee(107,"Rohit jadhav",37000.0);
		arr1[6].display();
		ArrayOfEmployee.show();
		System.out.println("\n");
		
		arr1[7]=new ArrayOfEmployee(108,"Suraj jadhav",55000.0);
		arr1[7].display();
		ArrayOfEmployee.show();
		System.out.println("\n");
		
		arr1[8]=new ArrayOfEmployee(109,"Sidharth dhavlikar",35000.0);
		arr1[8].display();
		ArrayOfEmployee.show();
		System.out.println("\n");
		
		arr1[9]=new ArrayOfEmployee(110,"Aniket rane",32000.0);
		arr1[1].display();
		ArrayOfEmployee.show();
		
		
		System.out.println();
		
	}

}
