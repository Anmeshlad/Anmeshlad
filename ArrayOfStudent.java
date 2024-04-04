package ArrayDemos;

public class ArrayOfStudent {
	int studentrollno;
	String studentname,div;
	static String schoolname;
	
	static {
		schoolname="MSV,satara";
	}
	
	ArrayOfStudent(){
		studentrollno=11;
		studentname="Rajeshri";
		div="A";
	}
	
	ArrayOfStudent(int stdroll,String stdnm,String div){
		this.studentrollno=stdroll;
		this.studentname=stdnm;
		this.div=div;
	}
	
	public static void display() {
		System.out.println("SchoolName: "+schoolname);
	}
	
	public void showdetails() {
		System.out.println("Details Of Student: "+"\n"+"\n"+"Student Roll No."+studentrollno+"\n"+"Student Name: "+studentname+"\n"+"Division: "+div);
	}
	
	

	public static void main(String[] args) {
		ArrayOfStudent arr2[];
		arr2=new ArrayOfStudent[10];
		
		
		arr2[0]=new ArrayOfStudent();
		arr2[0].showdetails();
		ArrayOfStudent.display();
		System.out.println("\n");
		
		arr2[1]=new ArrayOfStudent();
		arr2[1].showdetails();
		ArrayOfStudent.display();
		System.out.println("\n");
		
		arr2[2]=new ArrayOfStudent();
		arr2[2].showdetails();
		ArrayOfStudent.display();
		System.out.println("\n");
		
		arr2[3]=new ArrayOfStudent();
		arr2[3].showdetails();
		ArrayOfStudent.display();
		System.out.println("\n");
		
		arr2[4]=new ArrayOfStudent();
		arr2[4].showdetails();
		ArrayOfStudent.display();
		System.out.println("\n");
		
		arr2[5]=new ArrayOfStudent();
		arr2[5].showdetails();
		ArrayOfStudent.display();
		System.out.println("\n");
		
		arr2[6]=new ArrayOfStudent();
		arr2[6].showdetails();
		ArrayOfStudent.display();
		System.out.println("\n");
		
		arr2[7]=new ArrayOfStudent();
		arr2[7].showdetails();
		ArrayOfStudent.display();
		System.out.println("\n");
		
		arr2[8]=new ArrayOfStudent();
		arr2[8].showdetails();
		ArrayOfStudent.display();
		System.out.println("\n");
		
		arr2[9]=new ArrayOfStudent();
		arr2[9].showdetails();
		ArrayOfStudent.display();
		

	}

}
