package com.cisc181.core;

import java.util.Date;

import com.cisc181.eNums.eTitle;

public class Staff extends Employee {
	
	private eTitle eTitle;

	public Staff(eTitle title) {
		this.eTitle = eTitle;
	}

	public void setTitle(eTitle eTitle) {
		this.eTitle = eTitle;
	}

	public eTitle getTitle() {
		return this.eTitle;
	}

	public Staff(String FirstName, String MiddleName, String LastName, Date DOB, String Address, String Phone_number,
			String Email, String officeHours, int rank, double salary, Date hireDate, eTitle Title) throws PersonException

	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email, officeHours, salary, hireDate);

		this.eTitle = eTitle;
	}

}