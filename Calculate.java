public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		
		System.out.println("Sum: " + (first + second));
		System.out.println("Subtraction: " + (first - second));
		System.out.println("Multiplication: " + (first * second));
		System.out.println("Division: " + (first / second));
		System.out.println("sqr first: " + (first * first));
		System.out.println("sqr second: " + (second * second));
	}
}