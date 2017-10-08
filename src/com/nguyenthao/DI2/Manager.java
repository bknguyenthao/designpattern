package com.nguyenthao.DI2;

public class Manager {
	private IDatabase db;
	private ILogger log;
	private IEmail email;

	public Manager(IDatabase db, ILogger log, IEmail email) {
		super();
		this.db = db;
		this.log = log;
		this.email = email;
	}

	public IDatabase getDb() {
		return db;
	}

	public void setDb(IDatabase db) {
		this.db = db;
	}

	public ILogger getLog() {
		return log;
	}

	public void setLog(ILogger log) {
		this.log = log;
	}

	public IEmail getEmail() {
		return email;
	}

	public void setEmail(IEmail email) {
		this.email = email;
	}

}
