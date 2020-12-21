package calculator;

import java.util.Scanner;

import calculator.operations.Addition;
import calculator.operations.Subtraction;
import calculator.operations.Multiplication;
import calculator.operations.Division;

public class Interface {

	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input first number (integer value): ");
		int numA = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Input second number (integer value): ");
		int numB = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Choose an operation and press enter twice (add, subtract, multiply, divide): ");
		String operation = scanner.nextLine();
		scanner.nextLine();
		
		float result = 0;
		
		if(operation.equals("add")) {
			Addition add = new Addition();
			add.setA(numA);
			add.setB(numB);
			result = add.getResult();
		} else if(operation.equals("subtract")) {
			Subtraction subtract = new Subtraction();
			subtract.setA(numA);
			subtract.setB(numB);
			result = subtract.getResult();
		} else if(operation.equals("multiply")) {
			Multiplication multiply = new Multiplication();
			multiply.setA(numA);
			multiply.setB(numB);
			result = multiply.getResult();
		} else if(operation.equals("divide")) {
			Division divide = new Division();
			divide.setA(numA);
			divide.setB(numB);
			result = divide.getResult();
		}
		
		System.out.println("The result is!");
		System.out.println(result);
	}
}
