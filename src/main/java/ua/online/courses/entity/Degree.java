package ua.online.courses.entity;

public enum Degree {

	BACHELOR("BACHELOR"), MASTER("MASTER"), ASPIRANT("ASPIRANT");
	
	private String degree;

	private Degree(String degree) {
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}
	
	
	
}
