package Dao;


import Model.Student;

public class StudentDaoImp implements StudentDao{
	
	private static Student[] students= new Student[Student.getMaxstudentcount()];
	

	

	@Override
	public void addStudent(Student student) {
		students[Student.getStudentCount()-1] = student;
	}

	
	@Override
	public Student getStudentById(int id) {
		for(int i = 0; i < Student.getStudentCount(); i++) {
			if(students[i] != null && students[i].getId() == id) {
				return students[i];
			}
		}
		return null;
	}

	@Override
	public Student getStudentByName(String name) {
		for(int i = 0; i < Student.getStudentCount(); i++) {
			if(students[i].getName().equalsIgnoreCase(name)) {
				return students[i];
			}
		}
		return null;
	}

	@Override
	public Student[] getAllStudents() {
		return students;
	}

	@Override
	public void updateStudent(Student student) {
		Student oldStu = this.getStudentById(student.getId());
		oldStu.setName(student.getName());
	}

	@Override
	public void deleteStudent(int id) {
		for(int i = 0; i < Student.getStudentCount(); i++) {
			if(students[i].getId() == id) {
				students[i] = null;
			}
		}
	}

	
	

}
