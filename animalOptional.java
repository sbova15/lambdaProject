import java.util.NoSuchElementException;
import java.util.Optional;

public class animalOptional {
public static void main(String[] args) {
		
		Animal animal = animalMethod(Optional.of(new Animal("Beautiful")));
		System.out.println(animal);
		try {
		animalMethod(Optional.empty());

	}catch (NoSuchElementException e) {
		System.out.println(e.getMessage());
	}
} 
	
	
	public static Animal animalMethod(Optional<Animal> optionalAnimal) {
		return optionalAnimal.orElseThrow(()-> new NoSuchElementException("Animal does not exist."));
	}




}
