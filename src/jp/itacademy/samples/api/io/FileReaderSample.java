package jp.itacademy.samples.api.io;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {
	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"C:/Users/itacademy/input.txt"))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);

			}

		}

	}
}
