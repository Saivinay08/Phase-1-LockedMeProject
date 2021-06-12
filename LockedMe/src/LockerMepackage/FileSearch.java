package LockerMepackage;

import java.io.File;

public class FileSearch extends AddFile {
	public void search() {
		System.out.print("Please enter File name:");
		stringinputmethod();
		getStringvalue();
		File file = new File(getStringvalue());
		if (file.exists()) {
			System.out.println("File available");
		} else {
			System.out.println("file not exist");
		}
	}
}