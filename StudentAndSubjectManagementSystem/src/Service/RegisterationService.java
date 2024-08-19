package Service;

import java.io.IOException;

import Dao.StudentDao;
import Dao.StudentDaoImp;
import Model.Student;

public abstract class RegisterationService extends BaseService {
	private StudentDao studentDao ;
	private Student student;
	
	public RegisterationService() {
		studentDao = new StudentDaoImp();
	} 

	public void registerStudent() throws IOException {
		System.out.println("Enter the student name : ");
		String name = bufferedReader.readLine();
		System.out.println("Enter the student age : ");
		int age = Integer.parseInt(bufferedReader.readLine());
		student = new Student(name, age);
		this.getTypeInfo();
		this.studentDao.addStudent(student);
	}
	
	public abstract void getTypeInfo() throws IOException;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void displayRegisterStudent() {
		System.out.println("******** Students Information *****");
		for(int i=0; i < Student.getStudentCount(); i++) {
			Student student = studentDao.getStudentById(i+1) ;
			if(student != null) {
				System.out.println(student);
			}
		}
		System.out.println("Students Count : " + Student.getStudentCount());
		System.out.println("International Students Count : " + Student.getInterStudentCount());
		System.out.println("Regular Students Count : " + Student.getRegularStudentCount());
	}

}
