package com.qa.ChickAndRabbit;

public class Runner{

public void ChickAndRabbit (int heads, int legs) {
boolean solution =false;
for (int i=0; i<=heads; i++) {
	int r = heads -i;
	int c= i; 
	if ((r * 4 + c *2)==legs) {
		System.out.println("rabbit:" + r);
		System.out.println("chicken" + c);
		solution= true;
	}
}
if (solution == false) {
	System.out.println("no solution found");
}
}
}
