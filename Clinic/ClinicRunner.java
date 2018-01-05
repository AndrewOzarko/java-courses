/**
* Для запуску клініки
* @Author Andrew Ozarko
*/
import java.util.ArrayList;

public class ClinicRunner {
	public static void main(String[] args) {
		Clinic clinic = new Clinic(3);
		
		clinic.addClient(0, new Client("Deily", new Dog(new Pet("Aroko"))));
		clinic.addClient(1, new Client("Sunny", new Cat(new Pet("Aroko"))));
		clinic.addClient(2, new Client("Dekster", new CatDog(new Cat(new Pet("Bakster")), new Dog(new Pet("McKonel") ))));
		clinic.showDateBase();
		
		ArrayList<Client> search = clinic.findClientsByPetName("Aroko");
		
		System.out.println("Search result: ");
		
		if (!search.isEmpty()) {
			for (Client result : search) {
				System.out.println("Client name: " + result.getId());
			}
		} else {
			System.out.println("No clients...");
		}
	}
}