package Dao;

import Model.Exam;
import Model.Subject;

public class SubjectDaoImp implements SubjectDao{
	
	static Subject[] subjects = new Subject[Subject.getMaxSubjectCount()];
	
	@Override
	public void addSubject(Subject subject) {
		subjects[Subject.getCount()-1] = subject;
	}

	@Override
	public Subject getSubjectById(int id) {
		for(int i = 0 ; i < Subject.getCount(); i ++) {
			if(subjects[i].getId() == id ) {
				return subjects[i];
			}
		}
		return null;
	}

	@Override
	public Subject getSubjectByName(String name) {
		for(int i = 0 ; i < Subject.getCount(); i ++) {
			if(subjects[i].getName().equalsIgnoreCase(name) ) {
				return subjects[i];
			}
		}
		return null;
	}

	
	@Override
	public Subject[] getAllSubjects() {
		return null;
	}

	@Override
	public void updateSubject(Subject subject) {
		Subject oldSub = this.getSubjectById(subject.getId());
		oldSub.setName(subject.getName());
	}

	@Override
	public void deleteSubject(int id) {
		for(int i = 0; i < Subject.getCount(); i++) {
			if(subjects[i].getId() == id) {
				subjects[i] = null;
			}
		}
	}

	

}
