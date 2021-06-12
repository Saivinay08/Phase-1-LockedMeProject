package LockerMepackage;

import java.io.IOException;

public class OperationSelector {
	public void Operationselect() throws IOException {
		System.out.println("\nPlease select any below operations to perform");
		System.out.println("1. To add");
		System.out.println("2. To delete");
		System.out.println("3. To search");
		System.out.println("4. To go back to Main menu");
		InputCollector a = new InputCollector();
		System.out.print("Please select above any option by entering value:");
		a.integerinputmethod();
		int value = a.getintegervalue();

		switch (value) {
		case 1:
			AddFile ad = new AddFile();
			ad.addfile();
			Operationselect();
			break;
		case 2:
			DeleteFile df = new DeleteFile();
			df.delete();
			Operationselect();
			break;
		case 3:
			FileSearch fs = new FileSearch();
			fs.search();
			Operationselect();
			break;
		case 4:
			WelcomeOptions wo = new WelcomeOptions();
			wo.MainContext();
			wo.WelcomePageselection();
			break;
		default:
			System.out.println("please enter Valid Input");
			Operationselect();
		}
	}
}
