package models;

public class Teacher extends person  {
	float salary ;

	public Teacher(String name, int age, float salary) {
		super(name, age);
		this.salary = salary;
	}

	public Teacher() {
	
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return this.getName()+ " " + this.getAge() + " " + this.salary;

	}

	
	
 }

