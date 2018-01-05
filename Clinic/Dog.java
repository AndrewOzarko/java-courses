/**
* Клас описує собаку
* @Author Andrew Ozarko
*/
public class Dog implements iPet{
	private final iPet pet;
	
	public Dog(Pet pet){
		this.pet = pet;
	}
	
	@Override
	public void makeSound() {
		this.pet.makeSound();
		System.out.print("Гав Гав");
	}
	
	@Override
	public String getName(){
		return this.pet.getName();
	}
	
	@Override
	public void setName(final String name) {
		this.pet.setName(name);
	}
}