package com.nguyenthao.DAO;

import java.util.List;

public class Main {
	public static void main(String[] args) {		
		StudentDAO studentDao = new StudentDaoImpl();
		
		List<Student> students = studentDao.getAllStudents();
		studentDao.printAllStudent(students);

		Student student_update = studentDao.getStudent(10);
		student_update.setName("new name");
		studentDao.updateStudent(student_update);
		studentDao.printAllStudent(students);
//		List<Student> students_2 = studentDao.getAllStudents();
//		studentDao.printAllStudent(students_2);
		
		Student student_delete = studentDao.getStudent(11);
		studentDao.deleteStudent(student_delete);
		studentDao.printAllStudent(students);
//		List<Student> students_3 = studentDao.getAllStudents();
//		studentDao.printAllStudent(students_3);
	}
}
