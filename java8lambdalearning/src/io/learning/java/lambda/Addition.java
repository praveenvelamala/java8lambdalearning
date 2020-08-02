package io.learning.java.lambda;

public class Addition {

	
	public static void main(String args[]) {
	MyLambda additionLambda = (int a, int b) -> a+b;
	
		
	}
	
}

interface MyLambda{
	int additionLambda(int a , int b);
}