package Model;

public class InternationalStudent extends Student {
	
	private VisaInformation visaInformation;
	private Student student;
	
	public InternationalStudent(Student student,VisaInformation visaInformation) {
		super(student, false);
		this.visaInformation = visaInformation;
	}
	
	public static int getInternationalStudentCount() {
		return getInternationalStudentCount();
	}
	
	@Override
	public String toString() {
		return super.toString() + visaInformation.toString();
	}

}
