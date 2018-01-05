/**
* Клас описує кота
* @Author Andrew Ozarko
*/
public class Cat implements iPet{
	private final Pet pet;
	
	public Cat(Pet pet){
		this.pet = pet;
	}
	
	@Override
	public void makeSound() {
		this.pet.makeSound();
		System.out.print("Міу Міу");
	}
	
	@Override
	public String getName(){
		return this.pet.getName();
	}
	
	@Override
	public void setName(final String name){
		this.pet.setName(name);
	}
}