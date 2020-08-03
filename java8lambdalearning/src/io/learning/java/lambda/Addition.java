package io.learning.java.lambda;

public class Addition {

	
	public static void main(String args[]) {
	MyLambda additionLambda = (int a, int b) -> a+b;
	MyLambda subtraction = (int a, int b) -> a-b;
		//Addition and substraction
	}
	
}

interface MyLambda{
	int additionLambda(int a , int b);
}