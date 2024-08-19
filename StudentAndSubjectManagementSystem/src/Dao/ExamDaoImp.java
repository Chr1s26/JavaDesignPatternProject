package Dao;

import Model.Exam;

public class ExamDaoImp implements ExamDao {
	
	
	private static Exam[] exams = new Exam[Exam.getMaxexamcount()];
	
	
	@Override
	public void addExam(Exam exam) {
		exams[Exam.getExamCount()-1] = exam;
	}

	@Override
	public Exam getExamById(int id) {
		for(int i = 0 ; i < Exam.getExamCount(); i++) {
			if(exams[i].getExamId() == id) {
				return exams[i];
			}
		}
		return null;
	}

	@Override
	public Exam getExamByName(String name) {
		for(int i = 0 ; i < Exam.getExamCount(); i++) {
			if(exams[i].getTitle().equalsIgnoreCase(name)) {
				return exams[i];
			}
		}
		return null;
	}

	@Override
	public Exam[] getAllExams() {
		return exams;
	}

	@Override
	public void updateExam(Exam exam) {
		Exam oldExam = this.getExamById(exam.getExamId());
		oldExam.setTitle(exam.getTitle());
	}

	@Override
	public void deleteExam(int id) {
		for(int i = 0; i < Exam.getExamCount(); i++) {
			if(exams[i].getExamId() == id) {
				exams[i] = null;
			}
		}
	}

	

}
