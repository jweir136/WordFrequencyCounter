package com.frequencycounter.fileutils;

import java.io.*;
import java.util.*;

public class FileOpener {
	private File file;

	public FileOpener(String filename) {
		this.file = new File(filename);
	}

	public List<String> getContents() throws Exception {
		List<String> contentsList = new ArrayList<String>();
		
		try {
			Scanner inputFile = new Scanner(this.file);

			while (inputFile.hasNext()) {
				for (String word : inputFile.nextLine().replaceAll("\\p{Punct}", "").split(" ", 0)) {
					contentsList.add(word);
				}
			}

		} catch (Exception error) {
			System.out.println("[-]\t" + error.getMessage());
			System.exit(-1);
		}

		return contentsList;
	}
}