package com.java.programs;

public class Student implements Comparable  {
	
	int id ;
	public int getId() {
		return id;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name ;
	@Override
	public int compareTo(Object o) {
		
		return (this.name.compareTo(((Student) o).getName()));
	}

}
