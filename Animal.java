import java.util.ArrayList;
import java.util.List;

public class Animal {
	
	private String name;
	
	private static List<Animal> animals = List.of(new Animal("Tiger"), new Animal("Lion"), new Animal("Lemur"), new Animal("Penguin"));
	
	public Animal(String name) {
		this.name = name;
	}
    public String toString() {
    	return name + " Animal";
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public static int compare(Animal a1, Animal a2) {
		return a1.name.compareTo(a2.name);
		
		
	}
	
	public static List<Animal> getAnimal(){
		return new ArrayList<>(animals);
	}
}
