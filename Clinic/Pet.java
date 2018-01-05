/**
* Клас описує домашню тварину
* @Author Andrew Ozarko
*/
public class Pet implements iPet {
	private String name;
	
	public Pet(final String name) {
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println(this.name + " say: ");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
}