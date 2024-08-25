package lab06;

public class Student {

	private String name;
	private int id;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void printInfomation() {
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
