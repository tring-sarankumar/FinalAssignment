package studentstest;

public class Student {
	private String name;
	private int age;
	private double gpa;
	
	Student(String name,int age,double gpa){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected double getGpa() {
		return gpa;
	}

	protected void setGpa(double gpa) {
		this.gpa = gpa;
	}
	

}
