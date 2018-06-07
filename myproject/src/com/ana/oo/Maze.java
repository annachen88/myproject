package com.ana.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Maze {

	

	public void on() {
		try {
			FileReader read = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
			String[] taken = line.split(",");
			int a = Integer.parseInt(taken[0]);
			int b = Integer.parseInt(taken[1]);
			line = in.readLine();
			int trap = Integer.parseInt(line);
			line = in.readLine();
			String[] move = line.split(",");
			for (int i = 0; i < move.length; i++) {
				//System.out.println(Integer.parseInt(move[i]));
				
				switch(Integer.parseInt(move[i])) {
				case 2:
					
					
				case 4:
					
				case 6:
					
				case 8:
					
					
				}
			}
			//產生的空地、陷阱
			Set list = new HashSet<>();
			/*for (int i = 1; i <= a * b; i++) {
				list.add(i);
			}*/
			//for(int i =0;i<(list.size()=5);i++) {
			while(list.size()<5) {
			Random random = new Random();
			int maze =random.nextInt(a*b)+1;
			list.add(maze);		
			}
			System.out.println("陷阱："+list);			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
