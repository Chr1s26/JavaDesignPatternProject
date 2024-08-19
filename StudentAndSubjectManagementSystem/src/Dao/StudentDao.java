package Dao;

import Model.Student;

public interface StudentDao {

	void addStudent(Student student);
	Student getStudentById(int id);
	Student getStudentByName(String name);
	Student[] getAllStudents();
	void updateStudent(Student student);
	void deleteStudent(int id);
	
}
