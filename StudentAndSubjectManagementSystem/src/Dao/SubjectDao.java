package Dao;

import Model.Subject;

public interface SubjectDao {

	void addSubject(Subject subject);
	Subject getSubjectById(int id);
	Subject getSubjectByName(String name);
	Subject[] getAllSubjects();
	void updateSubject(Subject Subject);
	void deleteSubject(int id);

}
