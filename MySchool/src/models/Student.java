package models;

public class Student extends person  {
	  String parentPhonNumber;

	public Student(String name, int age, String parentPhonNumber) {
		super(name, age);
		this.parentPhonNumber = parentPhonNumber;
	}

	public Student() {
		
	}

	public String getParentPhonNumber() {
		return parentPhonNumber;
	}

	public void setParentPhonNumber(String parentPhonNumber) {
		this.parentPhonNumber = parentPhonNumber;
	}

	@Override
	public String getData() {
		return this.getName()+ " " + this.getAge() + " " + this.parentPhonNumber;
	}

	  

}
