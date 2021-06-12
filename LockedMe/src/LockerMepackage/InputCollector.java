package LockerMepackage;

import java.util.Scanner;

public class InputCollector {
	private int integervalue;
	private String stringvalue;
	Scanner sc = new Scanner(System.in);

	public void integerinputmethod() {
		try {
			integervalue = sc.nextInt();
		} catch (Exception e) {
			System.out.println("invalid input");
		}
	}

	public void stringinputmethod() {
		try {
			stringvalue = sc.nextLine();
		} catch (Exception e) {
			System.out.println("invalid input");
		}
	}

	public int getintegervalue() {
		return integervalue;
	}

	public void setintegervalue(int i) {
		this.integervalue = i;
	}

	public String getStringvalue() {
		return stringvalue;
	}

	public void setStringvalue(String stringvalue) {
		System.out.println("input received");
		this.stringvalue = stringvalue;
	}
}
