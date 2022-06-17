//initialisation of class variable by method
public class Employee {
	int empid;
	String empname;
	int salary;
	int deptno;
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		emp1.empid=100;
		emp1.empname="ram";
		emp1.salary=10000;
		emp1.deptno=52;
		emp1.display();
	}
	}

