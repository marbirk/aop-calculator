package de.birkhahn.swt;

public aspect Calculator {
	pointcut calculation() : execution(* Main.setOperation(..));
	
	after() returning() : calculation() {
		float first = Main.getFirstNumber();
		float second = Main.getSecondNumber();
		String operation = Main.getOperation();
		switch (operation) {
			case "+":
				float sum = first + second;
				Main.getResultString(first, second, operation, sum);
				Main.getEmptyReturn();
				break;
			case "-":
				float diff = first - second;
				Main.getResultString(first, second, operation, diff);
				Main.getEmptyReturn();
				break;
			case "*":
				float prod = first * second;
				Main.getResultString(first, second, operation, prod);
				Main.getEmptyReturn();
				break;
			case "/":
				float quot = first / second;
				Main.getResultString(first, second, operation, quot);
				Main.getEmptyReturn();
				break;
			default:
				System.out.println("Operation nicht zulässig!");
		}
	}
}
