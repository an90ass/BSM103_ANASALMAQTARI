package main;
import java.util.*;
import models.School;
import models.Student;
import models.Teacher;
import models.person;

import services.SchoolServices;
import tools.Actions;

public class Hmi {
	private static SchoolServices schoolServices; 
	
  public static void start() {
	  Scanner input = new Scanner(System.in);
	School school =  Hmi.createSchool();
      System.out.println(" WELCOME TO " + school.getName() + " IN " + school.getAddress() );
      
      
	  String action;
	  do {
		  System.out.println("What do you want to do ?");
		  action = input.next();
		   
		   switch(action) {
	         case "addStudent" :
	        	 Hmi.addStudent();
	        	 break;
	         case "addTeacher" :
	        	 Hmi.addTeacher();
	        	 break;
	        	 
	         case "PrintALllTheStudents":
				  Hmi.printAllTheStudents();
                 break;
                 
	         case "PrintALllTheTeachers":
				  Hmi.printAllTeachers();
                break;
                
	         case "findStudentByName":
				  Hmi.printDataPerosnByName(Actions.STUDENT);
                break;
                
	         case "findTeacherByName":
				  Hmi.printDataPerosnByName(Actions.TEACHER);
               break;
               
	         case "removeStudent":
				  Hmi.removePerosn(Actions.STUDENT);
              break;
	         case "removeTeacher":
				  Hmi.removePerosn(Actions.TEACHER);
             break;
                 }
		               }
	  
		   while(!action.equals("exit"));  } 
  
  private static School createSchool() {
	  School school  =  new School ();
	  school.setName("BARTIN UNIVERSITESI");
	  school.setAddress("TURKEY-BARTIN ");
	  school.setPhoneNumber("00000000000");
		Hmi.schoolServices  = new SchoolServices (school);

	  return school;
	  
  }
  private static void addStudent(){
     Student student = new Student();
	 Hmi.setDataPerson(student);
     Hmi.schoolServices.addStudent(student);
  }
   private static void addTeacher(){
     Teacher teacher = new Teacher();
	 Hmi.setDataPerson(teacher);
	 Hmi.schoolServices.addTeacher(teacher);
       }
  
  public static void printAllTheStudents() {
	 
  for( Student student : Hmi.schoolServices.getSchool().getStudents()) {
	  System.out.println(student.getData());
  }}
  
  public static void printAllTeachers() {
		 
	  for( Teacher teacher : Hmi.schoolServices.getSchool().getTeachers()) {
		  System.out.println(teacher.getData());
	  }
}
  private static void setDataPerson(person p) {
	  Scanner reader = new Scanner(System.in);
		  System.out.println("Please Enter The Name :");
		  p.setName(reader.next()); 
		  System.out.println("Please Enter The Age :");
		  p.setAge(reader.nextInt()); 
		  
		  if(p instanceof Teacher ) {
			  System.out.println("Please Enter The Salary:");

			  ((Teacher)p).setSalary(reader.nextFloat());
		  }else if (p instanceof Student){
			  System.out.println("Please Enter The Phone Number :");
			  ((Student) p).setParentPhonNumber(reader.next());
			  }
            }
  
  private static void printDataPerosnByName(Actions action) {
person p = Hmi.findPersonByName(action);
Hmi.printDataPerosn(p);
  }
  
  	    
  private static void printDataPerosn(person person) {
	  if(person == null ){
	  		System.out.println("NOT FIND !!!");
	  	}
	  	else{
	      	System.out.println(person.getData());
	  	} 
	 } 
  
  
  private static person findPersonByName(Actions action) {
	  	Scanner reader = new Scanner(System.in);
	  	System.out.println("Please Enter The Name :");
	  	String name = reader.next();
	  	person p ;
	  	if(action == Actions.STUDENT) {
	  	  	p = Hmi.schoolServices.getStudentByName(name);
	            }else {
	          	  	p = Hmi.schoolServices.getTeachertByName(name);
	            }
	  	return p;
	  	          }
  
  private static void removePerosn(Actions action) {
	  
	 person p = Hmi.findPersonByName(action); 
	  if(p instanceof Student) {	
		  Hmi.schoolServices.removeStudent((Student) p);
	  }else {	 
      Hmi.schoolServices.removeTeacher((Teacher) p);

      }
  
  }
  
}
