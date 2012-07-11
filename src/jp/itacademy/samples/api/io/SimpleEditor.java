package jp.itacademy.samples.api.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleEditor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		try (PrintWriter writer = new PrintWriter(
				"C:/Users/itacademy/output.txt")) {
			while (in.hasNextLine()) {
				writer.println(in.nextLine());

			}
		} catch (IOException e) {
			System.out.println("ファイルを開けませんでした");
		}
	}
}
