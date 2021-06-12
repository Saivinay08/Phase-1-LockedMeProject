package LockerMepackage;

import java.io.File;

public class DeleteFile extends AddFile {
	public void delete() {
		System.out.print("Please enter File name:");
		stringinputmethod();
		File file = new File(getStringvalue());
		if (file.delete()) {
			System.out.println("File removed");
		} else {
			System.out.println("invalid filename");
		}
	}
}