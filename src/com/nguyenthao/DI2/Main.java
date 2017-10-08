package com.nguyenthao.DI2;

public class Main {
	public static void main(String[] args) {
//		DIContainer diContainer = DIContainer.getInstance();
//		diContainer.register(IDatabase.class, Database.class);

	}

	public void Checkout(int orderId, int userId) {
		Manager manager = new Manager(new Database(), new Logger(), new Email());
		manager.getDb().save(orderId);
		manager.getLog().logInfo("This is log info");
		manager.getEmail().sendEmail(userId);

		// sau này khi có sự thay đổi về database kiểu như XmlDatabase,
		// SqlDatabase
		// thì ta chỉ cần XmlDatabase và SqlDatabase implements Database. Và
		// dòng khai báo
		// dưới đây sẽ sửa lại thành
		// Manager manager = new Manager(new XmlDatabase(), new Logger(), new
		// Email());
		// Đây là bước đầu của IoC
		
		
		// Còn việc không new trực tiếp đối tượng trong Manager chính là thế hiện của 
		// việc DI. Ở trong lớp Manager chúng ta chỉ tiêm nhiễm sự phụ thuộc của lớp này
		// vào Database, Logger, Email chứ không new trực tiếp 3 đối tượng này
	}
}
