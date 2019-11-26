import java.util.*;

class Employee
{
	private String name;
	private int age;
	private int salary;
	private String dob;
	private String city;
	
	Employee()                    //default constructor                              
	{

	}
	Employee(String name, int age, int salary, String dob, String city)  //parameterized constuctor
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.dob=dob;
		this.city=city;
	}
	public void setName(String name)
	{
		this.name=name;	
	}
	
	public void setAge(int age)
	{
		this.age=age;	
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;	
	}
	
	public void setDob(String dob)
	{
		this.dob=dob;	
	}
	
	public void setCity(String city)
	{
		this.city=city;	
	}
	public String getName()
	{
	 	return name;
	}
	public int getAge()
	{
	 	return age;
	}
	public int getSalary()
	{
	 	return salary;
	}
	public String getDob()
	{
	 	return dob;
	}
	public String getCity()
	{
	 	return city;
	}
}

class Driver
{
	public static void main(String args[])
	{
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		Employee emp4=new Employee();
		Employee emp5=new Employee();
		Employee emp6=new Employee("Rupali",30,22000,"20/02/1989","Pune");
		Employee emp7=new Employee("Amar",27,12000,"30/08/1992","Banglore");
		Employee emp8=new Employee("Vaishnavi",20,25000,"12/02/1999","Hyderabaad");
		Employee emp9=new Employee("Pushkar",22,15000,"14/09/1997","Chennai");
		Employee emp10=new Employee("Ashwin",22,30000,"04/10/1997","New York");
		emp1.setName("Meera");
		emp1.setAge(21);
		emp1.setSalary(21700);
		emp1.setDob("10/01/1998");
		emp1.setCity("Pune");
		emp2.setName("Rohan");
		emp2.setAge(23);
		emp2.setSalary(21700);
		emp2.setDob("10/01/1996");
		emp2.setCity("Mumbai");
		emp3.setName("Swara");
		emp3.setAge(22);
		emp3.setSalary(21700);
		emp3.setDob("10/01/1997");
		emp3.setCity("Pune");
		emp4.setName("Deepa");
		emp4.setAge(21);
		emp4.setSalary(21700);
		emp4.setDob("10/01/1998");
		emp4.setCity("Pune");
		emp5.setName("Rushil");
		emp5.setAge(21);
		emp5.setSalary(21700);
		emp5.setDob("10/01/1998");
		emp5.setCity("Pune");
		System.out.println(emp1.getName() +"\n "+ emp1.getAge() +"\n " + emp1.getSalary() +"\n " + emp1.getDob() +"\n " +emp1.getCity());
		System.out.println(emp2.getName() +"\n "+ emp2.getAge() +"\n " + emp2.getSalary() +"\n " + emp2.getDob() +"\n " +emp2.getCity());
		System.out.println(emp3.getName() +"\n "+ emp3.getAge() +"\n " + emp3.getSalary() +"\n " + emp3.getDob() +"\n " +emp3.getCity());
		System.out.println(emp8.getName() +"\n "+ emp8.getAge() +"\n " + emp8.getSalary() +"\n " + emp8.getDob() +"\n " +emp8.getCity());
		System.out.println(emp10.getName() +"\n "+ emp10.getAge() +"\n " + emp10.getSalary() +"\n " + emp10.getDob() +"\n " +emp10.getCity());
	}

}