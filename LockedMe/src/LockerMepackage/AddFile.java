package LockerMepackage;

import java.io.File;
import java.io.IOException;

public class AddFile extends InputCollector {
	public void addfile() throws IOException {
		System.out.print("Please enter File name:");
		stringinputmethod();
		File file = new File(getStringvalue());
		if (file.createNewFile()) {
			System.out.println("file created");
		} else {
			System.out.println("File not created");
		}
	}
}
