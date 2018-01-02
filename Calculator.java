public class Calculator {
	int result;
	int left;
	int right;
	
	public void add (int... params) {
		this.left = params[0];
		this.right = params[1];
	}
	
	public void sum () {
		this.result = this.left + this.right;
	}
	
	public void substract () {
		this.result = this.left - this.right;
	}
	
	public void multiple () {
		this.result = this.left * this.right;
	}
	
	public void div () {
		this.result = this.left / this.right;
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void cleanResult() {
		this.result = 0;
	}
	
	public void cleanNumbers() {
		this.left = 0;
		this.right = 0;
	}
}