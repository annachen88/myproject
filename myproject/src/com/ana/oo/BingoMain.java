package com.ana.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BingoMain {
	/*
	 * 讀取bingo.txt 25 8,4,7,18,21,3,5,1,9,10
	 * 
	 * 25表示有5X5 25顆球 產生時亂數印出 5 6 7 8 9 10 1 2 3 4 8 11
	 * 
	 */
	public BingoMain() {
		
	}
	 
	public void BingoPrint() {
		try {
			FileReader read = new FileReader("bingo.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
			int a =Integer.parseInt(line);
			int b =(int) Math.sqrt(a);
			 System.out.println(b);
			//加入數字
			List<Integer> bingo = new ArrayList<>();
			for (int i = 1; i <= a; i++) {
				bingo.add(i);
			}
			for(int i=1;i<=a;i++) {
			System.out.print(bingo.get(i-1)+"	");
			if(i%b==0) {
				System.out.println();
			}
			}
			//int b;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		BingoMain bingo = new BingoMain();
		bingo.BingoPrint();
	}

}
