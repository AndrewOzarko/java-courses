/**
* Клас описує Кото-Пса
* @Author Andrew Ozarko
*/
public class CatDog implements iPet{

    private final iPet cat;
    private final iPet dog;

    public CatDog(final iPet cat, final iPet dog) {
        this.cat = cat;
        this.dog = dog;
    }
	
	@Override
	public void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();
    }
	
	@Override
	public String getName() {
        return String.format("%s%s", this.cat.getName(), this.dog.getName());
    }
	
	@Override
	public void setName(final String name) {
        this.cat.setName(name);
        this.dog.setName(name);

    }
}
