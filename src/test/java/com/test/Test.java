package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Test {

	@BeforeClass
	private void beforeClass() {
		System.out.println("sk");

	}

	@org.testng.annotations.Test
	private void tc01() {
		System.out.println("test1");

	}

	@AfterClass
	private void afterClass() {
		System.out.println("After");

	}

	public void empId() {
		System.out.println("id is 123");

	}

	public void empName() {
		System.out.println("name is Tamil");
	}
	private void cusId() {
		System.out.println("765");

	}

	private void cusName() {
		System.out.println("Antony");

	}
}
