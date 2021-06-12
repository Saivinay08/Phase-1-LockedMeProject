
package LockerMepackage;

import java.io.File;

import java.util.Arrays;

public class AscendingOrder extends AddFile {
	public void display() {
		System.out.println("Listing files in ascending order \n");

		// *root is eclipse root/default directory*
		String root = "E:\\Java\\eclipse\\LockedMe";
		File file = new File(root);
		File[] files = file.listFiles();
		Arrays.sort(files);
		for (File eachFile : files)
			System.out.println(eachFile.getName());
	}
}
