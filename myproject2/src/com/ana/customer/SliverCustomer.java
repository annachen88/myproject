package com.ana.customer;

public class SliverCustomer extends Customer {

	public SliverCustomer(int amount) {
		super(amount);
<<<<<<< HEAD
		super.discount=0.1f;;
		
	}
	@Override
	public void print(){
		int total=(int)(amount*(1-discount));
		System.out.println("原價:"+amount+"	"+"打折後:"+total);
	}
}
=======
		super.discount = 0.1f;
		

	}

	
}
>>>>>>> fd466c0b51181984dbb1e840e068cb4032e86e9c
