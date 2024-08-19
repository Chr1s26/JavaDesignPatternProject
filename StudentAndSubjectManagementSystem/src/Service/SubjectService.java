package Service;

import java.io.IOException;

import Dao.SubjectDao;
import Dao.SubjectDaoImp;
import Model.Subject;

public class SubjectService extends BaseService {
	SubjectDao subjectDao;
	
	public SubjectService() {
		subjectDao = new SubjectDaoImp();
	}
	
	public void registerSubject() throws IOException {
		String flag ;
		do {
			
		System.out.println("Please enter the subject name : ");
		String name = bufferedReader.readLine();
		System.out.println("Please enter the subject credits : ");
		int crd = Integer.parseInt(bufferedReader.readLine());
		Subject subject = new Subject(name, crd);
		subjectDao.addSubject(subject);
		
		System.out.println("Do you want to add the subject (yes/no) : ");
		flag = bufferedReader.readLine();
		}while(flag.equalsIgnoreCase("yes"));
	}
	
	public void displaySubject() {
		System.out.println("The subjects avaliable are : ");
		for(int i = 0; i < Subject.getCount(); i++) {
			Subject subjects = subjectDao.getSubjectById(i+1);
			if(subjects != null) {
				System.out.println(subjects);
			}
		}	
	}
}
