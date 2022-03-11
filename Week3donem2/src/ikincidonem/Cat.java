package ikincidonem;

public class Cat {
	int age; 
	String name ;
	String color ;
	
	 public Cat () {
		 this.age = 0;
		 this.color = "renk girilmede";
		 this.name = "name girilmedi";
		 
	 }
	 public Cat(String name, int age ) {
		 this.name = name;
		 this.age = age;
		 
	 }
	 public Cat(String name, String color , int age ) {
		 this.name = name;
		 this.age = age;
		 this.color = color;
	 }
	 public Cat(int age, String name , String color ) {
		 this.name = name;
		 this.age = age;
		 this.color = color;
	 }
}
