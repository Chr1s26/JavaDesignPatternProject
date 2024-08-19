package Model;

public class RegularStudent extends Student {
	
	private String nrc;
	
	public RegularStudent(Student student, String nrc) {
		super(student, true);
		this.nrc = nrc;
	}
	
	public static int getRegularStudentCount() {
		return getRegularStudentCount();
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n nrc : " + nrc;
	}
}
