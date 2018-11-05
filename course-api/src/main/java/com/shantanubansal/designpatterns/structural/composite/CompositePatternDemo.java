package com.shantanubansal.designpatterns.structural.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {

		Worker CEO = new Worker("Shantanu", "CEO", 99999);
		Worker headSales = new Worker("A", "Head Sales", 90000);
		Worker headMarketing = new Worker("B", "Head Marketing", 90000);
		Worker clerk1 = new Worker("C", "Clerk", 10);
		Worker clerk2 = new Worker("D", "Clerk", 10);
		Worker clerk3 = new Worker("E", "Clerk", 10);
		
		Worker salesE = new Worker("C", "Sales", 20);
		Worker salesE2 = new Worker("D", "Sales", 20);
		Worker salesE3 = new Worker("E", "Sales", 20);
		
		CEO.addJunior(headMarketing);
		CEO.addJunior(headSales);
		

		headMarketing.addJunior(clerk1);
		headMarketing.addJunior(clerk2);
		headMarketing.addJunior(clerk3);
		
		headSales.addJunior(salesE);
		headSales.addJunior(salesE2);
		headSales.addJunior(salesE3);
		
		System.out.println(CEO);
		
		for(Worker w : CEO.getJuniors()) {
			System.out.println(w);
			for(Worker wks : w.getJuniors())
				System.out.println(wks);
		}
		
	}

}
