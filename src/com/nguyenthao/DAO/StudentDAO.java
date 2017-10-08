package com.nguyenthao.DAO;

import java.util.List;

public interface StudentDAO {
	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

	public void printStudent(Student student);

	public void printAllStudent(List<Student> students);
}
