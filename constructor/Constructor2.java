/*
	Constructor OverLoading-The process of creating multiple constructor of the same class with diffrent parameters is known as constructor overloading.
*/
class Employee
{
	int employeeid;
	String employeeName;
	int employeeSalary;
	double yearOfExp;
	int bondDuration;

	Employee(int id,String name,int salary) //User defined and parametrized Constructor
	{
		employeeid=id;
		employeeName=name;
		employeeSalary=salary;

	}

	Employee(int id,String name,int salary,double exp,int bond)//2nd Constructor
	{
		employeeid=id;
		employeeName=name;
		employeeSalary=salary;
		yearOfExp=exp;
		bondDuration=bond;

	}

	void dispay()
	{
		System.out.println(employeeid+"\t"+employeeName+"\t"+employeeSalary+"\t"+yearOfExp+"\t"+bondDuration);

	}
}
	class Constructor2
	{
		public static void main(String[] args) 
		{
			Employee e1=new Employee(101,"Rohit",2500);
			e1.dispay();

			Employee e2=new Employee(102,"Dinesh",755555,3,1);
			e2.dispay();
			
		}

	}


