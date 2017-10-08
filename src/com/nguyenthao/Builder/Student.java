package com.nguyenthao.Builder;

import java.util.List;

public class Student {
	private String name;
	private int age;
	private List<String> language;
	private String sex;

	public static class Builder {

		private String name;
		private int age;
		private List<String> language;
		private String sex;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder language(List<String> language) {
			this.language = language;
			return this;
		}
		public Builder sex(String sex){
			this.sex = sex;
			return this;
		}
		public Student build() {
			return new Student(this);
		}

	}

	private Student(Builder builder) {
		name = builder.name;
		age = builder.age;
		language = builder.language;
		sex = builder.sex;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getLanguage() {
		return language;
	}

	public void setLanguage(List<String> language) {
		this.language = language;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", language=" + language+", sex=" + sex + '}';
	}
}
