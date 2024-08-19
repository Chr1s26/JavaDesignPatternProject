package Model;

public class Subject {

	private static int maxSubjectCount = 10;
	private String name;
	private int id;
	private int credits;
	private static int count = 0;
	
	public Subject(String name,int credits) {
		this.name = name;
		this.credits = credits;
		count ++;
		this.id = count;
		
	}

	public static int getMaxSubjectCount() {
		return maxSubjectCount;
	}

	public static int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", id=" + id + ", credits=" + credits + "]";
	}
	
	
	
}
