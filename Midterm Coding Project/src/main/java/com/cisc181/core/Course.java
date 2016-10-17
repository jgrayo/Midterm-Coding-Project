package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	
	private UUID CourseId;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(UUID randomUUID, String courseName2, int gradePoints2, eMajor business) {
	}

	public UUID getCourseId() {
		return CourseId;
	}
	public void setCourseId(UUID courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		Major = major;
	}
}
