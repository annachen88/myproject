package com.ana.oo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class BingoMain {
/*
 * 讀取bingo.txt
 * 25
 * 8,4,7,18,21,3,5,1,9,10
 * 
 * 25表示有5X5 25顆球 產生時亂數印出
 * 5 6 7 8 9 10
 * 1 2 3 4 8 11
 * 
 * */
	public BingoMain(){
		try {
			FileReader read = new FileReader("bingo.txt");
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

	}

}
