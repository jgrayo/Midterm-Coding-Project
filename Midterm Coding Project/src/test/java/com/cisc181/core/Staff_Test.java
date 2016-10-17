package com.cisc181.core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	private static ArrayList<Staff> aList;

	@BeforeClass
	public static void setup() throws Exception {
		aList = new ArrayList<Staff>();

		aList.add(new Staff("Alex", "J", "Adams", new GregorianCalendar(1992, 12, 22).getTime(), "18 South St",
				"(302)-547-8888", "A@gmail.com", "9-11", 2, 20000, new GregorianCalendar(2012, 12, 22).getTime(),
				eTitle.MR));

		aList.add(new Staff("Barbra", "J", "Bass", new GregorianCalendar(1989, 12, 22).getTime(), "21 Southwest St",
				"(302)-547-8885", "B@gmail.com", "9-11", 2, 25000, new GregorianCalendar(2012, 12, 22).getTime(),
				eTitle.MRS));

		aList.add(new Staff("Clair", "J", "Cell", new GregorianCalendar(1980, 12, 22).getTime(), "20 South St",
				"(302)-547-8988", "C@gmail.com", "11-12", 2, 30000, new GregorianCalendar(2012, 12, 22).getTime(),
				eTitle.MS));

		aList.add(new Staff("Dylan", "J", "Dixon", new GregorianCalendar(1992, 11, 22).getTime(), "22 South St",
				"(302)-557-8888", "D@gmail.com", "9-11", 2, 35000, new GregorianCalendar(2012, 12, 22).getTime(),
				eTitle.MR));

		aList.add(new Staff("Edwin", "J", "Ellis", new GregorianCalendar(1900, 12, 22).getTime(), "18 South St",
				"3025478888", "E@gmail.com", "9-11", 2, 20000, new GregorianCalendar(2010, 12, 22).getTime(),
				eTitle.MR));
	}

	@Test
	public void test() {
		double total = 0.0;
		for (Staff Salary : aList) {
			total = Salary.getSalary();
		}
		int average = (int) (total / 5);
		assertEquals(average, 26000);
	}

	// test with failing DOB
	@Test(expected = PersonException.class)
	public void test2() throws Exception {
		new Staff("Edwin", "J", "Ellis", new GregorianCalendar(1900, 12, 22).getTime(), "18 South St", "(302)-547-8888",
				"E@gmail.com", "9-11", 2, 20000, new GregorianCalendar(2010, 12, 22).getTime(), eTitle.MR);

	}
	//test with failing phone#
		@Test (expected = PersonException.class)
				public void test3() throws Exception{
					new Staff("Edwin", "J", "Ellis", new GregorianCalendar(1900, 12, 22).getTime(), "18 South St",
							"3025478888", "E@gmail.com", "9-11", 2, 20000, new GregorianCalendar(2010, 12, 22).getTime(),
							eTitle.MR);
}
}