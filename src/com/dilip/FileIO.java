package com.dilip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		String[] names = { "joss", "dilip", "vinod" };

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("writting to a file");
			writer.write("\nwritting to a file");

			for (String name : names) {
				writer.write("\n" + name);
			}
			writer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
