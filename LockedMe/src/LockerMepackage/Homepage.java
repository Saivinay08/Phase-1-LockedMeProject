package LockerMepackage;

import java.io.IOException;

public class Homepage {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Application Name: LockedMe");
		System.out.println("Developer: Saivinay Koneru \n");
		WelcomeOptions wo = new WelcomeOptions();
		wo.MainContext();
		wo.WelcomePageselection();
	}
}