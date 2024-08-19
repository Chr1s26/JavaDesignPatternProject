package Service;

import java.io.IOException;
import Model.InternationalStudent;
import Model.Student;
import Model.VisaInformation;

public class InternationalRegisterationService extends RegisterationService {
	
	
	@Override
	public void getTypeInfo() throws IOException{
		System.out.println("Enter the passport Number : ");
		String number = bufferedReader.readLine();
		System.out.println("Enter the visa Type : ");
		String type = bufferedReader.readLine();
		VisaInformation visaInformation = new VisaInformation(type, number);
		Student student = new InternationalStudent(this.getStudent(), visaInformation);
		this.setStudent(student);
		
	}


}
