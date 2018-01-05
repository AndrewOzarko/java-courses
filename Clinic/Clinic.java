/**
* Клас описує клініку
* @Author Andrew Ozarko
*/
import java.util.ArrayList;

public class Clinic {
	
	/**
	* Список клієнтів 
	*/
	private final Client[] clients;	
	
	/**
	* Конструктор
	*/
	public Clinic(final int size) {
		this.clients = new Client[size];
	}
	
	/**
	* Додати клієнта
	*/
	public void addClient(final int position, final Client client) {
		this.clients[position] = client;
	}
	
	/**
	* Пошук клієнтів по імені тварини
	* @params name - ім*я тварини
	* Повертає пустий ArrayList якщо тварин немає
	*/
	public ArrayList<Client> findClientsByPetName(final String name) {
		ArrayList<Client> result = new ArrayList<>();
		for (Client client : this.clients) {
			if (name.equals(client.getPet().getName())) {
				result.add(client);
			}
		}
		return result;
	}
	
	/**
	* Відобразити клієнтів
	*/
	public void showDateBase() {
		for (Client client : this.clients) {
			System.out.println("Name: " + client.getId() + " Pet name: " + client.getPet().getName());
		}
	}
}