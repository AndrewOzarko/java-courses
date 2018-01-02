import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				
				System.out.println("Enter first: ");
				String first = reader.next();
				System.out.println("Enter second: ");
				String second = reader.next();
				System.out.println("Enter operation: ");
				
				System.out.println("1. + ");
				System.out.println("2. - ");
				System.out.println("3. * ");
				System.out.println("4. / ");
				
				switch (Integer.valueOf(reader.next())) {
					1:
						calc.sum(Integer.valueOf(left), Integer.valueOf(right));
						break;
					2:
						break;
					3:
						break;
					4:
						break;
				}
				
				System.out.println("Result:" + calc.getResult());
				System.out.println("Save numbers ? (yes/no)");
				
				if (reader.next() == "no") {
					calc.cleanNumbers();
				}
				
				System.out.println("Exit?(yes/no)");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}