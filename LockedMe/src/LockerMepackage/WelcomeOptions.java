package LockerMepackage;

import java.io.IOException;

public class WelcomeOptions extends InputCollector {
	public void MainContext() {
		System.out.println("\nWelcome to Main Context. This Application can perform below 3 operation");
		System.out.println("1. To show all existing files in ascending order");
		System.out.println("2. To add/delete/search files");
		System.out.println("3. To close application \n");
	}

	public void WelcomePageselection() throws IOException {
		System.out.print("Please select above any option by entering value:");
		integerinputmethod();
		int value = getintegervalue();
		ExitOptions eo = new ExitOptions();

		switch (value) {
		case 1:
			System.out.println("ascending order in below array");
			AscendingOrder ao = new AscendingOrder();
			ao.display();
			eo.exitoptions();
			break;
		case 2:
			OperationSelector os = new OperationSelector();
			os.Operationselect();
			break;
		case 3:
			System.out.print("\nThanks for using Application & Have a nice day");
			System.exit(0);
			break;
		default:
			System.out.println("Incorrect Input");
			MainContext();
			WelcomePageselection();
		}
	}
}