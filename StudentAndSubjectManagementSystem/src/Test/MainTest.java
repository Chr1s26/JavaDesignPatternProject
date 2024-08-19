package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Service.ExamService;
import Service.InternationalRegisterationService;
import Service.RegisterationService;
import Service.RegularStudentRegisterationService;
import Service.SubjectService;


public class MainTest {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static RegisterationService service;
	static SubjectService subjectService;
	static ExamService examService;
	
	public static void runStudentRegister() throws IOException {
		System.out.print("Is Regular Student ? yes/no : ");
		String flag = br.readLine();
		
		if(flag.equalsIgnoreCase("yes")) {
			service= new RegularStudentRegisterationService();
			service.registerStudent();
		}else {
			service= new InternationalRegisterationService();
			service.registerStudent();
		}
		
		System.out.print("Do you want to Continue? yes/no : ");
		flag = br.readLine();
		
		if(flag.equalsIgnoreCase("yes")) {
			runStudentRegister();
		}
	
	}

	public static void main(String[] args) throws IOException {
		subjectService = new SubjectService();
		examService = new ExamService();
		runStudentRegister();
		service.displayRegisterStudent();
		subjectService.registerSubject();
		subjectService.displaySubject();
		
		examcreate();
		
		examService.highestMarks();
		System.out.println("Thanks");
		
		
	}
	
	public static void examcreate() throws IOException{
		String flag;
		do{
		examService.create();
		System.out.println("Do you want to create another exam (yes/no) : ");
		flag = br.readLine();
		}
		while(flag.equalsIgnoreCase("yes"));
		examService.DisplayExam();
		
	}

}
