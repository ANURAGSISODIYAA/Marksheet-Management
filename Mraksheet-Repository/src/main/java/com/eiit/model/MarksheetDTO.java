package com.eiit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Marksheet_Details")

public class MarksheetDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Marksheet_ID")
	private int marksheetId;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	@Column(name = "REMARKS")
	private String remarks;
	
	@Column(name = "TOTAL_MARKS")
	private int totalMarks;
	
	@Column(name = "ROLL_NUMBER")
	private String rollNumber;
	
	@Column(name = "GRADE")
	private String grade;

	public int getMarksheetId() {
		return marksheetId;
	}

	public void setMarksheetId(int marksheetId) {
		this.marksheetId = marksheetId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
