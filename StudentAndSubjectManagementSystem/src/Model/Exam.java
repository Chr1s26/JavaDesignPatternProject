package Model;

import java.util.HashMap;
import java.util.Map;

public class Exam {

	private int ExamId;
	private String title;
	private Student student;
	private static int ExamCount = 0;
	private final static int MaxExamCount = 10;
	private HashMap<Subject, Integer> subjectMarks = new HashMap<Subject, Integer>();
	
	public Exam(String title) {
		this.title = title;
		ExamCount++;
		this.ExamId = ExamCount;
	}
	
	public Exam() {
		
	}
	
	public void addSubjectMarks(Subject subject,int marks) {
		this.subjectMarks.put(subject, marks);
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getExamId() {
		return ExamId;
	}

	public String getTitle() {
		return title;
	}

	public static int getExamCount() {
		return ExamCount;
	}
	
	public static int getMaxexamcount() {
		return MaxExamCount;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getTotalMarks() {
		int totalMarks = 0;
		for(int marks : subjectMarks.values()) {
			totalMarks += marks;
		}
		return totalMarks;
	}
	
	public double calculateAverage() {
	    double totalMarks = 0;
	    for(int marks : subjectMarks.values()) {
			totalMarks += marks;
		}
		return totalMarks/subjectMarks.size();
	}
	

	@Override
	public String toString() {
		String stuString = "";
		for(Map.Entry<Subject, Integer> entry : this.subjectMarks.entrySet()) {
			stuString += entry.getKey();
			stuString += "Mark is "+entry.getValue();
		}
				
		
		return "\nExam title is "+this.title+"\n Exam id is "+this.ExamId +"\n Student name is "+this.student.getName()+"\n"+stuString+"";
	}
	
	


}
