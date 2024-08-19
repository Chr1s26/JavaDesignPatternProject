package Model;

public class VisaInformation {

	private String visaType;
	private String passportNumber;
	
	public VisaInformation(String visaType,String passportNumber) {
		this.visaType = visaType;
		this.passportNumber = passportNumber;
	}
	
	@Override
	public String toString() {
	
		return "\n Passport Number : "+ this.passportNumber + "\n Visa Type : " + this.visaType;
	}

}
