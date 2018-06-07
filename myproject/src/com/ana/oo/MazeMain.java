package com.ana.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeMain {
	public MazeMain() {
		try {
			FileReader read = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
			String[] token = line.split(",");
			int a = Integer.parseInt(token[0]);
			int b = Integer.parseInt(token[1]);
			line = in.readLine();
			int trap = Integer.parseInt(line);
			line = in.readLine();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

	}

}
