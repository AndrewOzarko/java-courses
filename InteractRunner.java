import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			String save = "no";
			String first = "0";
			String second = "0";
			while (!exit.equals("yes")) {
	
				if (save.equals("no")) {
					System.out.println("Enter first: ");
					first = reader.next();
					System.out.println("Enter second: ");
					second = reader.next();
					System.out.println("Enter operation: ");
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
				}
				
				System.out.println("1. + ");
				System.out.println("2. - ");
				System.out.println("3. * ");
				System.out.println("4. / ");
				
				switch (Integer.valueOf(reader.next())) {
					case 1:
						calc.sum();
						break;
					case 2:
						calc.substract();
						break;
					case 3:
						calc.multiple();
						break;
					case 4:
						calc.div();
						break;
				}
				
				System.out.println("Result:" + calc.getResult());
				
				System.out.println("Save numbers ? (yes/no)");
				save = reader.next();
				
				if (save.equals("no")) {
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