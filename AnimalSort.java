import java.util.List;

public class AnimalSort {
	
	public static void main(String[] args) {
		
		//new AnimalSort().run();
		
		List<Animal> animal1 = methodRefSort();
		List<Animal> animal2 = lambdaSort();
		System.out.println(animal1);
		System.out.println(animal2);
		
	}
	
	private static List<Animal> methodRefSort() {
		List<Animal> refAnimal = Animal.getAnimal();
		refAnimal.sort(Animal::compare);
		return refAnimal;
	}
	
	private static List<Animal> lambdaSort(){
		List<Animal> lambdaAnimal = Animal.getAnimal();
		lambdaAnimal.sort((a1, a2) -> Animal.compare(a1, a2));
		return lambdaAnimal;
	}
	

	
}
