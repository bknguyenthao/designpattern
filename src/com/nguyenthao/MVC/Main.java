package com.nguyenthao.MVC;

public class Main {
	public static void main(String[] args) {
		StudentModel model = new StudentModel();
		model.setName("ThaoNM");
		model.setRollNo("123");

		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		// update model data
		controller.setStudentName("John");
		controller.setStudentRollNo("456");

		controller.updateView();
	}
}
