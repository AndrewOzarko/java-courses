/**
* Клас описує клієнта
* @Author Andrew Ozarko
*/
public class Client {
	private String id;
	private iPet pet;
	
	/**
	* Конструктор
	*/
	public Client(String id, iPet pet) {
		this.id = id;
		this.pet = pet;
	}
	
	public String getId() {
        return id;
    }
    public void setId(String newId){
        this.id = newId;
    }

    public iPet getPet() {
        return pet;
    }
}