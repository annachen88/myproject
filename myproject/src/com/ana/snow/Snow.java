package com.ana.snow;

import java.util.Random;

public class Snow extends Thread {
<<<<<<< HEAD
	Random random = new Random();
	int x;
	int y = 800;
	public Snow(){
		x = random.nextInt(600);
		this.y = y;	
	}
	
	@Override
	public void run() {
	  for(int i=800;i>0;i--){
//		  System.out.println(getName()+"("+x+","+y+")");
		  y=y-1;
		  x=x-(random.nextInt(3)-1);
		  System.out.print(new String(new char[x]).replace("\0"," "));
		  System.out.println("o");
	  }
	}

	
}
=======
	int x;
	int y = 800;
	Random random = new Random();

	public Snow() {
		x = random.nextInt(600) + 1;
	}

	@Override
	public void run() {
		for (int i = 800; i > 0; i--) {
			//System.out.println(getName() + "(" + x + " " + y + ")");
			y = y - 1;
			int movement = random.nextInt(3) - 1;
			x = x - movement;
			System.out.println(new String(new char[x]).replace(" ", " "));
			System.out.println("o");
		}
	}

}
>>>>>>> 148c01786eefd7ee0971451f4463326a93f16eb4
