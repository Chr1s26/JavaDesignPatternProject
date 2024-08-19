package Service;

import java.io.IOException;

import Model.RegularStudent;
import Model.Student;

public class RegularStudentRegisterationService extends RegisterationService {

	@Override
	public void getTypeInfo() throws IOException {
		System.out.println("Enter the NRC : ");
		String  nrc = bufferedReader.readLine();
		Student student = new RegularStudent(this.getStudent(), nrc);
		this.setStudent(student);
	}
}
