package LockerMepackage;

import java.io.IOException;

public class ExitOptions extends InputCollector {
	public void exitoptions() throws IOException {
		System.out.println("\nThanks for using Application. please select any one below option");
		System.out.println("1. To go back to main menu");
		System.out.println("2. To exit application\n");
		System.out.print("please select any above option by entering a value:");
		integerinputmethod();
		int value = getintegervalue();

		switch (value) {
		case 1:
			WelcomeOptions wo = new WelcomeOptions();
			wo.MainContext();
			wo.WelcomePageselection();
			break;
		case 2:
			System.out.println("\nThanks for using Application and Have a nice day");
			System.exit(0);
			break;
		default:
			System.out.println("please enter Valid Input");
			exitoptions();
		}
	}
}
