package services;
 import models.School;
 import models.Student;
 import models.Teacher;
 import models.Grade;

public class SchoolServices {

	School school;

	public SchoolServices(School school) {
 		this.school = school;
	}

	public School getSchool() {
		return school;
	}
    public void addStudent(Student student) {
    	this.school.getStudents().add(student);
    	
    }
	public void addTeacher (Teacher teacher) {
		this.school.getTeachers().add(teacher);
	}
	public void addGrade(Grade grade) {
		this.school.getGrades().add(grade);
		
	}
	public void removeStudent(Student student) {
		this.school.getStudents().remove(student);
	}
	public void removeTeacher(Teacher teacher) {
		this.school.getTeachers().remove(teacher);
}
	public void removeGrade(Student grade) {
		this.school.getGrades().remove(grade);
}	
	
	public Student getStudentByName(String name) {
		Student a = null;
        for(Student student :  this.school.getStudents() ) { 
		if(student.getName().toUpperCase().equals(name.toUpperCase())) {
			a = student;
			break;
		}
	}
	return a ;
	}
	
	
	public Teacher getTeachertByName (String name) {
		for (Teacher teacher : this.school.getTeachers() ) {
			if(teacher.getName().toUpperCase().equals(name.toUpperCase())) {
				return teacher;
				
			}
		}
		return null;
	}

public Grade getGradetByCode (String code) {
	for (Grade grade : this.school.getGrades() ) {
		if(grade.getCode().equals(code)) {
			return grade;
			
		}
	}
	return null;
}
}


