package calculator.operations;

public class Division {

	int a = 0;
	int b = 0;
	
	public void setA(int input) {
		this.a = input;
	}
	
	public void setB(int input) {
		this.b = input;
	}
	
	public float getResult() {
		float result = (float)this.a / (float)this.b;
		return result;
	}
}
