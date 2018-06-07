package com.ana.oo;

import java.util.Map;
import java.util.TreeMap;

public class MazeDirection {

	int position = 0;
	int hp = 100;

	public MazeDirection(int position, int hp) {
		this.hp = hp;
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
