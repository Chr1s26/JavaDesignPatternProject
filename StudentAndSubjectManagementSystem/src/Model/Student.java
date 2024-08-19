package Model;

public class Student {

	private String name;
	private int age;
	private int id;
	private boolean isRegular;
	private static final int maxStudentCount = 1000;
	private static int StudentCount = 0;
	private static int interStudentCount = 0;
	private static int regularStudentCount = 0;
	
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student(Student student,boolean isRegular) {
		this.name = student.name;
		this.age = student.age;
		this.isRegular = isRegular ;
		StudentCount ++;
		this.id = StudentCount;
		if(isRegular) {
			regularStudentCount++;
		}
		else {
			interStudentCount++;
		}
	}
	
	public static int getMaxstudentcount() {
		return maxStudentCount;
	}

	public static int getStudentCount() {
		return StudentCount;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public static int getInterStudentCount() {
		return interStudentCount;
	}

	public static int getRegularStudentCount() {
		return regularStudentCount;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\n id : " + id + "\n name : " + name + "\n age=" + age + "\n isRegular=" + isRegular ;
	}

}
